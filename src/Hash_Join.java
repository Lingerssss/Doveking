import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hash_Join {
    private void hashjoin(int[] a,int[] b){
        Arrays.sort(a);
        int[] shorter=a.length>b.length?a:b;
        int[] longer=a.length>b.length?b:a;

        Map<Integer, Integer> m = new HashMap<>();

        for (int i : shorter) {
            m.put(i, m.containsKey(i) ? m.get(i) + 1 : 1);
        }
        for(int i=0;i<longer.length;i++){
            int number=longer[i];
            if(m.containsKey(longer[i])){

            }
        }






        int len = m.size();
        int[] p = new int[len];
        int[] pb = new int[len];
        int[] index = new int[1];
        m.forEach((k, v) -> {
            p[index[0]] = k;
            pb[index[0]] = v;
            index[0]++;
        });

    }
}
