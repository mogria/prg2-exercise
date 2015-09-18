package ch.hslu.prg2.containers;

import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @author mogria
 * @param <T> Type of objects the linked list should hold
 */
public class LinkedList<T> implements Iterable<T> {
    
    class LinkedListEnumeration<T> implements Enumeration<T> {

        private LinkedList<T> list;
        
        private ListNode<T> nextNode;
        
        public LinkedListEnumeration(LinkedList<T> list) {
            nextNode = list.head;
        }

        @Override
        public boolean hasMoreElements() {
            return nextNode != null;
        }

        @Override
        public T nextElement() {
            T value = nextNode.value;
            nextNode = nextNode.next;
            return value;
        }
        
        public ListNode<T> getNextNode() {
            return nextNode;
        }
        
        public LinkedList<T> getList() {
            return list;
        }
    
    }
    
    class LinkedListIterator<T> implements Iterator<T> {
        
        LinkedListEnumeration<T> enumeration;
        ListNode<T> current;
        ListNode<T> previous;
        public LinkedListIterator(LinkedList<T> list) {
            enumeration = new LinkedListEnumeration<>(list);
            current = previous = null;
        }
        
        @Override
        public boolean hasNext() {
            return enumeration.hasMoreElements();
        }

        @Override
        public T next() {
            previous = current;
            current = enumeration.getNextNode();
            return enumeration.nextElement();
        }

        @Override
        public void remove() {
            if(previous != null) {
                previous.setNext(enumeration.getNextNode());
                current = previous;
            } else {
                enumeration.getList().head = current.getNext();
            }
            
        }
        
    }
    
    class ListNode<T> {
        private T value;
        private ListNode next;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }
    
    ListNode head = null;
    ListNode tail = null;
    
    public LinkedList() {
        
    }
    
    public void append(T value) {
        ListNode node = new ListNode();
        if(tail == null) {
            head = tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }       
        
    
    public void remove(T value) {
        Iterator<T> iterator = iterator();
        while(iterator.hasNext()) {
            T current = iterator.next();
            if(current == value) iterator.remove();
        }
    }
    
    public boolean contains(T value) {
        for(T current : this) {
            if(current == value) {
                return true;
            }
        }
        return false;
    }
    
    
    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<>(this);
    }
}
