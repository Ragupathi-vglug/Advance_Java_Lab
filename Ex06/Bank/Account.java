package Bank;
public class Account {
    String name;
    int balance;

    public void createAccount(String name, int initialAmount) {
        this.name = name;
        this.balance = initialAmount;
    }
    public int credit(int amount){
        balance+=amount;
        System.out.println("The Amount Credited Successfully");
        return balance;
    }
    public int withdraw(int amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("The Amount Withdrawn Successfully");
        }
        else{
            System.out.println("Your balance is Low");
        }
        return balance;
        }
    public void disp_balance(){
        System.out.println("Name :"+name);
        System.out.println("Balance :"+balance);
    }
}
