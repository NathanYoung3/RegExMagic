import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ssn = InputHelper.getRegExString(scan, "Enter you SSN:", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("You SSN is: " + ssn);
        String studentMNumber = InputHelper.getRegExString(scan, "Enter your Student M Number: ", "(M|m)\\d{5}");
        System.out.println("Your Student M Number is: " + studentMNumber);
        String menuChoice = InputHelper.getRegExString(scan, "Menu: O - Open  S - Save  V - View  Q - Quit", "[OoSsVvQq]");
        System.out.println("You choose: " + menuChoice);
    }
}