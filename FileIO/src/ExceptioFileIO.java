import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.List;





public class ExceptioFileIO {
    public static void main(String[] args) {
        printLeaderBoard();

        int number = -1;
        Random random = new Random();
        int numberToGuess = random.nextInt(10);

        System.out.println("Iam thinking of a number (0 - 9), can you figure out which one?");
        int rounds = 0;

        do {
            try{
            number = readNumber();
            }catch(InputMismatchException e){
                System.out.println("Hey thats not a number");
                continue;
            }

            catch(Exception e){
                System.out.println(e.getMessage());
                continue;
            }finally{     //tenhle kod pobezi i kdyz nastane vyjimka nebo nenastane pouziva se k tomu finally
            rounds++;
            }

            if(number < numberToGuess){
                System.out.println("Nope it is larger");
            } else if(number > numberToGuess){
                System.out.println("Nope it is smaller");
            }
        }while (number != numberToGuess);
        System.out.println("Correct it took " + rounds + " rounds to figure out");
        saveScore(rounds);
    }


    //kdyz napiseme za metodu throws + typ vyjimky nahore u metody bude videt jakou vyjimku osetrujeme
    private static int readNumber() throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your guess: ");
        int n=  scanner.nextInt();

        if(n < 0 || n > 9){
            throw new Exception("Number is out of range"); // muzeme exception vice konkretizovat IllegalArgumentException
        }
        return n;
        /*exception lze resit zde nebo nahore az se zavola metoda
        pokud se zavola try catch nahore muze se pri spatnem vstupu cyklus
        ukoncit a nevypise se nic*/
        /*try{
        return scanner.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println(e.getMessage());
            System.out.println("Hey thats not a number");

        }
        return -1;*/
    }
    //throws v signature metody rikame tim ze vime o vyjimce, ale nechceme ji resit uvnitr metody
    //private static void printLeaderBoard() throws Exception{
    private static void printLeaderBoard() {
        List<String> lines = new ArrayList();
        //Path path = Paths.get("foldername" + File.pathSeparator + ".\\leaderboard.txt");  filepath separator na linuxu a mac / na windows \
        Path path = Paths.get("src/leader.txt");// absolute path uplna cesta k souboru C:\Slozka\soubor.txt
                                                     // cestav jave musi mit dvojity \\ pokud je pouze jeden je bran 
                                                     // jako escape znak
                                                     // relativni cesta ..\\ jedna uroven nahoru .\\ stejny adresar        
        try{        
        lines = Files.readAllLines(path);        
        }catch(IOException ex){
            System.out.println("Reading from file failed" + ex);
        }

        if(lines.isEmpty()){
            System.out.println("No scores in leaderboard");
        }

        for (String line : lines) {
            String [] parts = line.split(";");
            String name = parts[0];
            String score = parts [1];
            System.out.println("Name: " + name + " Score: " + score);
        }
    }

    private static void saveScore(int score){
        System.out.println("Please provide your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        //parsovani cisla na string
        String scoreInString = String.valueOf(score);

        Path path = Paths.get("src/leader.txt");
        List<String> lines = new ArrayList();
        lines.add(name + ";" + scoreInString);

        try{
        Files.write(path, lines, StandardOpenOption.APPEND);
        }catch(IOException e){
            System.out.println(e);
        }
    }

    private static Path getPath(){
        return Paths.get("src/leader.txt");
    }
}
