import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.converters.Param;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CalculatorTest2 {

    private Calculator calculator;


    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }


    @Test
    @Parameters({"1000, 180", "1000000, 320000"})
    public void taxTest(double Value, double expected){

        double result = calculator.calculateTax(Value);

        assertThat(result).isEqualTo(expected);

    }
}
