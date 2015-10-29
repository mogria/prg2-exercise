/* Copyright 2015 Hochschule Luzern - Technik & Architektur */
package age_SW6_Exception;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Peter Sollberger (peter.sollberger@hslu.ch)
 */
public final class AddressBook {

    private final List<AddressEntry> addresses;

    public AddressBook() {
        addresses = new ArrayList<>();
    }

    public void addEntry(final String firstName, final String lastName, final int zip, String email) throws IllegalArgumentException, InvalidEmailAddressException {

        if (firstName == null || containsNumbers(firstName) || firstName.length() > 20 || firstName.equals(lastName) || String.valueOf(zip).length() != 4) {
            throw new IllegalArgumentException();
        }
        if (!validateEmail(email)) {
            throw new InvalidEmailAddressException(email);
        }

        addresses.add(new AddressEntry(firstName, lastName, zip));
    }

    private boolean containsNumbers(String s) {
        Pattern p = Pattern.compile(".*\\d.*");
        // Pattern for the numbers 0..9
        return p.matcher(s).find();
    }

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    /**
     *
     * @param emailStr
     * @return
     */
    public static boolean validateEmail(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    /**
     * Get the number of addresses in the book.
     *
     * @return Size.
     */
    public int size() {
        return addresses.size();
    }

    /**
     * Get the address entry at the specified position.
     *
     * @param index zero based index
     * @return Address entry at the specified position according the sort order.
     */
    public AddressEntry getAt(final int index) {
        return addresses.get(index);
    }

    /**
     * Sorts the address list according the natural order.
     */
    public void sort() {
        addresses.sort(null);
    }

    /**
     * Sorts the addresses according the rules of the comparator.
     *
     * @param coparator Defines sort order.
     */
    public void sort(final Comparator<AddressEntry> coparator) {
        addresses.sort(coparator);
    }

    public static void main(String[] args) {
        final AddressBook book = new AddressBook();
        try {

            book.addEntry("Hans", "Muster", 6049, "testtest.ch");
            book.addEntry("Fritz", "Meier", 6049, "test@test.ch");
        } catch (InvalidEmailAddressException ex) {
            System.out.println(ex.getMessage());
        }

        for (int i = 0; i < book.size(); i++) {
            final AddressEntry e = book.getAt(i);
            System.out.printf("%d: %s, %s, %d\n", i, e.getLastName(), e.getFistName(), e.getZip());
        }
    }
}
