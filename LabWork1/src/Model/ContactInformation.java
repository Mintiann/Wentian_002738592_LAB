/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author hp
 */
public class ContactInformation {
    String officePhone;
    String officeEmailID;
    String personalPhone;
    String personalEmailID;
    
    public ContactInformation(){
        this.officePhone="";
        this.officeEmailID="";
        this.personalPhone="";
        this.personalEmailID="";
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getOfficeEmailID() {
        return officeEmailID;
    }

    public void setOfficeEmailID(String officeEmailID) {
        this.officeEmailID = officeEmailID;
    }

    public String getPersonalPhone() {
        return personalPhone;
    }

    public void setPersonalPhone(String personalPhone) {
        this.personalPhone = personalPhone;
    }

    public String getPersonalEmailID() {
        return personalEmailID;
    }

    public void setPersonalEmailID(String personalEmailID) {
        this.personalEmailID = personalEmailID;
    }
    
    
    
}
