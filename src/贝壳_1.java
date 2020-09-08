import java.util.HashMap;
import java.util.Scanner;
//牛妹和牛牛石头剪刀布，俩手操作，有点东西


public class 贝壳_1 {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         int m=scanner.nextInt();

         char[][] c=new char[m][4];
         for(int i=0;i<m;i++){
             for(int j=0;j<4;j++){
                 c[i][j]=scanner.next().charAt(0);

             }
         }

         HashMap<Character, Character> hm=new HashMap();
         hm.put('J','S');
         hm.put('S','B');
         hm.put('B','J');
         for(int i=0;i<m;i++){

                 System.out.println(panduan(c[i][0],c[i][1],c[i][2],c[i][3],hm));


         }


     }
     static String panduan(char a,char b,char c,char d,HashMap hm){
         int co_left=0;
         int co_right=0;
         if(hm.get(c).equals(a)||hm.get(d).equals(a)){
             co_left++;
         }
         if(hm.get(c).equals(b)||hm.get(d).equals(b)){
             co_right++;

         }
         if(co_left>co_right){
             return "left";
         }
         if(co_left<co_right){
             return "right";
         }
         if(co_left==co_right){
             return "same";
         }
         return "1";

     }

}
