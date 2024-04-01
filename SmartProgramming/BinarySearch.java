public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        
        int target = 8;
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end) /2;


        while (start<end) {
            if (arr[mid]==target) {
                System.out.println(mid);

            }else if (arr[mid]<target) {
                start = mid+1;                
            } else{
                end = mid-1;
            } 
        }
        System.out.println("Not Found");  

    }
}
