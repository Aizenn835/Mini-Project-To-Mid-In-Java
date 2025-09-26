package ATM_Project;

import java.util.Scanner;

public class atm {
    Scanner scanner = new Scanner(System.in);

    private int balance;
    private String UserName;


    public atm(int balance , String UserName){
        this.balance = balance;
        this.UserName = UserName;
    }
    public String CheckBalance(){
        return(" Total Balance: " + this.balance);
    }
    public String Deposit(int amount){
        if(amount > 0 ){
            balance+= amount;
            return ("Your new balance is: " + balance + "\n");
        }else{
            return("Amount cannot be less than 0\n");
        }
    }
    public void Withdraw(int amount){
        if(amount > 0 && amount <= balance){
            balance-= amount;
            System.out.println("Successfully withdraw: " + amount);
            System.out.println("New balance: " + balance);
        }else{
            System.out.println("Invalid withdraw amount:" );
        }
    }

}
