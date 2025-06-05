//convert Integer to Roman
//Eg: Input: 1256; Output: MCCLVI

public class IntegerToRoman {
    
    
    public static void main(String[] args) {
        
        int num = 1256;

        int valint[] = {1000, 900, 500, 400, 100, 90,50, 40, 10, 9, 5 , 4, 1};
        String valstr[] = {"M", "CM", "D", "CD", "C", "XC", "L","XL","X","IX","V","IV", "I"};
        String roman = "";
        for(int i=0; i<valint.length; i++){
            while(num>=valint[i]){
                num-=valint[i];
                roman+=valstr[i];
            }
        }
        System.out.print(roman);
        
    }
}
