/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author emi
 */
public class Address {
    String currentstreetName;
    String permanentstreetName;
    String currentaptNo;
    String permanentaptNo;
    String currentzipCode;
    String permanentzipCode;
    String currentCity;
    String permanentCity;
    
    public Address(){
        this.currentstreetName="";
        this.permanentstreetName="";
        this.currentaptNo="";
    }
    
    
    public String getCurrentStreetName() {
        return currentstreetName;
    }

    public void setCurrentStreetName(String currentstreetName) {
        this.currentstreetName = currentstreetName;
    }
    
    public String getPermanentStreetName() {
        return permanentstreetName;
    }

    public void setPermanentStreetName(String permanentstreetName) {
        this.permanentstreetName = permanentstreetName;
    }

    public String getCurrentaptNo() {
        return currentaptNo;
    }

    public void setCurrentaptNo(String currentaptNo) {
        this.currentaptNo = currentaptNo;
    }

    public String getPermanentaptNo() {
        return permanentaptNo;
    }

    public void setPermanentaptNo(String permanentaptNo) {
        this.permanentaptNo = permanentaptNo;
    }

    public String getCurrentzipCode() {
        return currentzipCode;
    }

    public void setCurrentzipCode(String currentzipCode) {
        this.currentzipCode = currentzipCode;
    }

    public String getPermanentzipCode() {
        return permanentzipCode;
    }

    public void setPermanentzipCode(String permanentzipCode) {
        this.permanentzipCode = permanentzipCode;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public String getPermanentCity() {
        return permanentCity;
    }

    public void setPermanentCity(String permanentCity) {
        this.permanentCity = permanentCity;
    }
    
    
    

}
