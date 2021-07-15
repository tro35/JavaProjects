public class Test {
    public static void main(String[] args) {
      System.out.println(plant('@',3,7,35));
    }
    public static String plant(char seed, int water, int fert, int temp){
        String result = "";
        if(temp >= 20 && temp <= 30) {
            for (int i = 0; i < water; i++) {
                for (int j = 0; j < water; j++) {
                    result += "-";
                }
                for (int j = 0; j < fert; j++) {
                    result += seed;
                }
            }
        }
        else{
            for (int i = 0; i < water; i++) {
                for (int j = 0; j < water; j++) {
                    result += "-";
                }
            }
            result += seed;
        }
        return result;
    }
}
