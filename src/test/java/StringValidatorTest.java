import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;


@RunWith(JUnitParamsRunner.class)
public class StringValidatorTest {


    private StringValidator stringValidator;
    @Before
    public void setUp() throws Exception {
        stringValidator = new StringValidator();
    }

    @Test
    public void StringValidate(){


        //when
        boolean result = stringValidator.isUpperCase("Wojtek");
        boolean result1 = stringValidator.isUpperCase("wojtek");
        //then
        assertThat(result);


    }

    private void assertThat(boolean result) {
    }


}