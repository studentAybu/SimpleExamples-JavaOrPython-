/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1_selfhomework;

/**
 *
 * @author Macbook
 */
public class MobilePhone {
    private Person owner;
    private BaseStation baseStation;


    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public MobilePhone(Person owner, BaseStation baseStation) {
        this.owner = owner;
        this.baseStation = baseStation;
    }
    
    public void sendSMS(MobilePhone receiverPhone,String message){
        baseStation.transmitSMS(owner.getMobilePhone(),receiverPhone,message);
    }
    public void receiveSMS(String message){
        System.out.println(this.owner.getName() + " received a new message: " + message);
    }
}
