/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pkg1_selfhomework;

import java.util.Scanner;


public class Main {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BaseStation baseStation=new BaseStation();
        String senderName,recipientName,message;
        System.out.println("Welcome If you want to send a message, continue. \nIf you don't want to send a message, please write \"end\". ");
        do {
        System.out.println("Please write the sender's name:");
        senderName=sc.nextLine();
            if (senderName.equalsIgnoreCase("end")) {
                break;
            }
        System.out.println("Please write the recipient's name:");
        recipientName=sc.nextLine();

        Person person1=new Person(senderName,new MobilePhone(null,baseStation));
        Person person2 = new Person(recipientName, new MobilePhone(null, baseStation));

        person1.getMobilePhone().setOwner(person1);
        person2.getMobilePhone().setOwner(person2);
        System.out.println("Please write Message:");
        message=sc.nextLine();
        
        System.out.println("SMS sending begins...");
        person1.sendSMS(person2, message);
        System.out.println("SMS sending completed.");
    } while (!senderName.equalsIgnoreCase("end"));
    }


}
