// - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`

public class SwapElements {
    public static void main(String[] args) {
        String[] orders = {"first", "second", "third"};
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == orders[0]) {
                orders[0] = "third";
            }
            if (orders[i] == orders[orders.length -1]) {
                orders[orders.length -1] = "first";
            }
            System.out.println(orders[i]);
        }

    }
}
