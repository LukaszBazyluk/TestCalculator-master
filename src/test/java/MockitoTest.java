import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.verification.VerificationMode;

import java.util.List;

import static com.sun.javaws.JnlpxArgs.verify;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.never;
@RunWith(JUnitParamsRunner.class)
public class MockitoTest {

    @Mock
    private List list;
    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void mockitoTest(){

        //given
        List list = mock(List.class);
        when(list.get(anyInt())).thenReturn("test");

        //when
        String result = (String) list.get(5);
        String result1 = (String) list.get(2);
        String result2 = (String) list.get(4);

        //then
        assertThat(result).isEqualTo("test");
        assertThat(result1).isEqualTo("test");
        assertThat(result2).isEqualTo("test");
    }

    @Test
    public void mockitoTestDifferentReturnedValues(){

        //given
        List list = mock(List.class);
        when(list.get(eq(0))).thenReturn("test1");
        when(list.get(eq(2))).thenReturn("test2");
        when(list.get(eq(6))).thenReturn("test3");

        //when
        String result = (String) list.get(0);
        String result1 = (String) list.get(2);
        String result2 = (String) list.get(6);

        //then
        assertThat(result).isEqualTo("test1");
        assertThat(result1).isEqualTo("test2");
        assertThat(result2).isEqualTo("test3");

    }

    @Test
    public void mockitoVerifyAddMethodCall(){
        //given
        List list = mock(List.class);

        //when
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");



        //then
        Mockito.verify(list).add(eq("test1"));
        Mockito.verify(list).add(eq("test2"));
        Mockito.verify(list).add(eq("test3"));
        Mockito.verify(list).add(eq("test4"));

    }

    @Test
    public void MockitoHowManyTimesVerify() {

        //given
        List list = mock(List.class);

        //when
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        //odkomentowac gdy testuje sie .never()
//        list.remove(5);
        //then
        Mockito.verify(list, times(4)).add(anyString());
        Mockito.verify(list, never()).remove(anyInt());
    }
}
