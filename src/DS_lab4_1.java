public class DS_lab4_1 {
    private int[] sort_12(int[] p) {
        if (null == p || 0 == p.length) {
            return p;
        }
        /*
        Declare an array named res0 to hold 0,
        an array named res1 to hold 1,
        an array named res to hold the final result.
         */
        int[] res0 = new int[p.length];
        int[] res1 = new int[p.length];
        int[] res = new int[p.length];
        int index_0 = 0;
        int index_1 = 0;
        for (int i = 0; i < p.length; i++) {
            if (0 == p[i]) {
                res0[index_0] = 0;
                index_0++;
            }
            if (1 == p[i]) {
                res1[index_1] = 1;
                index_1++;
            }
        }
        //Merge the array res0 and res1 into one array。
        for (int i = 0; i < res0.length; i++) {
            res[i] = res0[i];
        }
        for (int i = res0.length; i < res.length; i++) {
            res[i] = res1[i];
        }
        return res;
    }

    private int[] sort_13(int[] p) {
        if (null == p || 0 == p.length) {
            return p;
        }
        int left = 0;
        int right = p.length - 1;
        /*
        The two values are exchanged
        when the left pointer is 1 and
        the right pointer is 0.
        */
        while (left < right) {
            while (left < right && left == 0) {
                left++;
            }
            while (left < right && right == 1) {
                right--;
            }
            if (left < right) {
                int tmp = p[left];
                p[left] = p[right];
                p[right] = tmp;
            }
        }
        return p;
    }

    //Bubble algorithm
    private int[] sort23(int[] p) {
        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
                if (p[i] < p[j]) {
                    swapValue( p[i], p[j]);
                }
            }
        }
        return p;
    }

    private void swapValue(int x, int y) {
        if (x == y) {
            return;
        }
        int tmp = x;
        x = y;
        y = tmp;
    }

    private int[] modifiedCountingSort(int[] p, int k) {
        int[] tmp = new int[k];
        for (int i = 0; i < k; i++) {
            tmp[i] = 0;
        }
        for(int j=0;j<p.length;j++){
            tmp[p[j]]=tmp[p[j]]+1;
        }
        for (int i = 1; i < k; i++) {
            tmp[i] = tmp[i]+tmp[i-1];
        }
        int[] t=new int[p.length];
        for(int i=0;i<p.length;i++){
            t[i]=tmp[i];
        }


        for(int i=1;i<p.length;i++){
            while(t[i]!=p[i]){
                k=p[i];
                swapValue(tmp[p[i]],p[i]);
            }
            while(p[tmp[k]]==k){
                tmp[k]=tmp[k]-1;
            }
        }
        return p;
    }

}
