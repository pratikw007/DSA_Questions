public class SearchMax {
    public static void main(String[] args) {
        int[] arr ={4,3,5,2,444,1,6,41};
        
        int max =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
