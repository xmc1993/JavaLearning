import org.junit.Test;

/**
 * Created by xmc1993 on 16/9/21.
 */
public class CommenTest {

    @Test
    public void testMock(){
        System.out.println(mock(10));
    }

    private static int mock(int param){
        if (param == 0){
            return 0;
        }

        if (param == 1){
            return 1;
        }

        return mock(param - 1) + mock(param -2 );
    }
}
