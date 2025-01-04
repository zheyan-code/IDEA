package starter;
import java.math.BigInteger;
import java.util.Scanner;
public class BigNumberFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        BigInteger n = new BigInteger(s);
        double startTime = System.currentTimeMillis();
        fibonacci(n);
        double endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime)/1000.0 + "s");
    }

    public static BigInteger fibonacci(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ZERO;
        } else if (n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        else {
            BigInteger prev1=BigInteger.ZERO;
            BigInteger prev2=BigInteger.ONE;
            for(BigInteger i=BigInteger.TWO;i.compareTo(n)<=0;i=i.add(BigInteger.ONE)){
                BigInteger current=prev1.add(prev2);
                prev1=prev2;
                prev2=current;

            }
            return prev2;
        }

    }
}