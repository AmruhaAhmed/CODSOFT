import java.util.*;
class ATM_Control
{
    Scanner ob=new Scanner(System.in);
    void main()
    {//creating objects for User_Bank_Account and ATM classes
        User_Bank_Account uba=new User_Bank_Account(30000);
        ATM atm=new ATM(uba);
        atm.choice();
    }
}
