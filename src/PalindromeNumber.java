import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int number=sc.nextInt();
        int original=number;
        int rev=0;
        while(number!=0){
            int d=number%10;
            rev=rev*10+d;
            number=number/10;
        }
        if(original==rev){
            System.out.println(original+ "  is  palindrome number ");
        }else {
            System.out.println(original+ "  is not palindrome number");
        }
    }
}
