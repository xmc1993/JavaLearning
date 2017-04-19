package learn;

import com.xmc.learn.RectangleWithDouble;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by xmc1993 on 2017/3/20.
 */
public class RectangleWithDoubleTest {

    public double width;
    public double length;
    public RectangleWithDouble rectangleWithDouble;

    @Before
    public void before() {
        //Todo init rectangleWithDouble
    }

    @Test
    public void testRectangleNormal() {
        width = 6.1234;
        length = 10.3213213;
        rectangleWithDouble.setWidth(width);
        rectangleWithDouble.setLength(length);
        Assert.assertTrue(new Double(6.12).compareTo(rectangleWithDouble.getWidth()) == 0);
        Assert.assertTrue(new Double(10.32).compareTo(rectangleWithDouble.getWidth()) == 0);
    }

    @Test
    public void testWidthValueError(){
        width = -1.3213;
        length = 10.321312;
        boolean res = false;
        try {
            rectangleWithDouble.setWidth(width);
            rectangleWithDouble.setLength(length);
        }catch (IllegalArgumentException e){
            res = true;
        }
        Assert.assertTrue(res);
    }

    @Test
    public void testWidthValueErrorWithZero(){
        width = 0;
        length = 10.231321;
        boolean res = false;
        try {
            rectangleWithDouble.setWidth(width);
            rectangleWithDouble.setLength(length);
        }catch (IllegalArgumentException e){
            res = true;
        }
        Assert.assertTrue(res);
    }

    @Test
    public void testLengthValueError(){
        width = 1.312321;
        length = -10.321321;
        boolean res = false;
        try {
            rectangleWithDouble.setWidth(width);
            rectangleWithDouble.setLength(length);
        }catch (IllegalArgumentException e){
            res = true;
        }
        Assert.assertTrue(res);
    }

    @Test
    public void testLengthValueErrorWithZero(){
        width = 1.312;
        length = 0;
        boolean res = false;
        try {
            rectangleWithDouble.setWidth(width);
            rectangleWithDouble.setLength(length);
        }catch (IllegalArgumentException e){
            res = true;
        }
        Assert.assertTrue(res);
    }

    @Test
    public void testBothErrorValue(){
        width = -1.3123;
        length = -5.31232;
        boolean res = false;
        try {
            rectangleWithDouble.setWidth(width);
            rectangleWithDouble.setLength(length);
        }catch (Exception e){
            res = true;
        }
        Assert.assertTrue(res);
    }




    @After
    public void after() {
        //do nothing
    }
}
