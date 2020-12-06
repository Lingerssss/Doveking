package Test;

public class StringCompareEmp {
    public static void main(String args[]){
        String str = "Hello World";
        String anotherString = "hello world";
        Object objStr = str;

        String s1="abc";
        String s2="bcd";
        char a='c';
        char c='a';
        System.out.println((int)a);
        System.out.println((int)c);
        System.out.println((int)'A');
        System.out.println((int)'0');
        System.out.println(a-c);
        System.out.println();

        System.out.println( str.compareTo(anotherString) );
        System.out.println( str.compareToIgnoreCase(anotherString) );  //忽略大小写
        System.out.println( str.compareTo(objStr.toString()));
    }
}
