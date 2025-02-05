/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1_selfhomework;

/**
 *
 * @author Macbook
 */
public class Person {
    private String name;
    private MobilePhone mobilePhone;

    public void setMobilePhone(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    
    public Person(String name, MobilePhone mobilePhone) {
        this.name = name;
        this.mobilePhone = mobilePhone;
    }

    public String getName() {
        return name;
    }

    public MobilePhone getMobilePhone() {
        return mobilePhone;
    }
    
    public void sendSMS(Person person,String message){
       sendSMS(person,person.getMobilePhone(),message);
   
    }
    public void sendSMS(Person person, MobilePhone mobilePhone,String message){
        mobilePhone.sendSMS(person.getMobilePhone(), message);
   
    }
    
    
    
    
}
