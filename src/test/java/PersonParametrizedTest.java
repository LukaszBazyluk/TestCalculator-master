import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
@RunWith(JUnitParamsRunner.class)
public class PersonParametrizedTest {

    @Test
    @Parameters({
            "19, true",
            "22, true" })
    public void personIsAdult(int age, boolean valid) throws Exception {
        Assert.assertEquals(new Person(age).isAdult(), valid);
    }


    private void assertThat() {
    }
}


