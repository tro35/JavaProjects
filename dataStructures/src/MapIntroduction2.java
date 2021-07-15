import java.util.HashMap;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String, String> books = new HashMap<String, String>();

        books.put("978-1-60309-452-8", "A Letter to Jo");
        books.put("978-1-60309-459-7","Lupus");
        books.put("978-1-60309-444-3","Red Panda and Moon Bear");
        books.put("978-1-60309-461-0","The Lab");
        
        

        //iterating hash map
        for(String key: books.keySet())
            System.out.println(books.get(key) + " " + key);

        //Remove key 
        books.remove("978-1-60309-444-3");

        //Remove value
        if(books.containsValue("The Lab")){
            books.remove("978-1-60309-461-0");            
            }

        //Add Values
        books.put("978-1-60309-450-4", "They Called Us Enemy");
        books.put("978-1-60309-453-5","Why Did We Trust Him?");

        //Check key print        
        if(books.containsKey("478-0-61159-424-8")){
            System.out.println("Yes value");            
            }
            else
            System.out.println("No value");

        //Print the value associated with key 978-1-60309-453-5
        if(books.containsKey("978-1-60309-453-5")){
            String value = books.get("978-1-60309-453-5");
            System.out.println(value);
            //System.out.println(books.get(key));            
            }
            else
            System.out.println("No value");

        System.out.println();


        for(String key: books.keySet())
            System.out.println(books.get(key) + " " + key);

        
    }
}