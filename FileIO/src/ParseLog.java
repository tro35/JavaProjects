// Read all data from 'log.txt'
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses
// Write a function that returns the GET / POST request ratio
import java.util.ArrayList;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;


public class ParseLog{
    public static void main(String[] args) {
        //filterUniqueIP(readLog());
        ArrayList<String> result = filterUniqueIP(readLog());
        for (int i = 0; i < result.size(); i++) {
            System.out.println(i + " "  + result.get(i));
        }
        countGetPost(readLog());
    }

    private static ArrayList<String> readLog(){
        List<String> lines = new ArrayList();
        ArrayList<String> uniqueIpGetPost = new ArrayList();
        Path path = Paths.get("src/log.txt");

        try{        
            lines = Files.readAllLines(path);        
            }catch(IOException ex){
                System.out.println("Reading from file failed");
            }
    
            if(lines.isEmpty()){
                System.out.println("No data in log");
            }
    
            for (String line : lines) {
                String [] parts = line.split("  ");
                String ipAddress = parts[2];
                String getPost = parts[3];
                uniqueIpGetPost.add(ipAddress + "" + getPost);
                //System.out.println(ipAddress + "" + getPost);
            }
        return uniqueIpGetPost;
    }

    private static ArrayList<String> filterUniqueIP(ArrayList<String> filteredIP){
        ArrayList<String> uniqueIpList = new ArrayList();              
        for (int i = 0; i < filteredIP.size(); i++){
            String [] parts = filteredIP.get(i).split(" ");
            String ipAddress = parts[1];            
            if(!uniqueIpList.contains(ipAddress)){
                uniqueIpList.add(ipAddress);
            }
        }        
        return uniqueIpList;
    }

    private static void countGetPost(ArrayList<String> filteredIP){
        int get = 0;
        int post = 0;
        for (int i = 0; i < filteredIP.size(); i++){
            String [] parts = filteredIP.get(i).split(" ");
            String ipAddress = parts[2];
            if(ipAddress.equals("POST"))
                post++;
            else
                get++;
        }
        System.out.println("POST count: " + post + " GET count: " + get);
    }
}