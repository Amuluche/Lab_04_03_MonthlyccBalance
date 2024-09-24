//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ccBalance = 5000;
        double interest = 0.17;

        double month1Balance = ccBalance * interest;
        System.out.println("your balance after the 1st month is " + month1Balance);

        double month2Balance = month1Balance * interest;
        System.out.println("your balance after the 2nd month is " + month2Balance);
    }
}