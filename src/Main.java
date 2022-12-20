import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ReportGenerator reportGenerator = new ReportGenerator();
        printMenu();
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while (input != 0) {
            if (input == 1) {
                reportGenerator.countAllMonthlyReports();
                System.out.println("Месячные отчёты загружены");
            }
            if (input == 2) {
                reportGenerator.countAnnualReport();
                System.out.println("Годовой отчёт загружен");
            }
            if (input == 3) {
                reportGenerator.checkReports();
            }
            if (input == 4) {
                System.out.println("Месячный отчёт: \n");
                reportGenerator.printAllInfoMonthlyReports();
            }
            if (input == 5) {
                System.out.println("Годовой отчёт: \n");
                reportGenerator.printInfoYearReports();
            }
            if (input == 6) {
                return;
            }
            System.out.println("Программа завершена");
            printMenu();
            input = scanner.nextInt();
        }
    }

    private static void printMenu() {
        System.out.println("Выберите цифру команды, которую хотите запустить");
        System.out.println("1 : Считать все месячные отчёты\n" +
                "2 : Считать годовой отчёт\n" +
                "3 : Сверить отчёты\n" +
                "4 : Вывести информацию о всех месячных отчётах\n" +
                "5 : Вывести информацию о годовом отчёте\n" + "6 : Выйти из программы");
    }
}

