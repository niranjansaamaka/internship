import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the temperature");
        double temp = sc.nextDouble();
        System.out.println("Please enter the units C or F");

        String unit = sc.next();
        if (unit.equals("C"))
        {
            double con = (temp * 9 / 5) + 32;
            System.out.println("the Fahrenheit temperature is " + con);
        }
        else if(unit.equals("F"))
        {
            double con=((temp-32)*5/9);
            System.out.println("the Celsius Temperature is "+con);
        }
    }
}