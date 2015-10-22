package db_sw6;

import java.util.Objects;
import java.util.regex.Pattern;

/**
 * Holds address relevant fields of one person.
 * Person are equals if they have the same names and the same ZIP code.
 * @author ???
 */
public final class AddressEntry implements Comparable<AddressEntry> {
    private String fistName;
    private String lastName;    
    private int zip;
    private String city;
    private String phone;
    private String eMail;

    /**
     *
     * @param fistName
     * @param lastName
     * @param zip
     * @param eMail
     * @throws IllegalArgumentException
     * @throws InvalidEmailException
     */
    public AddressEntry(String fistName, String lastName, int zip, String eMail) throws IllegalArgumentException, InvalidEmailException{
        
        if(fistName == null || containsNumbers(fistName) || fistName.length() > 20 || lastName == fistName || String.valueOf(zip).length() != 4){
            throw new IllegalArgumentException("Illegal Argument", null);
        }
        if(!eMail.contains("@")){
            throw new InvalidEmailException("Illegal Email-Address");
        }
        
        
        this.fistName = fistName;
        this.lastName = lastName;
        this.zip = zip;
        this.eMail = eMail;
        
        
    }

    /**
     * Get the value of fistName.
     * @return the value of fistName
     */
    public String getFistName() {
        return fistName;
    }

    /**
     * Get the value of lastName.
     * @return the value of lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Get the value of zip.
     * @return the value of zip
     */
    public int getZip() {
        return zip;
    }

    /**
     * Get the value of city.
     * @return the value of city
     */
    public String getCity() {
        return city;
    }    

    /**
     * Get the value of phone
     * @return the value of phone
     */
    public String getPhone() {
        return phone;
    }

    private boolean containsNumbers(String s) {
        Pattern p = Pattern.compile(".*\\d.*");   
        return p.matcher(s).find(); 
    }
    
    /**
     * Get the value of eMail
     *
     * @return the value of eMail
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.fistName);
        hash = 53 * hash + Objects.hashCode(this.lastName);
        hash = 53 * hash + this.zip;
        return hash;
    }
    
    /**
     * 
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AddressEntry other = (AddressEntry) obj;
        if (!Objects.equals(this.fistName, other.fistName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (this.zip != other.zip) {
            return false;
        }
        return true;
    }

    /**
     * 
     * @param o
     * @return 
     */
    @Override
    public int compareTo(AddressEntry o) {
        if(this.lastName.compareTo(o.getLastName()) != 0){
            return o.getLastName().compareTo(this.lastName);
        }
        else if(this.fistName.compareTo(o.getFistName()) != 0){
            return o.getFistName().compareTo(this.fistName);
        }
        else {
            return this.zip - o.getZip();
        }
    }
    
    /**
     * 
     * @param o
     * @return 
     */
    public int compareToSpecial(AddressEntry o){
        return this.phone.compareTo(o.getPhone());
    }
    
    

}
