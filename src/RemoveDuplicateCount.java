import java.util.HashSet;

class removeDuplcateCount{
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,5,5,6};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<=arr.length-1;i++){
            if(!set.add(arr[i])){
                System.out.println(arr[i]+" ");
            }
        }

    }
}