public class StrSort {
     public static void main(String[] args) {
        String arr[] = {"Ram","Ratan", "Amit","Shailesh","Karan","Yash"};
        // Calling the sort function
        Sort(arr);
        
        
     }

     public static void Sort(String arr[]){
        String temp;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0;j<arr.length-1;j++){


                if (arr[j].compareTo(arr[j+1])>0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }
     }

     
}
