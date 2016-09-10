/**
 * Created by Леночка on 10.09.2016.
 */
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Olena_Iklenko on 9/7/2016.
 */
public class JunitVideoTest {
    @Test
    public void getValueFromIndex() throws Exception {
        int index = 2;
        int [] array = {2, 3, 5, 6, 7};

        //Block 2
        JunitVideoTask getValue = new JunitVideoTask();
        int result = getValue.getValueFromIndex(index, array);
        Assert.assertEquals(5, result);
    }

    @Test
    public void getSum() throws Exception {
        JunitVideoTask getValue = new JunitVideoTask();
        int sum = getValue.getSum(3,6);
        Assert.assertEquals(9, sum);

    }

    @Test(expected=ArithmeticException.class)
    public void division1(){
        JunitVideoTask getValue = new JunitVideoTask();
        int res = getValue.division1(4,0);
    }

    @Test
    public void mult1(){
        JunitVideoTask getValue = new JunitVideoTask();
        int res = getValue.multiplication(60,8);
        Assert.assertEquals(480, res);
    }

    @Test
    public void substraction(){
        JunitVideoTask getValue = new JunitVideoTask();
        int res = getValue.substraction(56,3);
        if (res!=53) {Assert.fail("Error!");}
        //Assert.assertEquals(53, res);
    }

}