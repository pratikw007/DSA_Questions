public class LinSerStr {
    public static void main(String[] args) {
        // Create an instance of the Linear_Series
        String[] str = {"ram","viraj","hanumanji","gopal"}; 
        String target = "gopal";
    
        int temp = 0;
        for (int i = 0; i < str.length; i++) {
            // if (str[i] == target) {
            if (str[i].equals(target)) {
                System.out.println("item presnet in "+i+" index");
                temp++;
            }
        }

        if (temp==0) {
            System.out.println("Item Not Present");
        }
    }
}
