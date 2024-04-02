package MATHS;

public class Index {
    public static void main(String[] args) {

        // // Problem 1
        // int x = 11233223;
        // int count = 0;
        // int digSum = 0;
        // while(x != 0){
        // digSum = digSum + x % 10;
        // count++;
        // }

        // System.out.println(count);

        // Problem 2
        // int n = 10;
        // for (int i = 1; i <= n; i++) {
        //     if (n % i == 0) {
        //         System.out.print(i +" ");
        //     } else {
        //         continue;
        //     }
        // }

        // problem 3;
        int n = 1441;
        int y  = 0;
        int digit = 0;

        while (n != 0) {
             digit = n % 10;
               n = n / 10;
             y =  y*10 + digit;
            //  System.out.print(n+digit);
        }

        if (n==digit) {
            System.out.println("Palindrom");
        }else{
            System.out.println("Not Palindrome");
        }
    
    }
}
