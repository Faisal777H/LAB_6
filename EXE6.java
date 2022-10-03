import java.util.Scanner;

public class EXE6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,rem;
        String Bin="";
        System.out.println("enter number ");
        n=in.nextInt();
        if (n<=0){
            System.out.println("Error:not A Positive int");
            System.exit(1);
        }
        while (n>0){
            rem=n%2;
            Bin=rem+Bin;
            n=n/2;
        }
        System.out.println("The Binary Representation is "+Bin);

    }
}
