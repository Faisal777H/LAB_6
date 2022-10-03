import java.util.Scanner;

public class EXE7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("enter the number");
        n=in.nextInt();
        for (int i=2;i<n;i++){
            boolean isPrime=true;
            for (int j=2;j<i;j++){
                if(i%j==0){isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i+" ");
            }
        }
    }
}
