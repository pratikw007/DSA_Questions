package MATHS;

import java.util.Arrays;

public class One {

        public static int minimumSum(int num){
                
        // Step 1 : We need find all the digit and store them in data structure.
       int digit[] = new int[4]; //data structure of size 4
        int index = 0;
       //Step 2: Find all digits and store them in data structure
       while(num > 0) {
           int currentLastDigit = num % 10;

        //storing the digit in digits array
        digit[index] = currentLastDigit;
        index++;

        //remove this current digit 
        num = num / 10;
       }

    //Sort the Data Strucure
        Arrays.sort(digit); 

//these are the formula
        int firstNumber = digit[0]*10 +digit[2];
        int secondNumber = digit[1]*10+digit[3];
        int digSum = firstNumber+secondNumber;

        return digSum;
         
        }


    public static void main(String[] args) {

        System.out.println(minimumSum(2932));
    

    }
    
}
