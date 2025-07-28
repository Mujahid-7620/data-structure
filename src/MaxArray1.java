public class MaxArray1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int Max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>Max){
            Max=arr[i];            }
        }
        System.out.println("Max number in the array is: " +Max);
    }
}
