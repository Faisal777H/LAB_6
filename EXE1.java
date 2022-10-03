
import java.util.Scanner;

class SumEvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 2; i <= 100; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println("Sum of even numbers between 2 and 100 is: " + sum);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        int sum1 = 0;
        for(int j = a; j <= b; j++){
            if(j % 2 != 0){
                sum1 = sum1 + j;
            }
        }
        System.out.println("Sum of odd numbers between a and b is: " + sum1);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum2 = 0;
        while(num > 0){
            int digit = num % 10;
            if(digit % 2 != 0){
                sum2 = sum2 + digit;
            }
            num = num / 10;
        }
        System.out.println("Sum of odd digits is: " + sum2);
    }
}
