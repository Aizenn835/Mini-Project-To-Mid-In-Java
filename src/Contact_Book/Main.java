package Contact_Book;

  import java.io.*;
  import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException , InterruptedException{
         // declare object here:
           Scanner scanner = new Scanner(System.in);
           Function_book book = new Function_book();
           int choice = 0;

         System.out.println("=============================");
         System.out.println("Simple Contact Book Simulator");
         System.out.println("=============================");

          while(choice != 3) {
              System.out.println("[1] Add Contact");
              System.out.println("[2] View Contacts");
              System.out.println("[3] Exit");

              System.out.print("Enter your choice: ");
              choice = scanner.nextInt();

              switch (choice) {
                  case 1 -> {
                      scanner.nextLine();
                      File file = new File("C:\\Users\\Lei Justine\\OneDrive\\Documents\\Number.txt");
                      try (FileWriter writer = new FileWriter(file, true)) {
                          System.out.print("Enter name: ");
                          String name = scanner.nextLine();

                          System.out.print("Enter number: ");
                          Long number = scanner.nextLong();

                          book.Contact_Getter(name, number);
                          System.out.println("Successfully added.");
                          writer.write(name + " : +63" + number + "\n");
                          writer.flush();
                      } catch (InputMismatchException e) {
                          System.out.println("Input Mismatch: " + e.getCause());
                      }
                  }
                  case 2 -> book.View_Contact();
              }

          }
     }
}
