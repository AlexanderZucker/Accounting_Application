import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) { //Считать все отчеты
                MonthlyReport.reedMonthlyReport();
                YearlyReport.reedYearlyReport();
            } else if (command == 2) { //Сверить отчеты
                CheckReports.checkReports();
            } else if (command == 3) { //Вывести информацию обо всех месячных отчетах
                MonthlyReport.printMonthlyReport();
            } else if (command == 4) { //Вывести информацию о годовом отчете
                YearlyReport.printYearlyReport();
            } else if (command == 0) { //Выход
                System.out.println("Программа завершена.");
                return;
            } else {
                System.out.println("Ошибка! Неверное значение.");
                System.out.println("Попробуйте ещё раз.");
            }

        }
    }

    public static void printMenu() {
        System.out.println("Выберите нужный пункт меню:");
        System.out.println("1. Считать отчеты.");
        System.out.println("2. Сверить отчеты.");
        System.out.println("3. Вывести информацию обо всех месячных отчетах.");
        System.out.println("4. Вывести информацию о годовом отчете.");
        System.out.println("0. Выход.");
    }
}