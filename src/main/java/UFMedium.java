/**
 * Created by xmc1993 on 16/9/26.
 *
 * quick-union
 * union访问3次数组
 * 复杂度书上说不分析.......
 */
public class UFMedium extends UF {

    public UFMedium(int N){
        super(N);
    }

    @Override
    public void union(int p, int q) {
        int pID = find(p);
        int qID = find(q);
        if (pID == qID) return;

        ufs[pID] = qID;
        count--;
    }

    @Override
    int find(int p) {
        if (ufs[p] == p) return p;
        return find(ufs[p]);
    }
}
