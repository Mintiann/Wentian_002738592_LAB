/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author emi
 */
public class Person {
    private String firstName;
    private String lastName;
    private String nuID;
    private String collegeName;
    Address address;
    ContactInformation contactInformation;
    
    public Person(){
        this.firstName = "";
        this.lastName = "";
        this.nuID = "";
        this.collegeName = "";
        this.address = new Address();
        this.contactInformation = new ContactInformation();
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNuID() {
        return nuID;
    }

    public void setNuID(String nuID) {
        this.nuID = nuID;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    
    
    public void setAddress(Address address){
        this.address= address;
    }
        
    public Address getAddress(){
        return address;
    }
    
     public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }
    
    
    
    
    
    
    
//    public static void main(String args[]){
//        Person obj = new Person();
//        obj.setFirstName("Emily");
//        Address address = obj.getAddress();  
//    }

   
}
