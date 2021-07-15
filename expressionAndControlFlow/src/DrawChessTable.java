// Crate a program that draws a chess table like this
//
// % % % % 
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % % 
//  % % % %
//
public class DrawChessTable {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((j + i) % 2 == 0)
                    System.out.print("██");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }


    }

}