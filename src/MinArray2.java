public class MinArray2 {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("the minimum number in the array is: " +min);
    }
}
