import Bank.Account;
import java.util.*;
class User{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Account ac=new Account();
        
        System.out.print("\nEnter the Name :");
        String name=s.nextLine();
        System.out.print("\nEnter the Initial Amount :");
        int amount=s.nextInt();
        s.nextLine();
        ac.createAccount(name, amount);

        System.out.println("""
                1)Credit
                2)withdraw
                3)Balance
                4)Exit
                """);
        
        while(true){
        System.out.print("\nEnter What you want to do :");
        String msg=s.nextLine().toLowerCase();

        if("credit".equals(msg)){
            System.out.print("\nEnter the amount :");   
            int amt=s.nextInt();
            ac.credit(amt);
            s.nextLine();
        }
        else if("withdraw".equals(msg)){
            System.out.print("\nEnter the amount :");   
            int amt=s.nextInt();
            ac.withdraw(amt);
            s.nextLine();
        }
        else if("balance".equals(msg)){
            ac.disp_balance();
        }
        else if("exit".equals(msg)){
            break;
        }
        else{
            System.out.println("Invalid Action !");
        }
        }
        
    }
}