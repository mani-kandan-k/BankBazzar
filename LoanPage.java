package com.bankBazzar;
import java.util.Scanner;

public class LoanPage extends BankBazzar
{
    static Scanner sc = new Scanner(System.in);
    
    static void loanPage()
    {
        BankBazzar b = new BankBazzar();
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