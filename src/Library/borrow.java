package Library;

 import java.util.*;

public class borrow extends source{

      private ArrayList<String> book_Available = new ArrayList<>();
      private ArrayList<Integer> book_date_of_publish = new ArrayList<>();
      private LinkedHashMap<String , String> book_borrowed  = new LinkedHashMap<>();

        public borrow(){
               book_Available.add("JAVA IN 2025");
               book_date_of_publish.add(2025);
        }

     @Override
        public void DisplayBookAvailable(String book , int book_publish_Date){
           book_Available.add(book);
           book_date_of_publish.add(book_publish_Date);

         System.out.printf("%-10s %n" , "-----------------------------------------");
         System.out.printf("%-20s  %-10s %n" , "Book Name" , "Date Publish");
         System.out.printf("%-10s %n" , "-----------------------------------------");

         for(int i = 0; i < book_Available.size(); i++){
             System.out.printf("%-20s  %-10s %n" , book_Available.get(i) , book_date_of_publish.get(i));
         }
         System.out.println();
     }
     @Override
        public void DisplayBorrowBooks(String name , String book_name){
             book_borrowed.put(name , book_name);

             if(book_borrowed.isEmpty()){
                 System.out.println("No borrower");
             }

          if(book_Available.contains(book_name)) {
              System.out.printf("%-10s %n" , "--------------------------------------------------------");
              System.out.printf("%-30s  %-10s %n" , "Name" , "Book Name");
              System.out.printf("%-10s %n" , "--------------------------------------------------------");

              for (Map.Entry<String, String> loop : book_borrowed.entrySet()) {
                  System.out.printf("%-30s  %-10s %n", loop.getKey(), loop.getValue());
              }
              System.out.println();
          }else{
              System.out.println("--------------------");
              System.out.println("Book name not found.");
              System.out.println("--------------------");
          }
      }
      @Override
        public void RemoveBorrower(String name){
             if(book_borrowed.containsKey(name)){
                   book_borrowed.remove(name);
                 System.out.println("Succesfully remove.");
             }else{
                 System.out.println("Name not found.");
             }
      }

}
