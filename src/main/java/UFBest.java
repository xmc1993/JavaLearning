
/**
 * Created by xmc1993 on 16/9/26.
 *
 * 加权quick-union法
 * 还不是路径压缩
 *
 * 任意节点的深度最多为lgN
 *
 * 对于加权quick-union算法和N个触点，在最坏的情况下find()、connected()和union()的成本增长数量级为logN
 *
 * 以空间换取时间 使用了N大小的sz数组让算法的时间复杂度从最差平方级降到了最差logN级
 */
public class UFBest extends UF {
    int[] sz;

    public UFBest(int N){
        super(N);
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            sz[i] = 1;
        }
    }

    @Override
    public void union(int p, int q) {
        int pID = find(p);
        int qID = find(q);
        if(pID == qID) return;

        if (sz[pID] >= sz [qID]){
            ufs[qID] = pID;
            sz[pID] += sz[qID];
        }else {
            ufs[pID] = qID;
            sz[qID] += sz[pID];
        }
        count--;
    }

    @Override
    int find(int p) {
        if (ufs[p] == p) return p;
        return find(ufs[p]);
    }

    public static void main(String[] args) {
        int n = StdIn.readInt();
//        UF uf = new UFBest(n);
        UF uf = new UFEasy(n);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");
    }
}
