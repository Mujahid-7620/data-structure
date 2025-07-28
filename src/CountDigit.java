public class CountDigit {
    public static void main(String[] args) {
        int n = 123456;
        int count=0;
        while(n!=0){
            int d=n%10;
            n=n/10;
            count++;
        }
        System.out.println("The number of digit is : " +count);
    }}