package com.xmc.algorithm.util;

/**
 * Created by xmc1993 on 16/9/26.
 */
public abstract class UF {

    int[] ufs;//N个点最初为N个连通分量 每个点的祖先点均为自己
    int count;//连通分量数字最初被初始化为N个

    private UF(){}

    public UF(int N){
        ufs = new int[N];
        for (int i = 0; i < N; i++) {
            ufs[i] = i;
        }
        count = N;
    }

    /**
     *没输入一个连接关系都调用改方法进行归并
     * @param p
     * @param q
     */
    public abstract void union(int p, int q);

    /**
     * 判断两个点是否连通 即判断两个点的祖先点是否相同 将会用到find方法
     * @param p
     * @param q
     * @return
     */
    public boolean connected(int p, int q){
        return find(p) == find(q);
    }

    /**
     *查找一个点的祖先点
     * @param p
     * @return
     */
    abstract int find(int p);

    /**
     * 返回连通分量的数量
     * @return
     */
    public int count(){
        return count;
    }



}
