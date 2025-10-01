package Contact_Book;

 import java.util.*;

public class Function_book {

      private HashMap<String , Long> contact = new HashMap<>();

       public void Contact_Getter(String Getname , Long GetContact){
                contact.put(Getname , GetContact);
       }
       public void View_Contact(){
            for(Map.Entry<String , Long> loop : contact.entrySet()){
                System.out.println(loop.getKey() + " : " + loop.getValue());
            }
       }

}
