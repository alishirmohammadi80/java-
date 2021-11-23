
package warehouse.management;

import java.util.Scanner;

/**
 *
 * @author ali
 */
public class Storeroom_English {
     public static void main(String[] args) { 
     Scanner input=new Scanner(System.in);
        int Warehouse_capacity=10;
        String []name=new String[ Warehouse_capacity];
        int []tadad=new int[Warehouse_capacity];
        int code_kala=0;
        boolean ran_menu=true;
        do {            
            show_menu();
            int Result=input.nextInt();
            switch(Result){
            case 1:
               Registration_of_goods(name, tadad, code_kala, input);
                break;
             case 2:
                Take_out_the_goods(name, tadad, code_kala, input);
                 break;
             case 3:
                 Show_goods(name, tadad, code_kala, input);
                 break;
             case 4:
                Search_for_goods(name, tadad, code_kala, input);
                 break;
             case 5:
               ran_menu=false; 
                
                
            }
            
        } while (ran_menu);
        
        
        
        
    }
   public static void show_menu(){
       System.out.println("---------------------------------------------------");
       System.out.println("1)Registration of goods");   
       System.out.println("2)Take out the goods");
       System.out.println("3)Show available goods");
       System.out.println("4)Search for goods");
       System.out.println("5)Exit the app");
       System.out.print("Please select an option :"); 
       
   }
   public static void Registration_of_goods(String []name,int []tadad, int code_kala, Scanner input){
        System.out.println("---------------------------------------------------");
       System.out.println("Enter the number of items you now intend to register");    
       int Registration_number=input.nextInt();
       for (int i = 0; i < Registration_number; i++) {
           code_kala++;
           System.out.println("Enter the goods name "+code_kala);
            name[i]=input.next();
             System.out.println("Enter the number of goods");      
           tadad[i]=input.nextInt();
           
           System.out.println("Code of this goods in Store:"+code_kala);
       }
 
       
   }
   public static void Take_out_the_goods(String []name,int []tadad, int code_kala, Scanner input){
        System.out.println("---------------------------------------------------");
       System.out.println("Enter the goods code that intends to leave the warehouse");  
       int Get_the_code=input.nextInt();
       Get_the_code=Get_the_code-1;
       System.out.println("How many of these goods do you intend to export?"); 
       int Number_of_exits=input.nextInt();
       tadad[Get_the_code]=tadad[Get_the_code]-Number_of_exits;  
      
       
       
   }
   public static void Show_goods(String []name,int []tadad, int code_kala, Scanner input){
       for (int i = 0; i < name.length; i++) {
           if (name[i]!=null) {
               
           
            System.out.println("---------------------------------------------------");
           System.out.println("name :"+name[i]);  
           System.out.println("tadad :"+tadad[i]);
           } 
//           break;
           
       }
        
       
   } 
   public static void Search_for_goods (String []name,int []tadad, int code_kala, Scanner input){
        System.out.println("---------------------------------------------------");
       System.out.println("1)Search by goods name");
       System.out.println("2)Search by goods code");
       int result=input.nextInt();
       switch(result){
        case 1:
            System.out.println("Enter the goods name");
            String getname=input.next();
            for (int i = 0; i < name.length; i++) {
                if (name[i].equals(getname)==true) {
                    System.out.println("name:"+name[i]);
                    System.out.println("tadad:"+tadad[i]);
                    
                 int  codekali=i+1;
                    System.out.println("Commodity code in storerome :"+codekali);
                    break;
                }
            }
            
            
        case 2:
            System.out.println("Enter the goods code");
            int get_cod_kala=input.nextInt();
            System.out.println("name :"+name[get_cod_kala-1]);
            System.out.println("tadad :"+tadad[get_cod_kala-1]);
            
            break;
       }
       
   }
   
}
