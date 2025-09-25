package Library;
 // borrow / return books
 import java.util.Scanner;


public class Main {
    static void padding(String name , int paddingconsole){
          int width = name.length();
          int actualPadding =  (paddingconsole - width) / 2;

            for(int i = 0; i < actualPadding; i++){
                System.out.print(" ");
            }
        System.out.println(name);
    }
     public static void main(String[] args){
         // Object here:
          Scanner scanner = new Scanner(System.in);
          source Book_Function = new borrow();
         // Variable here:
            int paddingconsole = 50;
            int choice = 0;

            padding("=========================" , paddingconsole );
            padding("Library Management System" , paddingconsole );
            padding("=========================" , paddingconsole );
        while(choice != 4) {

            System.out.println("[1] View Books");
            System.out.println("[2] Borrow Books");
            System.out.println("[3] Remove Borrowed Books");
            System.out.println("[4] Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    scanner.nextLine();

                    System.out.print("Enter book name: ");
                    String book_Name = scanner.nextLine().toUpperCase().trim();

                    System.out.print("Enter book date: ");
                    int book_date = scanner.nextInt();

                    Book_Function.DisplayBookAvailable(book_Name , book_date);

                }
                 case 2 -> {
                      scanner.nextLine();

                     System.out.print("Enter your name: ");
                     String borrower_name = scanner.nextLine().trim().toUpperCase();

                     System.out.print("Enter book name: ");
                     String book_name_borrowed = scanner.nextLine().toUpperCase();

                     Book_Function.DisplayBorrowBooks(borrower_name , book_name_borrowed);
                 }
                 case 3 ->{
                     scanner.nextLine();

                     System.out.print("Enter name: ");
                     String borrower_remove = scanner.nextLine().trim().toUpperCase();
                      Book_Function.RemoveBorrower(borrower_remove);
                 }
                case 4 -> System.out.println("Exiting Program..");
            }

        }
     }
}
