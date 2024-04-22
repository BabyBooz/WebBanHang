/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0055;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Validate {
    private static final Scanner sc = new Scanner(System.in);
    
    private static int checkInputLimit(int min, int max){
        while (true) {            
            try {
                int res = Integer.parseInt(sc.nextLine().trim());
                if(res < min || res > max){
                    throw new NumberFormatException();
                }
                return res;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in range "+ min + ", " + max );
                System.out.println("Enter again:");
            }
        }
    }
    
    public static String checkInputString(){
        while (true) {            
            String res = sc.nextLine().trim();
           if(res.isEmpty()){
               System.err.println("Not empty!");
               System.out.println("Enter again :");
           }
           else
               return res;
        }
    }
    public static int checkInputInt(){
        while (true) {            
            try {
                int res = Integer.parseInt(sc.nextLine().trim());
                return res;
            } catch (NumberFormatException e) {
                System.err.println("Please input an integer");
                System.out.println("Enter again");
            }
        }
    }
    public static boolean checkInputYN(){
        while (true) {            
            String res = checkInputString();
            if(res.equalsIgnoreCase("Y")){
                return true;
            }
            if(res.equalsIgnoreCase("N")){
                return false;
            }
            System.err.println("Please input Y(y) or N(n)");
            System.out.println("Enter again;");
        }
    }
    public static boolean checkCode(ArrayList<Doctor> id, String code){
        for (Doctor doctor : id) {
            if(code.equalsIgnoreCase(doctor.getCode())){
                return false;
            }
        }
        return true;
    }
    public static boolean checkDuplicate(ArrayList<Doctor> id, String code, String name, String specialization, int availibilty){
        for (Doctor doctor : id) {
            if(code.equalsIgnoreCase(doctor.getCode()) && name.equalsIgnoreCase(doctor.getName()) && specialization.equalsIgnoreCase(doctor.getSpecialization()) && availibilty == doctor.getAvailability()){
                return false;
            }
        }
        return true;
    }
    public static boolean checkChangeInfo(Doctor doctor, String code, String name , String specialization, int availibility){
        if(doctor.getCode().equalsIgnoreCase(code) && doctor.getName().equalsIgnoreCase(name) && specialization.equalsIgnoreCase(doctor.getSpecialization()) && availibility == doctor.getAvailability()){
            return false;
        }
        return true;
    }
    
}
