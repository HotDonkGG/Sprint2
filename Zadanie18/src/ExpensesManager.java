import java.util.ArrayList;

public class ExpensesManager {
    ArrayList<Double> expenses;

    ExpensesManager() {
        expenses = new ArrayList<>();
    }

    double saveExpense(double moneyBeforeSalary, double expense) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses.add(expense);
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println("Трата № " + (i + 1) + ". Потрачено " + expenses.get(i) + " рублей");
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (Double exp : expenses) {
            if (exp > maxExpense) {
                maxExpense = exp;
            }
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expenses.clear();
        System.out.println("Список трат пуст.");
    }

    void removeExpense(double expense) {
        int index = 0;
        if (expenses.isEmpty()){ //равен 0 -- список трат пуст если true
        System.out.println("Список трат пуст.");
        }
        else if (expenses.contains(expense)) { // содержит ли другую строку в расходах
            int i = expenses.indexOf(expense);
            expenses.remove(i);
            System.out.println("Трата удалена!");
        }
        else {
            System.out.println("Такой траты нет.");
        }

    }

    // Добавьте метод removeAllExpenses()
    //... // Текст для печати: "Список трат пуст."

            // Добавьте метод removeExpense(double expense)
           /* ...  Текст для печати: "Список трат пуст."
        "Трата удалена!"
        "Такой траты нет." */



}