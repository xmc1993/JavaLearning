import com.xmc.Utils.IOUtil;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by xmc1993 on 16/9/21.
 */
public class IoUtilTest {
    private String path = "";

    @Before
    public void init(){
        path = this.getClass().getClassLoader().getResource("").getPath();
        path += "../classes/data/test.txt";
    }

    @Test
    public void testReadFile() throws IOException {
        IOUtil.readFile(path);

    }

    @Test
    public void testWriteFile() throws IOException {
        IOUtil.writeFile(path, "hello stream");
    }
}
