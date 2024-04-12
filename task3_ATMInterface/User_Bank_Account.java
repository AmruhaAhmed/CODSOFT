import java.util.*;
class User_Bank_Account
{
    Scanner ob=new Scanner(System.in);
    float acc_bal;//account balance
    User_Bank_Account(float balance)//constructor to initialize global  variable acc_bal
    {
        acc_bal=balance;
    }
    float check_balance()//checks account balance
    {
        return acc_bal;
    }
    float withdraw_amt(float amount)//withdraws amount and returns account balance
    {
        if(amount>=acc_bal)
        return -1;
        else
        {
          acc_bal-=amount;
        return acc_bal;
    }
    }
    float deposit_amt(float amount)//deposits amount and returns account balance
    {
        acc_bal+=amount;
        return acc_bal;
    }
}
