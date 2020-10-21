
import java.util.Random;

public class DS_lab4_2 {

    //Define a class to store weight and element information
    static class Node {
        double w;
        double x;

        public Node(double w, double x) {
            this.w = w;
            this.x = x;
        }

        public void set(double w, double x) {
            this.w = w;
            this.x = x;
        }
    }

    //Calculate the sum of the weights of this interval
    public static double getSum(Node[] nodes, int p, int q) {
        double result = 0;
        for (int i = p; i <= q; i++) {
            result = result + nodes[i].w;
        }
        return result;
    }

    //Exchange the values of elements and weights of two nodes
    public static void swap(Node p, Node q) {
        double x = p.x;
        double w = p.w;
        p.set(q.w, q.x);
        q.set(w, x);
    }

    public static int partition(Node[] nodes, int p, int q) {
        if (p < q) {
            int i = p - 1;
            Random r = new Random();
            int rnum = r.nextInt(q - p) + p;
            swap(nodes[q], nodes[rnum]);
            for (int j = p; j < q; j++) {
                if (nodes[j].x < nodes[q].x) {
                    i++;
                    swap(nodes[i], nodes[j]);
                }
            }
            swap(nodes[i + 1], nodes[q]);
            return i + 1;
        }
        return 0;
    }

    public static int findMidNumber(Node[] nodes, int p, int q) {
        if (p == q) {
            return q;
        }
        if (p < q) {
            int i = partition(nodes, p, q);
            double l = getSum(nodes, 0, i - 1);
            double r = getSum(nodes, i + 1, nodes.length - 1);
            if (l < 0.5 && r <= 0.5) {
                return i;
            } else if (l < r) {
                return findMidNumber(nodes, i + 1, q);
            } else {
                return findMidNumber(nodes, p, i - 1);
            }
        }
        return 0;
    }

    public static void main(String args[]) {
        Node[] nodes = new Node[7];
        double w[] = {0.1, 0.35, 0.05, 0.1, 0.15, 0.05, 0.2};
        double x[] = {4, 3, 12, 8, 7, 6, 5.2};
        for (int i = 0; i < w.length; i++) {
            nodes[i] = new Node(w[i], x[i]);
        }
        int i = findMidNumber(nodes, 0, nodes.length - 1);
        System.out.println("The selected sequence is as follows：");
        System.out.print("w:");
        for (int j = 0; j < nodes.length; j++) {
            System.out.print("   " + nodes[j].w);
        }
        System.out.println();
        System.out.print("x:");
        for (int j = 0; j < nodes.length; j++) {
            System.out.print("   " + nodes[j].x);
        }
        System.out.println();
        System.out.println("The index of the weighted median after the selection of fast track is as follows（0,1,...）：" + i + "  The weighted median was as follows:" + nodes[i].x);
    }
}