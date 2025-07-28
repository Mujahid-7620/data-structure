import java.util.Scanner;
public class Count {
    static int countDigits(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++; //you can also write the count=count+1
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner((System.in));
        System.out.println("Enter the number :");
        int n=scan.nextInt();
        System.out.println(countDigits(n));

    }
}
