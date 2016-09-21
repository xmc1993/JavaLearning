import com.xmc.threadLocal.ConnectionManager;
import org.junit.Test;

import java.sql.Connection;

/**
 * Created by xmc1993 on 16/9/21.
 */
public class ConnectionTest {

    @Test
    public void testGetConnection(){
        Connection connection = ConnectionManager.getConnection();
        System.out.println("over");
    }
}
