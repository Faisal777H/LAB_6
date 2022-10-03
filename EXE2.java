import java.util.Scanner;

public class EXE2 {
    public static void main(String[] args) {
        String word=new String("");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word");
        word=in.next();
        for (int i=0;i<word.length();i++){
            System.out.println(word.charAt(i));
        }
        }
}
