

/**
 * Created by xmc1993 on 16/9/26.
 *
 * quick-find算法
 * 因为find方法特别快 时间复杂度为 1  connected的时间复杂度为2
 * 但是union的特别慢
 * 每次union访问数组的次数字在N+3(for循环N次＋2次find＋至少1次替换ID)－2N+1(for循环N次+2次find+最多N-1次替换ID)
 */
public class UFEasy extends UF {

    public UFEasy(int N){
        super(N);
    }

    @Override
    public void union(int p, int q) {
        int pID = find(p);
        int qID = find(q);
        if (pID == qID) return;

        for (int i = 0; i < ufs.length; i++) {
            if(ufs[i] == qID) ufs[i] = qID;
        }
        count--;
    }

    @Override
    int find(int p) {
        return ufs[p];
    }
}
