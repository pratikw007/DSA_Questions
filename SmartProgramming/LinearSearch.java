public class LinearSearch{
    public static void main(String[] args) {
        int arr[] = {2, 4,3,1,9,5,7};
        int target = 33;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                System.out.print("Target element Present at "+ (i+1)  + " Position");
                temp = temp + 1;
            }
        }
        if (temp==0) {
            System.out.println("element not found");
        }
    }
}