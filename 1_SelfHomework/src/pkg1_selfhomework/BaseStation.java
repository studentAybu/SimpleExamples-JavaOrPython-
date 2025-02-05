/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1_selfhomework;

/**
 *
 * @author Macbook
 */
public class BaseStation {
    
    public BaseStation() {
    }
 
    public void transmitSMS(MobilePhone senderPhone,MobilePhone receiverPhone, String message){
        System.out.println("message is being transmitted ");
        receiverPhone.receiveSMS(message);
    
    }
    
    
    
}
