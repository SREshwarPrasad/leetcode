//name your file as RomanToInteger
//Eg: Input: MCM ; Output: 1900


public class RomanToInteger {
    
    public static int roman(char c){

        if(c == 'I'){
            return 1;
        }
        if(c == 'V'){
            return 5;
        }
        if(c == 'X'){
            return 10;
        }
        if(c == 'L'){
            return 50;
        }
        if(c == 'C'){
            return 100;
        }
        if(c == 'D'){
            return 500;
        }
        if(c == 'M'){
            return 1000;
        }
        return 0;
    }
    public static void main(String[] a){

        String val = "MCM";

        int converted = 0;
        int prev = 0;

        for(int i=val.length()-1; i>=0; i--){
            int curr = roman(val.charAt(i));
            if(curr<prev){
                converted -= curr;
            }
            else{
                converted +=curr;
            }
            prev = curr;
        }
        System.out.print(converted);
    }
}
