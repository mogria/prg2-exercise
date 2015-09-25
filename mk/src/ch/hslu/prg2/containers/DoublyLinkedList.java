package ch.hslu.prg2.containers;

import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @author mogria
 * @param <T> Type of objects the linked list should hold
 */
public class DoublyLinkedList<T> implements Iterable<T> {
    
        class DoublyLinkedListEnumeration<T> implements Enumeration<T> {

        private DoublyLinkedList<T> list;
        
        private DoublyLinkedList<T>.ListNode<T> nextNode;
        
        public DoublyLinkedListEnumeration(DoublyLinkedList<T> list) {
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
        
        public DoublyLinkedList<T>.ListNode<T> getNextNode() {
            return nextNode;
        }
        
        public DoublyLinkedList<T> getList() {
            return list;
        }
    
    }
    
    class DoublyLinkedListIterator<T> implements Iterator<T> {
        
        DoublyLinkedListEnumeration<T> enumeration;
        DoublyLinkedList<T>.ListNode<T> current;
        public DoublyLinkedListIterator(DoublyLinkedList<T> list) {
            enumeration = new DoublyLinkedListEnumeration<>(list);
            current =  null;
        }
        
        @Override
        public boolean hasNext() {
            return enumeration.hasMoreElements();
        }

        @Override
        public T next() {
            current = enumeration.getNextNode();
            return enumeration.nextElement();
        }

        @Override
        public void remove() {
            if(current.getPrevious() != null) {
                current.getPrevious().setNext(enumeration.getNextNode());
                current.getNext().setPrevious(current.getPrevious());
                current = current.getPrevious();
            } else {
                current.getNext().setPrevious(current);
                enumeration.getList().head = current.getNext();
            }
            
        }
        
    }
    
    class ListNode<T> {
        private T value;
        private ListNode<T> next;
        private ListNode<T> previous;

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
        
        public ListNode<T> getPrevious() {
            return previous;
        }

        public void setPrevious(ListNode<T> previous) {
            this.previous = previous;
        }
        
        @Override
        public boolean equals(Object other) {
            ListNode<T> otherListNode = (ListNode<T>) other;
            if(otherListNode != null) {
                return this.value.equals(otherListNode.getValue());
            } else {
                return false;
            }
        }
    }
    
    ListNode head = null;
    ListNode tail = null;
    
    public DoublyLinkedList() {
        
    }
    
    private ListNode<T> getNode(int index) {
        ListNode<T> current = head;
        while(index > 0) {
            if(current == null) throw new ArrayIndexOutOfBoundsException("not enough elements in list");
            current = current.next;
            index--;
        }
        return current;
    }
    
    public T get(int index) {
        ListNode<T> node = getNode(index);
        if(node == null) throw new ArrayIndexOutOfBoundsException("not enough elements in list");
        return node.getValue();
    }
    
    public void insert(int index, T value) {
        ListNode<T> insertBefore = getNode(index);
        if(insertBefore == null) {
            append(value);
        } else {
            ListNode node = new ListNode();
            node.setValue(value);
            if(insertBefore.previous != null) insertBefore.previous.next = node;
            node.previous = insertBefore.previous;
            node.next = insertBefore;
            insertBefore.previous = node;
                    
        }
    }     
    
    public void append(T value) {
        ListNode node = new ListNode();
        if(head == null && tail == null)  {
            tail = head = node;
        } else {
            // insert at tail
            tail.next = node;
            node.previous = tail;
        }
    }
        
    
    public void remove(T value) {
        Iterator<T> iterator = iterator();
        while(iterator.hasNext()) {
            T current = iterator.next();
            if(current.equals(value)) iterator.remove();
        }
    }
    
    public boolean contains(T value) {
        for(T current : this) {
            if(current.equals(value)) {
                return true;
            }
        }
        return false;
    }
    
    public Iterator<T> iterator() {
        return new DoublyLinkedListIterator<T>(this);
    }
}
