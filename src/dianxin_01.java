import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class dianxin_01 {
    public static void main(String[] args) {
        String str="Hello World";
        str=str.substring(3,7);
        System.out.print(str);
    }
    static synchronized void nowCoder() {
        System.out.print("nowcoder");
    }
}
