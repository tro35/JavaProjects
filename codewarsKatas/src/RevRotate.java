public class RevRotate {
    public static void main(String[] args) {
        System.out.println(revRot("563000655734469485", 4));
    }

    public static String revRot(String strg, int sz){
        String result = "";
        char[] finalChunk = new char[sz];
        int strIndice = 0;
        if(sz <= 0 || strg == "" || sz > strg.length()){
            result = "";
        }else{

        while(strg.length() % sz != 0){
            strg = strg.substring(0, strg.length() - 1);
            System.out.println(strg);            
        }

        for (; sz <= strg.length();) {
            char[] chunk = strg.substring(strIndice,sz).toCharArray();
            int sum = 0;
            for (int j = 0; j < chunk.length; j++) {
            sum += chunk[j] - '0';                        
            }
            System.out.println(sum);
            strIndice += chunk.length;            
            sz += chunk.length;

            if(sum % 2 != 0){
                for (int j = 1; j < finalChunk.length; j++) {                    
                    finalChunk[j-1] = chunk[j];
                }
                finalChunk[finalChunk.length -1] = chunk[0];
                result += String.valueOf(finalChunk);
            }else{
                int l = 0;
                for(int k = finalChunk.length - 1; k >= 0; k--, l++){                    
                    finalChunk[l] = chunk[k];    
                }
                result += String.valueOf(finalChunk);                
            }            
        }
    }       
    return result;
    }
}