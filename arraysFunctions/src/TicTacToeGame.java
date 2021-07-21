
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        int player = 2;
        boolean endGame = false;
        int[][] gameBoard = new int[9][9];
        String[] stoneMarks = {" ","O","X"};
        String[] players = {"nikdo", "hráč s kolečky", "hráč s křížky"};
        Scanner sc = new Scanner(System.in, "Windows-1250");

        //game play cycle
        while(!endGame){
            //draw first line with numbers
            //---------------------------------------
            System.out.flush(); //console clear
            //first row with horizontal coordinates
            System.out.print("  ");
            for (int i = 0; i < gameBoard.length; i++) {
                System.out.print(i + 1);
            }
            System.out.println();
            //drawing game board
            for (int j = 0; j < gameBoard[0].length; j++) {
                //row start number
                System.out.print((j + 1) + " ");
                for (int i = 0; i < gameBoard.length; i++) {
                    int mark = gameBoard[i][j];
                    System.out.print(stoneMarks[mark]);
                }
                System.out.println();
            }
            //Winner evaluation
            //-----------------
            int markCount = 5;
            // Finding 5 same marks of player
            int filled = 0; //count of filled fields
            int marksRow = 0; // count of same marks in row
            int marksColumn = 0; // count of same marks in column
            // 2 cycles check all fields in gameboard
            for (int j = 0; j < gameBoard[0].length; j++) {
                for (int i = 0; i < gameBoard.length; i++) {
                    //filling check
                    if(gameBoard[i][j] > 0)
                        filled++;
                    if(filled == gameBoard.length * gameBoard[0].length){
                        System.out.println("Remíza.");
                        endGame = true;
                    }
                    // counting symbols last player move in row
                    if(gameBoard[i][j] == player)
                        marksRow++;
                    else // symbol not found, counter marksRow 0
                    marksRow = 0;
                    // counting symbols last player move in column
                    if(gameBoard[j][i] == player)
                        marksColumn++;
                    else // symbol not found, counter marksColumn 0
                    marksColumn = 0;
                    // win evaluation row or column
                    if(marksRow == markCount || marksColumn == markCount){
                        System.out.println("Vyhrál " + players[player]);
                        endGame = true;
                    }
                }
            }
            // Diagonals check
            int marksDiagonalLeft = 0; // same symbols left to right
            int marksDiagonalRight = 0; // same symbols right to left
            // 2 cycles for diagonal check
            for (int j = 0; j < gameBoard[0].length * 2; j++) { // Projíždíme 2x více řad než má hrací plocha, jinak bychom nalezli jen polovinu diagonál
                for (int i = 0; i < gameBoard.length; i++) {
                    //diagonal right to left
                    int diagonal = gameBoard[0].length - 1 - j + i; // from last row up
                    if(diagonal >= 0 && diagonal < gameBoard[0].length && (gameBoard[gameBoard.length - 1 - i][diagonal] == player )) // Nevyjeli jsme z plochy a našli jsme hráčův kámen
                        marksDiagonalLeft++;
                    else
                        marksDiagonalLeft = 0; // Jsme mimo nebo tam hráč nemá kámen
                    //diagonal left to right
                    if(diagonal >= 0 && diagonal < gameBoard[0].length && (gameBoard[i][diagonal] == player))
                        marksDiagonalRight++;
                    else
                        marksDiagonalRight = 0;
                    //win evaluation by diagonal
                    if(marksDiagonalLeft == markCount || marksDiagonalRight == markCount){
                        System.out.println("Vyhrál " + players[player]);
                        endGame = true;
                    }
                }
            }
            // Přidání kamenu hráče
            //---------------------------------
            if(!endGame){
                //players swap
                if(player == 1)
                    player = 2;
                else
                    player = 1;
                System.out.println("\nNa řadě je " + players[player]);
                boolean freeCoordinate = false;
                int x = 1;
                int y = 1;

                // Načítání souřadnic dokud nezadá takové, kde je volno
                while (!freeCoordinate){
                    System.out.println("Zadej pozici X kam chceš táhnout: ");
                    x = Integer.parseInt(sc.nextLine());
                    System.out.println("Zadej pozici Y kam chceš táhnout: ");
                    y = Integer.parseInt(sc.nextLine());
                    if(x >= 1 && y >= 1 && x <= 9 && y <= 9 && gameBoard[x-1][y-1] == 0){
                        freeCoordinate = true;
                    }else{
                        System.out.println("Neplatná pozice, zadej ji prosím znovu.");
                    }
                }
                gameBoard[x-1][y-1] = player;
            }
        }
    }
}