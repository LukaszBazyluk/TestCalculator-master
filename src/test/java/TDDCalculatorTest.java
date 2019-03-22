import com.sun.org.apache.xpath.internal.operations.Neg;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
@RunWith(JUnitParamsRunner.class)
public class TDDCalculatorTest {

    private TDDCalculator tddCalculator;


    @Before

    public void setUp() throws Exception {
        tddCalculator = new TDDCalculator();

    }

    @Test
    public void testAdditionMethod() {
        //when
        int result = tddCalculator.add(2, 5);

        //then
        Assert.assertEquals(result,7);
    }


    @Test(expected = Calculator.NegativeNumberException.class)
    public void testPositiveValue(){

        //whe
        int result = tddCalculator.add(-4,6);

    }

    @Test(expected = Calculator.NegativeNumberException.class)
    public void doubleValueTest(){
        //when
        int result = tddCalculator.doubleValue(2,5);

        //then
        assertEquals(result,10);

    }


    }
