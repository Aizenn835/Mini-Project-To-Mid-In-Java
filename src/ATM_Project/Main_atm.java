package ATM_Project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main_atm {
    static void padding(String name , int paddinglength){
        int width = name.length();
        int paddingconsole = (width - paddinglength) / 2;

        for(int i = 0; i < paddingconsole; i++){
            System.out.print(" ");
        }
        System.out.println(name);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // initialize a variable here:
        int paddinglength = 50;
        int choice;
        String name;
        // initialize an object and function here:


        System.out.print("Enter UserName: ");
        name = scanner.nextLine().toUpperCase();

        atm user = new atm(5000 , name);


        padding("===================" , paddinglength);
        padding(" Simple ATM System" , paddinglength);
        padding("===================" , paddinglength);
        do{
            System.out.println("[1] Check Balance");
            System.out.println("[2] Deposit Money");
            System.out.println("[3] Withdraw Money");
            System.out.println("[4] Change ATM Account");
            System.out.println("[5] Exit");
            System.out.println();

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("*******************");
                    System.out.println(user.CheckBalance());
                    System.out.println("*******************");
                }
                case 2 -> {
                    System.out.print("Enter amount: ");
                    int amount = scanner.nextInt();
                    System.out.println(user.Deposit(amount));

                    try(BufferedWriter bf = new BufferedWriter(new FileWriter("C:\\Users\\Lei Justine\\OneDrive\\Desktop\\DepositAtm.txt" , true))){
                        bf.write(name + " Deposited " + amount + "\n");
                    }catch(IOException e){
                        System.out.println("Cannot record transcation: " + e.getMessage());
                    }
                }
                case 3 ->{
                    System.out.print("Enter amount to withdraw: ");
                    int amount = scanner.nextInt();
                    user.Withdraw(amount);

                    try(BufferedWriter bf = new BufferedWriter(new FileWriter("C:\\Users\\Lei Justine\\OneDrive\\Desktop\\withdrawAtm.txt" , true))){
                        bf.write(name + " Withdraw " + amount + "\n");
                    }catch(IOException e){
                        System.out.println("Cannot record transaction: " + e.getMessage());
                    }
                }case 4 -> {
                    scanner.nextLine();

                    System.out.print("Enter  username: ");
                    name = scanner.nextLine().toUpperCase();

                    user = new atm(5000 , name);
                }
                case 5 -> System.out.println("Thank you for using the ATM System.");
            }
        }while(choice != 5);
    }
}
