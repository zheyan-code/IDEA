package starter;
import java.util.regex.*;
public class AllClassOfRegex {
    String regex;
    String input;
    AllClassOfRegex(String regex, String input) {
        this.regex = regex;
        this.input = input;
    }
    public String getRegex() {
        return regex;
    }
    public String getInput() {
        return input;
    }
    public void setRegex(String regex) {
        this.regex = regex;
    }
    public void setInput(String input) {
        this.input = input;
    }
    public boolean matches() {
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String numberRegex="^[-+]?\\d+(\\.\\d)?$";
        String dateRegex="^\\d{2}+/\\d{2}+/\\d{4}$";
        String urlRegex="^https?//[a-zA-Z0-9&%_/-]+(?:/[a-zA-Z0-9&%_./-]*)?$";


    }
}
