package learn;

import com.xmc.learn.Rectangle;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by xmc1993 on 2017/3/20.
 */
public class RectangleTest {

    public int width;
    public int length;
    public Rectangle rectangle;

    @Before
    public void before() {
        //Todo init rectangleWithDouble
    }

    @Test
    public void testRectangleNormal() {
        width = 6;
        length = 10;
        rectangle.setWidth(width);
        rectangle.setLength(length);
        Assert.assertEquals(width * length, rectangle.getArea());
    }

    @Test
    public void testWidthValueError() {
        width = -1;
        length = 10;
        boolean res = false;
        try {
            rectangle.setWidth(width);
            rectangle.setLength(length);
        } catch (Exception e) {
            res = true;
        }
        Assert.assertTrue(res);
    }

    @Test
    public void testWidthValueErrorWithZero() {
        width = 0;
        length = 10;
        boolean res = false;
        try {
            rectangle.setWidth(width);
            rectangle.setLength(length);
        } catch (Exception e) {
            res = true;
        }
        Assert.assertTrue(res);
    }

    @Test
    public void testLengthValueError() {
        width = 1;
        length = -10;
        boolean res = false;
        try {
            rectangle.setWidth(width);
            rectangle.setLength(length);
        } catch (Exception e) {
            res = true;
        }
        Assert.assertTrue(res);
    }

    @Test
    public void testLengthValueErrorWithZero() {
        width = 1;
        length = 0;
        boolean res = false;
        try {
            rectangle.setWidth(width);
            rectangle.setLength(length);
        } catch (Exception e) {
            res = true;
        }
        Assert.assertTrue(res);
    }

    @Test
    public void testBothErrorValue() {
        width = -1;
        length = -5;
        boolean res = false;
        try {
            rectangle.setWidth(width);
            rectangle.setLength(length);
        } catch (Exception e) {
            res = true;
        }
        Assert.assertTrue(res);
    }

    @Test
    public void testPrint() {
        System.out.println("{\"msg\":\"\u6fc0\u52b1\u793c\u5238\u4e3a0,\u4e0d\u53d1\u9001\uff08\u914d\u7f6e\u4ef7\u683c\u4e3a0\u6216\u5de5\u4f5c\u91cf\u4e3a0\u6216\u672a\u8fbe\u5230\u6700\u4f4e\u6fc0\u52b1\u6807\u51c6\uff09\"}");
    }


    @After
    public void after() {
        //do nothing
    }
}
