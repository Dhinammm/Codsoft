import java.util.*;
public class ATM {
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        System.out.println("Welcome to Dhinakaran ATM\nEnter initial balance");
        int bal=x.nextInt();
        int ch=9;
        while(ch!=4){
            System.out.println("1-->deposite 2-->withdraw 3-->check balance 4-->Exit");
            ch=x.nextInt();
            switch(ch){
                case 1:
                    Deposit dep=new Deposit();
                    bal=dep.depos(bal);
                    break;
                case 2:
                    Withdraw wi=new Withdraw();
                    bal=wi.wdraw(bal);
                    break;
                case 3:
                    Balcheck cb=new Balcheck();
                    cb.check(bal);
                    break;
                case 4:
                    System.out.println("Thanks for visiting Dhinakaran ATM");
            }
        }
    }
}
class Deposit{
    public static int depos(int balance){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter amount");
        int amnt=x.nextInt();
        return amnt+balance;
    }
}
class Withdraw{
    public static int wdraw(int balance){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter amount");
        int amount=x.nextInt();
        return balance-amount;
    }
}
class Balcheck{
    public static void check(int balance){
        System.out.println("your balance is :"+balance);
    }
}
