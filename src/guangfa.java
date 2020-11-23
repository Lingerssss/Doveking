import java.util.*;

public class guangfa {
    public String lastNChar (String data, int n) {
        char[] chararray=data.toCharArray();
        Map<Character,  Integer> m = new HashMap<>();
        for (char i : chararray) {
            m.put(i, m.containsKey(i) ? m.get(i) + 1 : 1);
        }
        //System.out.println(m);
        List<Map.Entry<Character, Integer>> listdata= new ArrayList<Map.Entry<Character, Integer>>(m.entrySet());
        Collections.sort(listdata, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                if(((Comparable)((Map.Entry)(o1)).getValue()).compareTo(((Map.Entry)(o2)).getValue())!=0){
                    return o1.getValue().compareTo(o2.getValue());
                }
                else {
                    return o2.getKey().compareTo(o1.getKey());
                }

            }
        });
        //System.out.println(listdata);
        StringBuilder sb=new StringBuilder();
        List tmp=new ArrayList();
        Object[] res=listdata.toArray();
        if(n<=listdata.size()){
            for(int i=0;i<n;i++){

                tmp.add(res[i].toString().charAt(0));
            }
        }
        else {
            for(int i=0;i<listdata.size();i++){

                tmp.add(res[i].toString().charAt(0));
            }

        }
        return tmp.toString();
    }

}
