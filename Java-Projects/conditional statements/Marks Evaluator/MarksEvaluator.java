import java.util.Scanner;

public class MarksEvaluator {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int eng, beng, math, his, geo, phy, chmy, lifeSin;
        int total;
        float avg, per;
        boolean hasFailed = false;

        System.out.print("Enter English Marks: ");
        eng = sc.nextInt();
        if (eng < 49) hasFailed = true;

        System.out.print("Enter Bengali Marks: ");
        beng = sc.nextInt();
        if (beng < 49) hasFailed = true;

        System.out.print("Enter Math Marks: ");
        math = sc.nextInt();
        if (math < 49) hasFailed = true;

        System.out.print("Enter History Marks: ");
        his = sc.nextInt();
        if (his < 49) hasFailed = true;

        System.out.print("Enter Geography Marks: ");
        geo = sc.nextInt();
        if (geo < 49) hasFailed = true;

        System.out.print("Enter Physics Marks: ");
        phy = sc.nextInt();
        if (phy < 49) hasFailed = true;

        System.out.print("Enter Chemistry Marks: ");
        chmy = sc.nextInt();
        if (chmy < 49) hasFailed = true;

        System.out.print("Enter Life Science Marks: ");
        lifeSin = sc.nextInt();
        if (lifeSin < 49) hasFailed = true;

        total = eng + beng + math + his + geo + phy + chmy + lifeSin;
        avg = total / 8.0f;
        per = (total / 800.0f) * 100.0f;

        if (hasFailed) 
        {
            System.out.println("You have failed.");
            System.out.printf("Total: %d\nAverage: %.2f\nPercentage: %.2f%%\nGrade: F\n", total, avg, per);
        } 
        else 
        {
            System.out.println("You have passed.");
            System.out.printf("Total: %d\nAverage: %.2f\nPercentage: %.2f%%\n", total, avg, per);

            if (per >= 90)
                System.out.println("Grade: A+");
            else if (per >= 80)
                System.out.println("Grade: A");
            else if (per >= 70)
                System.out.println("Grade: B");
            else if (per >= 60)
                System.out.println("Grade: C");
            else
                System.out.println("Grade: D");
        }

        sc.close();
    }
}