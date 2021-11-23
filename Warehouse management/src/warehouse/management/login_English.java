
package warehouse.management;

import java.util.Scanner;

/**
 *
 * @author ali
 */
public class login_English {
   public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("---------------------------------------------------");
        System.out.println("enrollment");
        System.out.println("Please select a username");
      String name_karbar=input.next();
        System.out.println("Please select a password");  
      String kalame_obor=input.next();
        System.out.println("----------------------------------------------------"); 
        System.out.println("user name");
     String karbar_name=input.next();
        System.out.println("Password");
     String obor_kalame=input.next();
        boolean equals = karbar_name.equalsIgnoreCase(name_karbar);
        boolean equals1 = obor_kalame.equalsIgnoreCase(kalame_obor);
        if (equals==true &&equals1==true) {
            System.out.println("You have been logged in successfully");  
        }
        else{
            System.out.println("Wrong username or password");
        }  
}
}