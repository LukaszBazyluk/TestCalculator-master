import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
@RunWith(JUnitParamsRunner.class)
public class CalculatorParametrizedTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception{
        calculator = new Calculator();
    }

    @Parameters({"2,2,4", "10,10,20","3,4,7"})
    @Test
    public void testAddition(int a, int b, int expected) {

        //when
        int result = calculator.add(a,b);
        //then
        Assert.assertEquals(expected,result);

    }

    @Parameters({"6,2,4", "10,5,5", "6,4,2"})
    @Test
    public void testSubstraction(int a , int b , int expected) {
        //when
        int result = calculator.subtraction(a,b);

        //then
        Assert.assertEquals(expected,result);
    }
    @Parameters({"2,2,4" , "4,4,16", "10,2,20"})
    @Test
    public void testDoubleValue(int a , int b , int expected){

        //when
        int result = calculator.doubleValue(a,b);

        //then
        Assert.assertEquals(expected,result);
    }

    @Parameters({"10,5,2", "6,1,6", " 10, 5, 2"})
    @Test
    public void testDivision(int a , int b, int expected){
        //when
        int result = calculator.division(a,b);
        //then
        Assert.assertEquals(expected,result);

    }



}
