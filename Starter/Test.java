package starter;

public class Test {
    private String text;
    public Test(String s){
        this.text=s;
    }
    public static void main(String[] args){
        Test test=new Test("ABC");
        System.out.println(test.text.toLowerCase());
    }
}
