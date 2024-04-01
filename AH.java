import java.util.Scanner;
public class AH {
    public static int isSorted(int n, int []a) {
            for (int i = 1; i < n; i++) {
            if (a[i] >= a[i-1]) {
                
            }else{
                return 1;
            }
        }
           return 0;
        }

        public static void main(String args[]){
            Scanner  sc= new Scanner(System.in);
             int n =  sc.nextInt();
             int a[] = new int[n];
        isSorted(n, a);
      
  }
    }

    //Done