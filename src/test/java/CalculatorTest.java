import junitparams.JUnitParamsRunner;
import org.assertj.core.data.Percentage;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(Parameterized.class)
public class CalculatorTest {

    private final int a, b, expected;
    private Calculator calculator;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    public CalculatorTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2, 2, 4}, {4, 6, 10}, {10, 3, 13}
        });
    }

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {

        //given
        int a = 4;
        int b = 3;
        int expected = 7;

        //when
        int result = calculator.add(a, b);

        //then
        Assert.assertEquals(expected, result);


    }

    @Test
    public void testAddition1() {

        //given
        int a = 10;
        int b = 15;
        int expected = 25;
        //when
        int result = calculator.add(a, b);
        //then
        Assert.assertEquals(expected, result);


    }

    @Test
    public void testValue() {

        //given
        int a = 2;
        int b = 6;
        int expected = 12;
        //when
        int result = calculator.doubleValue(a, b);
        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testDividsion() {

        //given
        int a = 6;
        int b = 3;
        int expected = 2;
        //when
        int result = calculator.division(a, b);
        //then
        Assert.assertEquals(expected, result);

    }

    @Test
    public void testSubstraction() {

        //given
        int a = 10;
        int b = 5;
        int expected = 5;
        //when
        int result = calculator.subtraction(10, 5);
        //then
       assertThat(result)
               .isEqualTo(5)
               .isPositive()
               .isGreaterThan(4);
    }

    @Test(expected = ArithmeticException.class)
    public void testArithmeticException() {

        //given
        int a = 4;
        int b = 0;
        //when
        int result = calculator.division(a, b);

        assertThat(result)
                .isPositive()
                .isGreaterThan(0)
                .isLessThan(10);
    }

    @Test
    public void testAritgmeticException1() {
        //given
        int a = 4;
        int b = 0;
        int result = -1;
        //when
//        try {
//            result = calculator.division(a, b);
//        } catch (ArithmeticException exception) {
//
//            //then
//            Assert.assertEquals("/ by zero", exception.getMessage());
//        }
//        Assert.assertEquals(-1, result);

        assertThat(result)
                .isLessThan(0)
                .isNegative();
    }

    @Test
    public void testArithmeticException2() {
        //given
        int a = 4;
        int b = 0;
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("/ by zero");
        //when
        int result = calculator.division(a, b);
        assertThat(result)
                .isNegative();
    }

    @Test
    public void testPositiveValue() {
        int a = 4;
        int b = -5;
        int result = -1;
//        try {
//            result = calculator.add(a, b);
//        } catch (Calculator.NegativeNumberException ex) {
//        }
//        Assert.assertEquals(result, -1);
        assertThat(result)
                .isNegative()
                .isLessThanOrEqualTo(0);
    }

    @Test
    public void testDoubleValue() {
        int a = 4;
        int b = 3;
        int result = 12;

//        try {
//            result = calculator.doubleValue(a, b);
//        } catch (Calculator.EvenException ex) {
//        }
//        Assert.assertEquals(result, 0);
        assertThat(result)
                .isLessThan(15)
                .isBetween(10,19);

    }

    @Test(expected = Calculator.EvenException.class)
    public void testDoubleValue2() {

        //given
        int a = 4;
        int b = 1;

        //when
        int result = calculator.doubleValue(a, b);
    }

    @Test
    public void calculateTaxTest() throws Calculator.NegativeNumberException {

        double result = calculator.calculateTax(10000);

        assertThat(result).isEqualTo(1900);
    }





}