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
public class Storeroom_Farsi {
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
       System.out.println("1)ثبت کالا");   
       System.out.println("2)خارج کردن کالا");
       System.out.println("3)نمایش کلا های موجود");
       System.out.println("4)جستوجوی کالا");
       System.out.println("5)خروج از برنامه");
       System.out.print(":"+"لطفا یک گزینه را انتخاب کنید");
       
       
   }
   public static void Registration_of_goods(String []name,int []tadad, int code_kala, Scanner input){
       System.out.println("---------------------------------------------------");
       System.out.println("تعداد کالایی که اکنون قصد ثبت آن را دارید وارد کنید");    
       int Registration_number=input.nextInt();
       for (int i = 0; i < Registration_number; i++) {
            code_kala++;
           System.out.println(" نام کالای "+ code_kala +" راوارد کنید ");
            name[i]=input.next();
             System.out.println("تعداد کالا را وارد کنید");      
           tadad[i]=input.nextInt();
           
           System.out.println("کد این کالا در انبار:"+code_kala);
       }
 
       
   }
   public static void Take_out_the_goods(String []name,int []tadad, int code_kala, Scanner input){
       System.out.println("---------------------------------------------------");
       System.out.println("کد کالایی که قصد خروج از انبار را دارد وارد کنید");  
       int Get_the_code=input.nextInt();
       Get_the_code=Get_the_code-1;
       System.out.println("قصد خروج چه تعداد از این کالارا دارید"); 
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
       System.out.println("سرچ بر اساس نام کالا)1");
       System.out.println("سرچ بر اساس کد کالا)2");
       int result=input.nextInt();
       switch(result){
        case 1:
            System.out.println("نام کالا را وارد کنید");
            String getname=input.next();
            for (int i = 0; i < name.length; i++) {
                if (name[i].equals(getname)==true) {
                    System.out.println("name:"+name[i]);
                    System.out.println("tadad:"+tadad[i]);
                    
                 int  codekali=i+1;
                    System.out.println("کد کالا در انبار"+codekali);
                    break;
                }
            }
            
            
        case 2:
            System.out.println("کد کالا را وارد کنید");
            int get_cod_kala=input.nextInt();
            System.out.println("name :"+name[get_cod_kala-1]);
            System.out.println("tadad :"+tadad[get_cod_kala-1]);
            
            break;
       }
       
   }
   
}




