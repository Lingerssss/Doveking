/*
import java.util.Scanner;

public class 老虎_1 {
    main;

    public String main(){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] c=new char[str.length()];
        for(int i=0;i<str.length();i++){
            if((i>='0'&&i<='9')||(i>='a'&&i<='z')||(i>='A'&&i<='Z'){
                c[i]=sc.next().charAt(0);
            }

        }
        return c.toString();

    }
    public boolean isPalindrome(String s) {
        int n = s.length();
        int left = 0, right = n - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                ++left;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                --right;
            }
            if (left < right) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                ++left;
                --right;
            }
        }
        return true;
    }


}
*/
