package com.xmc.nlp;

import org.ansj.splitWord.analysis.ToAnalysis;

/**
 * Created by xmc1993 on 2016/12/27
 */
public class TestNLP {

    public static void main(String[] args){
            String str = "2016秋冬装新款女装潮白色韩版毛呢外套女羊毛呢子大衣中长款学生" ;
            System.out.println(ToAnalysis.parse(str));
    }
}
