import sun.nio.cs.ext.Big5;

import java.lang.reflect.Array;
import java.math.BigDecimal;

public class StringValidator {


    String example;
    private char[] value;

   boolean isUpperCase(String string) {

        char[] charArray = string.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if( Character.isLetter(charArray[i]) ){
                if( !Character.isUpperCase( charArray[i] ))
                    return false;
            }
        }

       return true;
    }
}
