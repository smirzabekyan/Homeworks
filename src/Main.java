
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        knightAttack();
    }

    /*
     * Task 1
     * */
    public static void findCentury() {
        int year = sc.nextInt();
        if (year <= 0) {
            System.out.print("0 and negative is not allow"
                    + "for a year");
        } else if (year <= 100) {
            System.out.print("1st century\n");
        } else if (year % 100 == 0) {
            System.out.print(year / 100 + " century");
        } else {
            System.out.print(year / 100 + 1 + " century");
        }
    }

    /**
     * Task 2
     */
    public static void countSalary() {
        int grossSalary = sc.nextInt();
        int netSalary = (int) (grossSalary * 0.79 * 0.95);
        if (netSalary <= 100000) {
            netSalary = netSalary - 1500;
        } else if (netSalary <= 200000) {
            netSalary = netSalary - 3000;
        } else if (netSalary <= 500000) {
            netSalary = netSalary - 5500;
        } else if (netSalary <= 1000000) {
            netSalary = netSalary - 8500;
        } else {
            netSalary = netSalary - 15000;
        }
        System.out.println("The net salary is " + netSalary + "AMD");
    }

    /**
     * Task 3
     */
    public static void knightAttack() {
        System.out.print("x1 = ");
        int x1 = sc.nextInt();
        System.out.print("y1 = ");
        int y1 = sc.nextInt();
        System.out.print("x2 = ");
        int x2 = sc.nextInt();
        System.out.print("y2 = ");
        int y2 = sc.nextInt();
        if (((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)) == 5) {
            System.out.println("Knight attacks");
        } else {
            System.out.println("Knight doesn't attack");
        }
    }
}


