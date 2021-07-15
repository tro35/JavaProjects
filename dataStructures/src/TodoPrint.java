// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected output:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo

import java.util.ArrayList;

public class TodoPrint {
    public static void main(String[] args) {
        ArrayList<String> todo = new ArrayList<String>();

        todo.add("My todo:");
        todo.add("  - Buy milk");
        todo.add("  - Download games");
        todo.add("    - Diablo");

        for (int i = 0; i < todo.size(); i++) {
            System.out.println(todo.get(i));
        }
    }
}
