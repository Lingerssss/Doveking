import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
//n棵树，每棵树高度是p[i],修剪要求是对于任意一棵树，其相邻两棵树的高度不能都大于它。
//思路：分别将p[i]作为最高点，计算高度和，p[i]左边升序，右边降序
public class 贝壳_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = scanner.nextInt();

        }


        int[] res = new int[m];
        //存储每个点高度之和
        int[] count = new int[5];
        int temp=0;
        int[] ss = new int[m];


        for (int i = 0; i < m; i++) {

            int[] tem=new int[m];
            tem=Arrays.copyOf(p,m);
            dfs(tem, i, count);
            System.out.println(count[0]);
            if(count[0]>temp){
                res=tem;
                temp=count[0];
            }
            count[0]=0;



        }
        for (int e : res) {
            System.out.println(e);
        }


    }

    static void dfs(int[] p, int index, int[] count) {
        //if()

        count[0]+=p[index];
        System.out.println("pindex: "+p[index]);
        int temp_max=p[index];
        for (int left = index - 1; left >= 0; left--) {

            while (p[left] > temp_max) {
                p[left]--;
                //System.out.println(count);
            }
            temp_max= p[left];

            count[0] += p[left];
            System.out.println("left: "+p[left]);
        }

        //还原顶峰的那个点作为temp_index
        temp_max=p[index];
        for (int right = index + 1; right <= p.length-1; right++) {
            while (p[right] > temp_max) {
                p[right]--;
            }
            temp_max = p[right];
            count[0] += p[right];
            System.out.println("right: "+p[right]);
            //System.out.println(count[0]);
        }
    }
}
