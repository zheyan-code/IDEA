package starter;
import java.util.Date;
import java.util.Scanner;
public  class Loan {
    double annualInterestRate=2.5;
    int numberOfYears=1;
    double loanAmount=100;
    static Date loanDate;
    public Loan() {}
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate=annualInterestRate;
        this.numberOfYears=numberOfYears;
        this.loanAmount=loanAmount;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public int getNumberOfYears() {
        return numberOfYears;
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public static Date getLoanDate() {
        loanDate=new Date();
        return loanDate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public double getMonthlyPayment(){
        return getTotalPayment()/(numberOfYears*12);
    }
    public double getTotalPayment(){
        return loanAmount*Math.pow((1+annualInterestRate),numberOfYears);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter annual interest rate: ");
        double annualInterestRate=sc.nextDouble();
        System.out.println("Enter number of years: ");
        int numberOfYears=sc.nextInt();
        System.out.println("Enter loan amount: ");
        double loanAmount=sc.nextDouble();
        Loan loan=new Loan(annualInterestRate,numberOfYears,loanAmount);
        Date loanDate=Loan.getLoanDate();
        String loanDateString=loanDate.toString();
        System.out.println(loanDateString);
        System.out.println("Monthly payment is "+loan.getMonthlyPayment());
        System.out.println("Total payment is "+loan.getTotalPayment());
    }
}
