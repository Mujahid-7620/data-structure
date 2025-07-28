import java.util.Scanner;
public class CountDigitFrequency {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of digit : ");
        int n=sc.nextInt();
int [] freq=new int[10];
n=Math.abs(n);
while(n>0){
int digit=n%10;
freq[digit]++;
n=n/10;
}
        System.out.println("digit frequency:");
for(int i=0;i<10;i++){
if(freq[i]>0){
    System.out.println("Digit"+i+":"+freq[i]);
}}}}