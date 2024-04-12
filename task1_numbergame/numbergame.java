import java.util.*;
class task1_numbergame
{
    Scanner ob=new Scanner(System.in);//help in accepting user input
    Random rand=new Random();//object used to generate random numbers
    void instructions()//displays important instructions of the game
    {
        System.out.println("THE NUMBER GAME");
        System.out.println("Instructions:");
        System.out.println("______________________________");
        System.out.println("1. User has 5 attempts to guess the number lying between 0 and 100 correctly");
        System.out.println("2. User can play any number of rounds as he/she desires");
        System.out.println("3. User can move to the next round by entering YES , otherwise enter NO");
        System.out.println("______________________________");
        System.out.println("Let's Begin The Game");
        System.out.println("______________________________");
    }    
    int game_logic()//contains the logic of the game
    {
        int n=rand.nextInt(100);//stores a random number between 0 to 100
        int i,guess=0;//i-loop counter and number of attempts, guess=user's guess
        int flag=0;//flag to check whether guess is matching n or not
        for(i=1;i<=5;i++)
        {
            System.out.print("Enter your guess:");
            guess=ob.nextInt();
            if(guess==n)
            {
                System.out.println("Congrats!You have won the game in "+i+" attempts");
                flag=1;
                break;
            }
            else if(guess>n)            
            System.out.println(" Your guess "+ guess+" is too high");
            else if(guess<n)
            System.out.println(" Your guess "+ guess+"  is too low");  
            else
            System.out.println("Your guess "+guess+" doesnt lie in the range");            
            
        }
        if(flag==0)
        {
            System.out.println("Sorry, You have lost the game!");
            System.out.println("The number was "+ n);
        }
        return flag;
    }
    void main()
    {
        instructions();
        int round=1;//stores the count of rounds
        int ctr=0;//stores the count of rounds won by the user
        String next_round="YES";
        do
        {
            System.out.println("_____________________ROUND"+round+"_____________________");
            int flag=game_logic();//stores the value returned by game_logic()
            if(flag==1)
            ctr++;
            System.out.println("You have won "+ctr+" rounds out of"+round);
            System.out.println("Enter YES if you wish to continue else NO:");
            next_round=ob.next();
            round++;
        }while(next_round.equals("YES"));
        System.out.println("_____________________THE GAME ENDS_____________________");
    }
}

        
            
            
            
        
        
