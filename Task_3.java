import java.util.Scanner;

class Task_3
{
 
  public static void main(String Abhi[])
  {
    System.out.println("Please insert your card...\n");

    /* LOGIN PAGE */

    System.out.print("Enter your PIN:");
    Scanner s=new Scanner(System.in);

    int a=s.nextInt();
    do 
    {
    if(a==1234)
    {
      System.out.println("\nWelcome Abhishek...");

      System.out.print("\n 1. Transaction History \n 2. Withdraw\n 3. Deposite\n 4. Transfer\n 5. Quit\n\n Please enter your choise :");
      
      int ch=s.nextInt();

      switch(ch)
      {
        // Transaction History
        case 1: ;
        System.out.println("Rupees 300 send through UPI PRN 123408423 on 12/03/2023");
        System.out.println("Rupees 200 withdraw through ATM on 18/04/2023");

        break;

       // withdraw 
        case 2: System.out.println("Please enter Amount :");
        int amt=s.nextInt();

        
        int balance=10000;

        
          if(amt>balance)
          {
             System.out.println(" You do not Have Sufficient Amount...Please try again...");
             break;
          }
          
          System.out.print("Do you want recipt (y/n):");
          String rpt=s.next();
          if (rpt.equalsIgnoreCase("y"))
          {
          System.out.println("\nPlease wait while your transaction is being procced....");
          
          int bal=balance-amt;
          System.out.println("\nYour Balance is "+bal+" Rupees...");

          System.out.println("\nPlease Collect your Card....\n");
          }
        
        else 
        {
          System.out.println("\nPlease wait while your transaction is being procced....");
         
          int bal=balance-amt;
          System.out.println("\nYour Balance is "+bal+" Rupees...");

          System.out.println("\nPlease Collect your Card....\n");
        }
        break;

        // Deposite
        case 3: ;
        System.out.println(" Deposite rupees 15000 on 2/05/2023 \n Deposite rupees 5000 on 16/05/2023 ");
        break;

        // Transfer 
        case 4: ;
        System.out.println("Rupees 5000 Debited by UPI PRN 1412343 on 18/03/2023 \nRupees 6000 Debited by UPI PRN 4567002 on 23/04/2023 \nRupees 5600 Debited by UPI PRN 768934 on 14/07/2023 ");
        break;

        // Quit
        case 5: ;
        System.out.println("Thank You...");
        break;
      }
      
      break;
    }
   
    else if(a==4567)
    {
      System.out.println("Welcome Raj...");
      System.out.print("\n 1. Transaction History \n 2. Withdraw\n 3. Deposite\n 4. Transfer\n 5. Quit\n\n Please enter your choise :");
      
      int ch=s.nextInt();

      switch(ch)
      {
        // Transaction History
        case 1: ;
        System.out.println("Rupees 300 send through UPI PRN 123408423 on 12/03/2023");
        System.out.println("Rupees 200 withdraw through ATM on 18/04/2023");

        break;

       // withdraw 
        case 2: System.out.println("Please enter Amount :");
        int amt=s.nextInt();

        
        int balance=15000;

        
          if(amt>balance)
          {
             System.out.println(" You do not Have Sufficient Amount...Please try again...");
             break;
          }
          
          System.out.print("Do you want recipt (y/n):");
          String rpt=s.next();
          if (rpt.equalsIgnoreCase("y"))
          {
          System.out.println("\nPlease wait while your transaction is being procced....");
          
          int bal=balance-amt;
          System.out.println("\nYour Balance is "+bal+" Rupees...");

          System.out.println("\nPlease Collect your Card....\n");
          }
        
        else 
        {
          System.out.println("\nPlease wait while your transaction is being procced....");
         
          int bal=balance-amt;
          System.out.println("\nYour Balance is "+bal+" Rupees...");

          System.out.println("\nPlease Collect your Card....\n");
        }
        break;

        // Deposite
        case 3: ;
        System.out.println(" Deposite rupees 15000 on 2/05/2023 \n Deposite rupees 5000 on 16/05/2023 ");
        break;

        // Transfer 
        case 4: ;
        System.out.println("Rupees 5000 Debited by UPI PRN 1412343 on 18/03/2023 \nRupees 6000 Debited by UPI PRN 4567002 on 23/04/2023 \nRupees 5600 Debited by UPI PRN 768934 on 14/07/2023 ");
        break;

        // Quit
        case 5: ;
        System.out.println("Thank You...");
        break;
      }
      break;
    }

    else if(a==1233)
    {
      System.out.println("Welcome Sham...");
      System.out.print("\n 1. Transaction History \n 2. Withdraw\n 3. Deposite\n 4. Transfer\n 5. Quit\n\n Please enter your choise :");
      
      int ch=s.nextInt();

      switch(ch)
      {
        // Transaction History
        case 1: ;
        System.out.println("Rupees 300 send through UPI PRN 123408423 on 12/03/2023");
        System.out.println("Rupees 200 withdraw through ATM on 18/04/2023");

        break;

       // withdraw 
        case 2: System.out.println("Please enter Amount :");
        int amt=s.nextInt();

        
        int balance=100000;

        
          if(amt>balance)
          {
             System.out.println(" You do not Have Sufficient Amount...Please try again...");
             break;
          }
          
          System.out.print("Do you want recipt (y/n):");
          String rpt=s.next();
          if (rpt.equalsIgnoreCase("y"))
          {
          System.out.println("\nPlease wait while your transaction is being procced....");
          
          int bal=balance-amt;
          System.out.println("\nYour Balance is "+bal+" Rupees...");

          System.out.println("\nPlease Collect your Card....\n");
          }
        
        else 
        {
          System.out.println("\nPlease wait while your transaction is being procced....");
         
          int bal=balance-amt;
          System.out.println("\nYour Balance is "+bal+" Rupees...");

          System.out.println("\nPlease Collect your Card....\n");
        }
        break;

        // Deposite
        case 3: ;
        System.out.println(" Deposite rupees 15000 on 2/05/2023 \n Deposite rupees 5000 on 16/05/2023 ");
        break;

        // Transfer 
        case 4: ;
        System.out.println("Rupees 5000 Debited by UPI PRN 1412343 on 18/03/2023 \nRupees 6000 Debited by UPI PRN 4567002 on 23/04/2023 \nRupees 5600 Debited by UPI PRN 768934 on 14/07/2023 ");
        break;

        // Quit
        case 5: ;
        System.out.println("Thank You...");
        break;
      }
      break;
    }

    else
    { 
      
      System.out.println( ". Re-enter your PIN... (You can only Re-enter your Pin in Maximum 10 times...!)");
      a=s.nextInt();
      
    }
  }

  while(true);
  }
}