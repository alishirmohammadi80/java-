/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse.management;

import java.util.Scanner;

/**
 *
 * @author ali
 */
public class login_Farsi {
    public static void main(String[] args) {
        
   
        Scanner input=new Scanner(System.in);
        System.out.println("---------------------------------------------------");
        System.out.println("ثبت نام");
        System.out.println("لطفا یک نام کاربری انتخاب کنید");
      String user_name=input.next();
        System.out.println("لطفا یک کلمه عبور انتخاب کنید");  
      String Password=input.next();
        System.out.println("----------------------------------------------------"); 
        System.out.println("نام کاربری");
     String Get_username=input.next();
        System.out.println("کلمه عبور");
     String Get_password=input.next();
        boolean equals = Get_username.equalsIgnoreCase(user_name);
        boolean equals1 = Get_password.equalsIgnoreCase(Password);
        if (equals==true &&equals1==true) {
            System.out.println("شما با موفقیت وارد شدید");  
        }
        else{
            System.out.println("نام کار بری یا کلمه عبور اشتباه است");
            
        }
      
}
}