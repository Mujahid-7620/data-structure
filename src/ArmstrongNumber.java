import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number=sc.nextInt();
        int original=number;
        int result=0;
        int count=0;
        int temp=number;
        while(temp!=0){
             temp=temp/10;             //to count the number of digit
            count++;
        }
        temp=number;
        while(temp!=0){
            int digit=temp%10;
            result+=Math.pow(digit,count);
            temp=temp/10;                    //used power of digit of number
        }
        if(original==result){
            System.out.println(original+" number is Armstrong ");

        }else{
            System.out.println(original+" number is not armstrong ");
        }
    }
}
