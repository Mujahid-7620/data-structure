public class SecondLargestNumber2 {
    public static void main(String[] args) {
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;  //-2345
        int arr[]={1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second_largest=arr[i];
                arr[i]=largest;
            }}
            if(second_largest==Integer.MIN_VALUE){
                System.out.println("There is no seconf largest is there:");
            }else {
                System.out.println("the second largest elelment is :"+second_largest);
            }
    }
}
