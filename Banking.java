import java.lang.*;
import java.util.*;
class Banking_System extends AssertionError
{
   public static long num=10000000;
    public static void debit()
    {   long n;
        System.out.println("Enter  Amount of money you are debiting");
      Scanner sc=new Scanner(System.in);  
        n=sc.nextLong();
        num+=n;
        System.out.println("After Debiting "+n+" Total Amount: "+num);

    }
    public static void credit()
    {
        System.out.println("Enter the Amount You are Withdrawing");
        Scanner sc=new Scanner(System.in);
        long y=sc.nextLong();
        if(y>num)
       { System.out.println("You cant Withdraw the Amount More than Available balance");
          throw new AssertionError("Exceeded the Available Balance BY"+(y-num));
    }

    num-=y;
    System.out.println("Withdrawed : "+y+"remaining : "+num);
    }
    public static void CheckBal()
    {
        System.out.println("Available balance:"+num);
    }

    public static void main(String[] args) {
       int x=0;
       System.out.println("'1' to debit");
       System.out.println("'2' for credit");
       System.out.println("'3' to checkBalance");
       System.out.println("'4' To ExIT/Close the Account");
       Scanner sc=new Scanner(System.in);
      // System.out.println("Enter the number" );
       //x=sc.nextInt();
      do
        {
            System.out.println("Enter the number ( only 1-4 (Strictly)" );
            x=sc.nextInt();
            switch (x) {
                case 1:
                    debit();
                    break;
                    case 2:
                    try{
                    credit();
                    }
                    catch(AssertionError e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                    case 3:
                    CheckBal();
                    break;
                    case 4:
                    System.out.println("Account Has beeen closed");
                    return ;
                default:
                    throw new AssertionError();
            }
        }while(x<5);
    }
}
