import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d, m, y;
        int c_d, c_m, c_y;
        int days, months, years;

        System.out.print("Enter birth day, month, year (separated by spaces): ");
        d = sc.nextInt();
        m = sc.nextInt();
        y = sc.nextInt();

        System.out.print("Enter current day, month, year (separated by spaces): ");
        c_d = sc.nextInt();
        c_m = sc.nextInt();
        c_y = sc.nextInt();

        if (c_d < d) {
            c_d += 30;
            c_m -= 1;
        }

        days = c_d - d;

        if (c_m < m) {
            c_m += 12;
            c_y -= 1;
        }

        months = c_m - m;
        years = c_y - y;

        System.out.printf("Your Age is: %d years, %d months, %d days\n", years, months, days);
    }
}