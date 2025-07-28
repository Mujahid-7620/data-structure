import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,4,5,6,6,7};
        System.out.println(Arrays.toString(arr));
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<=arr.length-1;i++){
            set.add(arr[i]);
        }
        for(int num:set)
        {
            System.out.print(num+" ");
        }

    }
}
