import java.util.Scanner;

public class EXE3 {
    public static void main(String[] args) {
        String R;
        Scanner in=new Scanner(System.in);
        System.out.println("enter any word");
        R=in.next();
        StringBuilder word=new StringBuilder(R);
        System.out.println("REVERSE WORD "+word.reverse());
    }
}
