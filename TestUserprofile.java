/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;
import java.util.*;
/**
 *
 * @author murri
 */
public class TestUserprofile {
    public static void main(String[] args){
    String a="";
    String b="";
    UserProfile userProfile= new UserProfile(a,b);
    
    Scanner sc=new Scanner(System.in);
     Scanner sc1=new Scanner(System.in);
    System.out.print("Enter your name");
    a=sc.nextLine();
    System.out.print("Enter the genre");
    b=sc1.nextLine();    
    System.out.print("Your userProfile was created as "+userProfile);
    
    }
}
