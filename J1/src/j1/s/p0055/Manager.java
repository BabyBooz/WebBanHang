/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0055;

import java.util.ArrayList;


/**
 *
 * @author DELL
 */
public class Manager {
    public static int menu(){
        System.out.println("1. Add doctor");
        System.out.println("2. Update doctor");
        System.out.println("3. Delete doctor");
        System.out.println("4. Search doctor");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validate.checkInputInt();
        return choice;
    }
    
    public static void addDoctor(ArrayList<Doctor> id){
        System.out.println("Enter code :");
        String code = Validate.checkInputString();
        if(!Validate.checkCode(id, code)){
            System.err.println("Doctor code existed !");
            return;
        }
        System.out.println("Enter name :");
        String name = Validate.checkInputString();
        System.out.println("Enter specialization: ");
        String specialization = Validate.checkInputString();
        System.out.println("Enter availability :");
        int availability = Validate.checkInputInt();
        
        if(!Validate.checkDuplicate(id, code, name, specialization, availability)){
            System.err.println("Duplicated!");
            return;
        }
        id.add(new Doctor(code, name, specialization, availability));
        System.out.println("Added !");
    }
     public static Doctor getCode(ArrayList <Doctor> id, String code){
        for (Doctor doctor : id) {
            if(doctor.getCode().equalsIgnoreCase(code)){
                return doctor;
            }
        }
        return null;
     }

    public static void updateDoctor(ArrayList<Doctor> id){
        System.out.println("Enter code :");
        String code = Validate.checkInputString();
        
        if(Validate.checkCode(id, code)){
            System.err.println("Not found");
            return;
    }
        System.out.println("Enter code: ");
        String codeUpdate = Validate.checkInputString();
        Doctor doc = getCode(id, code);
        System.out.println("Enter name: ");
        String name = Validate.checkInputString();
        System.out.println("Enter specialization: ");
        String specialization = Validate.checkInputString();
        System.out.println("Enter availability: ");
        int availability = Validate.checkInputInt();
        if(!Validate.checkChangeInfo(doc, code, name, specialization, availability)){
            System.err.println("No change!");
            return;
        }
        
    }
    
}
