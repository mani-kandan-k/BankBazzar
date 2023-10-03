package com.bankBazzar;
import java.util.Scanner;

class BankBazzar implements Bank
{
    static Scanner sc = new Scanner(System.in); 
    
    @Override
    public void citizenship(long aadhar, String cname)
    {
        System.out.println("Aadhar number : "+aadhar);
        System.out.println("Customer Name : "+cname);
    }
    
    public static void checkEligiblity()
    {
        System.out.println("\nEnter your Account Number : ");
        long accNo = sc.nextLong();
        System.out.println("\nEnter your PAN Number : ");
        String panNo = sc.next();
        
        if(accNo%2==0)
        {
            System.out.println("\nYou are eligible for loan");
        }
        else
        {
            System.out.println("\nYou are not eligible for loan");
        }
    }
    
    public static void checkCardEligiblity()
    {
        System.out.println("\nEnter your Card Number : ");
        long cardNo = sc.nextLong();
        //System.out.println("\nEnter Card holder name : ");
        //String name = sc.next();
        System.out.println("\nEnter your CVV Number : ");
        int cvv = sc.nextInt();
        
        if(cvv>999 || cvv<100)
        {
            System.out.println("Invalid CVV Number \n\nCVV number should be exactly 3 digits");
            checkCardEligiblity();
        }
        else
        {
            if(cvv%2==0)
            {
                System.out.println("Your CIBIL Score is low \n\n\t  × × × × ×\nYour card is not eligible for Loan\n\t  × × × × ×");
            }
            else
            {
                System.out.println("\t  $ $ $ $ $\nYour card is eligible for loan\n\t  $ $ $ $ $");
            }
        }
    }
    
    public void loan()
    {
        
        
        System.out.println("\nProcessing.....\nSelect your Loan type\n");
        System.out.println("1) Personal Loan\n2) Home Loan\n3) Vehicle Loan\n4) Educational Loan \n5) Exit");
        int option = sc.nextInt();
        switch(option)
        {
            case 1 :
            {
                System.out.println("~~~~~ Personal Loan Details ~~~~~\n\nInterest Rate - 10.25% p.a.\nLoan Amount - Up to Rs.1 crore\nLoan Tenure -	Up to 6 years");
                checkEligiblity();
                break;
            }
            
            case 2 :
            {
                System.out.println("~~~~~ Home Loan Details ~~~~~\n\nInterest Rate - 9.15% p.a. to 12.95% p.a.\nLoan Amount - Based on eligiblity\nLoan Tenure -	Up to 30 years");
                checkEligiblity();
                break;
            }
            
            case 3 :
            {
                System.out.println("~~~~~ Vehicle Loan Details ~~~~~\n\nInterest Rate - 8.95% p.a. \nLoan Amount - Up to Rs.10 crore\nLoan Tenure -	84 Months");
                checkEligiblity();
                break;
            }
            
            case 4 :
            {
                System.out.println("~~~~~ Educational Loan Details ~~~~~\n\nInterest Rate - 11.5% p.a. \nLoan Amount - Up to Rs.7.5 Lakhs \nConcession - 0.50% concession in interest for girl students");
                checkEligiblity();
                break;
            }
            
            case 5 :
            {
                System.out.println("\nEXIT");
                break;
            }
            
            default :
            {
                System.out.println("\n\t***** Invalid option *****");
            }
        }
    }
    
    public void visa()
    {
        System.out.println("\nProcessing.....\n\nSelect your Visa type\n");
        System.out.println("1) Business visa\n2) Employment Visa\n3) Tourist Visa\n4) Exit");
        int option = sc.nextInt();
        switch(option)
        {
            case 1 :
            {
                System.out.println("~~~~~ Business visa Details ~~~~~\n\nVisiting for a business purpose ");
                
                break;
            }
            
            case 2 :
            {
                System.out.println("~~~~~ Employment visa Details ~~~~~\n\nHighly skilled Individuals intending to take up employment");
                
                break;
            }
            
            case 3 :
            {
                System.out.println("~~~~~ Tourist visa Details ~~~~~\n\nVisiting for a business purpose");
                break;
            }
            
            case 4 :
            {
                System.out.println("\n\t***** EXIT *****");
                break;
            }
            
            default :
            {
                System.out.println("\n\t***** Invalid option *****");
            }
        }
    }
    
    public void cards()
    {
        System.out.println("\nProcessing.....\nSelect your Card\n");
        System.out.println("1) Debit card \n2) Credit card\n3) Exit");
        int option = sc.nextInt();
        switch(option)
        {
            case 1 :
            {
                System.out.println("~~~~~  Debit card Loan  ~~~~~\n");
                checkCardEligiblity();
                break;
            }
            
            case 2 :
            {
                System.out.println("~~~~~ Debit card Loan ~~~~~(\n");
                checkCardEligiblity();
                break;
            }
            
            case 3 :
            {
                System.out.println("\n\t***** EXIT *****");
                break;
            }
            
            default :
            {
                System.out.println("\n\t***** Invalid option *****");
            }
        }
    }
    
    
}