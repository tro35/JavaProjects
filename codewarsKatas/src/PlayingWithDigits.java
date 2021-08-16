public class PlayingWithDigits {
    public static void main(String[] args) {

        System.out.println(extractDigit(89));
        for (int i = 0; i < extractDigit(89).length; i++) {
            System.out.println(extractDigit(89)[i]);
        }
    }

    public static int[] extractDigit(int number){
        int[] splitedNumbers = new int[numberLength(number)];
        int temp = number;
        int result = 0;
        int count = splitedNumbers.length - 1;
        while(temp > 0){
            result = temp % 10;
            splitedNumbers[count] = result;
            temp = temp /10;
            count--;
        }
        return splitedNumbers;
    }

    public static int numberLength(int number){
        int count = 0;
        while(number > 0)
        {
            number = number / 10;
            count++;
        }
        return count;
    }
}
