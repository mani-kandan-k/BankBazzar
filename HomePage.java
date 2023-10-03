package com.bankBazzar;
import java.util.Scanner;

public class HomePage extends BankBazzar
{
    static Scanner sc = new Scanner(System.in);
    
    static boolean didSignup = false;
    //static boolean didLogin = false;
    static int loginId;
    static String loginPwd;
    static int signupId;
    static String signupPwd;
    
    
    static void login()
    {
        
        if (didSignup == true)
        {
            System.out.println("\n* * * * * LOGIN * * * * *\n");
            System.out.print("Enter your User ID : ");
            loginId = sc.nextInt();
            //loginId = userLoginId;
            System.out.print("Enter your Password : ");
            loginPwd = sc.next();
            //loginPwd = userLoginPwd;
            
            if(signupId == loginId && signupPwd.equals(loginPwd))
            {
                System.out.println("• • • • •  Login successful • • • • •");
                //didLogin = true;
                LoanPage.loanPage();
            }
            else
            {
                if(signupId != loginId && signupPwd == loginPwd)
                {
                System.out.println("• • • • • Incorrect User ID • • • • •");
                }
            
                else if(signupPwd == loginPwd && signupId != loginId)
                {
                System.out.println("• • • • • Incorrect Password • • • • •");
                }
                else//(signupPwd == loginPwd && signupId != loginId)
                {
                System.out.println("• • • • • Incorrect ID and Password • • • • •");
                }
                
            }
        }
        else
        {
            System.out.println("\n* * * * * LOGIN * * * * *\n");
            System.out.print("Enter your User ID : ");
            int demo1 = sc.nextInt();
            //loginId = userLoginId;
            System.out.print("Enter your Password : ");
            String demo2 = sc.next();
            System.out.println("\n• • • • • User ID not found • • • • •\nRedirecting to Signup page");
            signup();
        }
    }
    
    
    static void signup()
    {
        System.out.println("\n* * * * * SIGNUP * * * * *\n");
        System.out.print("Create a User ID : ");
        signupId = sc.nextInt();
        //int userSignupId = (int)((phone/100000)*(phone%10));
        System.out.print("Enter your Password : ");
        signupPwd = sc.next();
        //BankBazzarDriver.signupId = userSignupId;
        //BankBazzarDriver.signupPwd = userSignupPwd;
        //System.out.println("Your Account has been created successfully");
        didSignup = true;
        System.out.println("\t• • • • • • • • • •\n\tAccount created Successfully\n\t• • • • • • • • • •");
        System.out.println("\nRedirecting you to Login page\n");
        login();
    }
    
    
    static BankBazzar b = new BankBazzar();
    static HomePage h = new HomePage();
    
    //static Scanner sc = new Scanner(System.in);
    
    
    static void homePage()
    {
        boolean repeat = true;
        do
        {
            System.out.println("\n***** BANK  BAZZAR *****");
            System.out.println("\n1) Signup\n2) Login\n3) Exit\n");
            System.out.print("Enter your choise : ");
            int option = sc.nextInt();
        switch(option)
        {
            case 1:
            {
                signup();
                break;
            }
            
            case 2:
            {
                login();
                break;
            }
            
            
            
            case 3:
            {
                System.out.println("• • • • • EXIT • • • • •");
                repeat = false;
                break;
            }
            
            default :
            {
                System.out.println("Invalid option");
                break;
            }
        }
        }while(repeat);
    }
    
    static void loanPage()
    {
        
        boolean repeat = true;
        
        do{
        System.out.println("\n* * * * * BANK BAZZAR * * * * *");
        System.out.println("\n1) Loan category\n2) Visa loan\n3) Debit/Credit card loan\n4) Exit");
        int loanOption = sc.nextInt();
        
        switch(loanOption)
        {
            case 1 :
            {
                b.loan();
                break;
            }
            
            case 2 :
            {
                b.visa();
                break;
            }
            
            case 3 :
            {
                b.cards();
                break;
            }
            
            case 4 :
            {
                System.out.println("\n* * * * * EXIT * * * * *");
                repeat = false;
                break;
            }
            
            default :
            {
                System.out.println("Invalid option\n");
            }
        }
            
        }while(repeat); 
    }
    
}