import java.util.Locale;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.*;
public class Bill {
    //global variable declared

    static int lprice,mprice,aprice,price;
    static float amount;
    static Scanner sc=new Scanner(System.in);
    //main method starts here
    public static void main(String[] args) {
        // brief description about product
        System.out.println("Welcome to our Shop :");
        System.out.println("Items are listed below---");
        System.out.println("Laptops    Mobiles   A.Cs");

        //jump to menu function 
        menu();
    }

    // function to know the prices of product
    public static void price()
    {
        System.out.println("Price of laptop :");
         lprice=55000;
        System.out.println(lprice);
        System.out.println("Price of Mobile :");
         mprice=20000;
        System.out.println(mprice);
        System.out.println("Price of A.C :");
         aprice=35000;
        System.out.println(aprice);
        System.out.println("Do you want to purchase : (Y/N) ");
        String ch=sc.next();
        if(ch.equalsIgnoreCase("Y"))
        {
            purchase();
        }
        else 
        {
            //to exit from program
            exit();
        }
        
    }
    //function to select different function from menu
    static void menu()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("choice any : ");
        System.out.println("1 > To know the price : ");
        System.out.println("2 > To purchase the items : ");
        System.out.println("3 > Exit : ");
        int choice=sc.nextInt();
        //switch case to choose from the below option
        switch(choice)
        {
            case 1:
            price();
            break;

            case 2:
            purchase();
            break;

            case 3:
            exit();
            break;

            default:
            System.out.println("invalid choice  :");
        
        }
    }
    static void exit()
    {
        System.out.println("Thanks for visiting !! Come again");
    }
    //function for purchasing product and billing of product
        static void purchase()
        {
            System.out.println("Have you check the price first : (Y/N)");
            String choi=sc.next();
            if(choi.equalsIgnoreCase("Y"))
            {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your name : ");
        String name=sc.nextLine();
        System.out.println("Enter product name : ");
        String prName=sc.nextLine();
        //checking the condition,if matches then only it run if statement otherwise else statement will run
        if(prName.equalsIgnoreCase("Laptop"))
        {
             System.out.println("Enter Quantity :");
             int qun=sc.nextInt();
             price=lprice*qun;
             System.out.println("Price of "+ prName +" :"+price);
             System.out.println("Rate of Tax in "+prName+" = 10%");
             float rate=(price*10)/100;
              amount=price+rate;
              System.out.println("Customer name : "+name);
            System.out.println("Product Purchase name : "+prName);
            System.out.println("Quantity of product : "+qun);
             System.out.println("Total amount :"+amount);
             System.out.print("Purchase date : ");
             //Here,Locale class is used to select different language and country 
             Locale locale =  Locale.of("hi","IN");
             getDate(locale);
             getCurrency(locale);
        }
        //checking the condition,if matches then only it run else-if statement otherwise else statement will run
        else if(prName.equalsIgnoreCase("Mobile"))
        {
            System.out.println("Customer name : "+name);
            System.out.println("Price of "+ prName +" :"+price);
             System.out.println("Enter Quantity :");
             int qun=sc.nextInt();
             price=lprice*qun;
             System.out.println("Price of Mobile : "+price);
             System.out.println("Rate of Tax in "+prName+"= 5%");
             float rate=(price*5)/100;
             amount=price+rate;
             System.out.println("Customer name : "+name);
            System.out.println("Product Purchase name : "+prName);
            System.out.println("Quantity of product : "+qun);
             System.out.println("Total amount :"+amount);
             System.out.print("Purchase date : ");
             Locale locale =  Locale.of("hi","IN");
             getDate(locale);
             getCurrency(locale);
        }
        //checking the condition,if matches then only it run else-if statement otherwise else statement will run
        else if(prName.equalsIgnoreCase("A.C"))
        {
            
             System.out.println("Enter Quantity :");
             int qun=sc.nextInt();
             price=lprice*qun;
             System.out.println("Price of "+ prName +" :"+price);
             System.out.println("Rate of Tax in "+prName+"= 8%");
             float rate=(price*8)/100;
              amount=price+rate;
              System.out.println("Customer name : "+name);
            System.out.println("Product Purchase name : "+prName);
            System.out.println("Quantity of product : "+qun);
             System.out.println("Total amount :"+amount);
             System.out.print("Purchase date : ");
             Locale locale =  Locale.of("hi","IN");
             getDate(locale);
             getCurrency(locale);
        }
    }
    else
    {
        price();
    }
        menu();
    }
    //function to get the present date using DateFormat of selected country and language using Locale class
    static void getDate(Locale locale)
    {
        Date d=new Date();
        DateFormat dtf=DateFormat.getDateInstance(DateFormat.FULL,locale);
        System.out.println(dtf.format(d));
    }
    //function to get the currency of selected country using Locale class
    static void getCurrency(Locale locale)
    {
        NumberFormat nfr=NumberFormat.getCurrencyInstance(locale);
        System.out.println("Amount in Dollar : "+" "+nfr.format(amount));
    }
    
}
    

