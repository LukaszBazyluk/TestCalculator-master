import jdk.internal.dynalink.linker.LinkerServices;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;

@RunWith(JUnitParamsRunner.class)
public class StringValidate2Test {
    private  StringValidate2 stringValidate2;
    @Before

    public void dummy() {
        stringValidate2 = new StringValidate2();
    }
    
    @Parameters({"Mare , Piotrke , mamam"})
            @Test
    public void StringValidate2Test(){
        
        boolean result = stringValidate2.isUpperCase(Collections.emptyList());
        
        assertThat(result);
    }

    private void assertThat(boolean result) {
    }
}