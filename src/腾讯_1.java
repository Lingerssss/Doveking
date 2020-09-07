import java.util.*;

public class 腾讯_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] p=new int[m];
        HashMap<Integer,Integer> hm=new HashMap<>();
        //System.out.println(m);
        int[] res=new int[m];
        for(int i=0;i<m;i++){
            hm.put(i,sc.nextInt());
            p[i]=hm.get(i);
        }
       Arrays.sort(p);
        //Arrays.sort(p);
        int left=p[p.length/2-1];
        int right=p[p.length/2];
        for(int i=0;i<hm.size();i++){
            int temp=hm.get(i);
            if(temp<=left){
                res[i]=right;
            }
            else res[i]=left;
            System.out.println(res[i]);
        }
    }
}
