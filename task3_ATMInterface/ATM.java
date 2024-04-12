import java.util.*;
class ATM
{
    Scanner ob=new Scanner(System.in);
    User_Bank_Account acc;//object of User_Bank_Account class
    ATM(User_Bank_Account uba)
    { 
        acc=uba;
    }        
    void choice()
    {
        int ch;//choice
        float res=0;//stores the balance amount
        float amt1=0;//amount to be withdrawn
        float amt2=0;//amount to be deposited
        String response="YES";//stores YES/NO entered by the user for continuation
        System.out.println("_____________________________________");
        System.out.println("__________Welcome to the ATM_________");
        System.out.println("_____________________________________");
        do
        {
        System.out.println("Select from the options given below");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw Amount from Account");
        System.out.println("3. Deposit Amount into Account");
        System.out.print("Enter Choice:");
        ch=ob.nextInt();        
        switch(ch)
        {
            case 1://checking account balance
            res=acc.check_balance();
            System.out.println("The account balance is "+res);
            break;
            case 2:// withdrawing amount from the account
            System.out.print("Enter amount to be withdrawn:");
            amt1=ob.nextFloat();
            res=acc.withdraw_amt(amt1);
            if(res==-1)
            {
            System.out.println("Amount cannnot be withdrawn");
            }
            else
            {
            System.out.println("Amount of "+amt1+" has been withdrawn successfully");
            System.out.println("Current Balance is "+res);
            }
            break;
            case 3://deposit amount into account
            System.out.print("Enter amount to be deposited:");
            amt2=ob.nextFloat();
            res=acc.deposit_amt(amt2);
            System.out.println("Amount of "+amt2+" has been deposited successfully");
            System.out.println("Current Balance is "+res);
            break;
            default:
            System.out.println("Wrong Option Chosen");
        }
        System.out.print("Type YES if you wish to continue else type NO:");
        response=ob.next();        
    }while(response.equals("YES"));
    System.out.println("__________Thank You!Visit Again!_________");
}
}

        
