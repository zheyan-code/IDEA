package starter;
import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("god");
        list.add("wer");
        list.remove("wer");
        System.out.println(list);
    }
}
