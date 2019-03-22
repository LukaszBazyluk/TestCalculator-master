import java.util.List;

public class StringValidate2 {

    public boolean isUpperCase(List<String> list) {

List<String> a = list;
        for (int i = 0; i < list.size(); i++) {
            if (!Character.isUpperCase(i)) {
                return false;
            }
        }
        return true;
    }


}
