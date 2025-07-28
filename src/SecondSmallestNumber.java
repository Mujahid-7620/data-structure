public class SecondSmallestNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i]=arr[j];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        System.out.println("The second Smalllest number is: " +arr[1]);
    }
}
