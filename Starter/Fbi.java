package starter;
import java.util.Scanner;
public class Fbi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an index for fibonacci number:");
        int index=input.nextInt();
        System.out.println("The Fibonacci number at "+index+" is "+fibo(index));
        System.out.println("The Fibonacci serial is:");
        for(int i=1;i<=index;i++){
            System.out.print(fibo(i)+" ");
        }
    }
    public static long fibo(int index){
        if(index==0){
            return 0;
        }
        if(index==1){
            return 1;
        }
        else{
            return fibo(index-1)+fibo(index-2);
        }
    }
}
