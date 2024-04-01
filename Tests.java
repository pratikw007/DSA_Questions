public class Tests {
 

    public static void star1(int n){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public static void star2(int n){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
        public static void star3(int n){
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n-i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        
    }
    public static void main(String args[]){
        star1(4);        
        star2(4);        
        star3(4);        
    }
}
