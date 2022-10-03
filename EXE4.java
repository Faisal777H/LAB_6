import java.util.Scanner;

public class EXE4 {
    public static void main(String[] args) {
        String R;
        Scanner in=new Scanner(System.in);
        System.out.println("enter Word");
        R=in.nextLine();
        int count=0;
        for (int i=0;i<R.length();i++){
            char v=R.charAt(i);
            if (v=='a'||v=='e'||v=='i'||v=='u'||v=='o'||v=='y'){
                count++;
            }
        }
        System.out.println("There are "+count+" vowels in"+R);
    }
}
