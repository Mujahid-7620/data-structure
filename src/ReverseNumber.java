import java.util.Scanner;
class reverseNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.print("Reverse Number " +n+ " is ");
        int reversed=0;
        while(n!=0){
            int d=n%10;
            reversed=reversed*10+d;
            n=n/10;
        }
        System.out.println(reversed);
        sc.close();
    }
}