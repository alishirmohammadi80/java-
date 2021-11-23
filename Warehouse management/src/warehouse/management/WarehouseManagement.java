
package warehouse.management;
import java.util.Scanner;
/**
 *
 * @author ali
 */
public class WarehouseManagement {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      Run_the_menu();
     int Result=input.nextInt();
     switch(Result){
        
    case 1:
    login_English Object1=new login_English();
    login_English.main(args);
    Storeroom_English object1=new Storeroom_English();
    Storeroom_English.main(args);
    
     case 2:
     login_Farsi Object2=new login_Farsi();
     login_Farsi.main(args);
     Storeroom_Farsi object2=new Storeroom_Farsi();
     Storeroom_Farsi.main(args);
         
     } 
      
      
        
    }
    public static void Run_the_menu(){
        
         System.out.println("Welcome to the warehouse management program"); 
        System.out.println("به برنامه مدیریت انبار خوش آمدید");
        System.out.println("---------------------------------------------------");
        System.out.println("Please select your language");
        System.out.println("لطفا زبان خود را انتخاب کنید");
        System.out.println("---------------------------------------------------");
        System.out.println("1)English");
         System.out.println("2)Farsi");
        System.out.print("Please select an option :");
      
    }
}
