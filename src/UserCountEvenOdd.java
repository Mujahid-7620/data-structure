import java.util.Scanner;
public class UserCountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");

        int n = sc.nextInt();
        System.out.println("Enter the array is :");

        int arr[]=new int[n];

        int evenCount=0;
        int oddCount=-0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) { 
                evenCount++;
            } else {
                oddCount++;
            }
            System.out.println("The even count in the array is:"+evenCount);
            System.out.println("The odd count in the array is:"+oddCount);

        }}}