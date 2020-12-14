import java.util.Scanner;

public class UngDungChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // xác định kiểu chuyển nhiệt độ bằng biến choice
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Mời bạn nhập độ F");
                    double fahrenheit = sc.nextDouble();
                    System.out.println(fahrenheit + " độ F bằng " + fahrenheitToCelsius(fahrenheit) + " độ C ");
                    break;
                case 2:
                    System.out.println("Mời bạn nhập độ C:");
                    double celsius = sc.nextDouble();
                    System.out.println(celsius + " độ C bằng " + celsiusToFahrenheit(celsius) + " đọ F ");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius * 9 / 5 + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
}
