package Ex06;
public class Account {
    String name;
    int balance;

    void createAccount(String name, int initialAmount) {
        this.name = name;
        this.balance = initialAmount;
    }
    int credit(int amount){
        balance+=amount;
        System.out.println("The Amount Credited Successfully");
        return balance;
    }
    int withdraw(int amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("The Amount Withdrawn Successfully");
        }
        else{
            System.out.println("Your balance is Low");
        }
        return balance;
        }
    void disp_balance(){
        System.out.println("Name :"+name);
        System.out.println("Balance :"+balance);
    }
}
