import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите год:");

            int year = scanner.nextInt();
            if (year == 0) {
                break;
            } else if (isLeapYear(year)) {
                // здесь нужно вывести результат
                System.out.println("12.09." + year);
            } else {
                System.out.println("13.09." + year);
            }
        }
    }
    public static boolean isLeapYear(int year) { // 2000, вывод: 12.09.2000 - високосный.
        // является ли переданный год високосным?
        if (year % 400 == 0) { //год, номер которого кратен 400, — високосный;
            return true;
        } else if (year % 100 == 0) { // остальные годы, номер которых кратен 100, — не високосные
            // (например, годы 1700, 1800, 1900, 2100, 2200, 2300);
            return false;
        } else if (year % 4 == 0) { // остальные годы, номер которых кратен 4, — високосные.
            return true;
        } else {
          return true;
       }
    }
}