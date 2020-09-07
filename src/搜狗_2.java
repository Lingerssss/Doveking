/*
public class 搜狗_2 {
}
    int gethouse(int t,int * xa,int xalen)
    {
        if (t == 0)
        {
            return xalen;
        }
        int r = 2;
        for (int i = 2; i < xalen; i += 2)
        {
            double n_c = *(xa + i - 2);
            double n_a = *(xa + i - 1);
            double c_c = *(xa + i);
            double c_a = *(xa + i + 1);
            double t_a = c_c - (c_a / 2) - (n_c + n_a / 2);
            if (t_a < t)
            {
                continue;
            }
            if (t_a > t)
            {
                r++;
            }
            r++;
        }
        return r;
    }
*/
