import org.junit.Test;

/**
 * Created by xmc1993 on 16/9/21.
 */
public class ExecutorTest {

    @Test
    public void testInfo(){
        int i = Runtime.getRuntime().availableProcessors() * 2;  //getRuntime是Runtime类的工厂方法、availableProcessors方法是Runtime对象得到当前虚拟机中可以使用的线程数量
        System.out.println(i);
    }
}
