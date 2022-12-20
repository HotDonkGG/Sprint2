import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ExpensesManager {
    HashMap<String, ArrayList<Double>> expensesByCategories;

    ExpensesManager() {
        expensesByCategories = new HashMap<>();
    }

    double saveExpense(double moneyBeforeSalary, String category, double expense) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (expensesByCategories.containsKey(category)) {
            ArrayList<Double> expenses = expensesByCategories.get(category);
            expenses.add(expense);
        } else {
            ArrayList<Double> expenses = new ArrayList<>();
            expenses.add(expense);
            expensesByCategories.put(category, expenses);
        }
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpensesByCategories() {
        for (String category : expensesByCategories.keySet()) {
            System.out.println(category);
            ArrayList<Double> expenses = expensesByCategories.get(category);
            for (Double expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    double findMaxExpenseInCategory(String category) {
        double maxExpense = 0;
        if (expensesByCategories.containsKey(category)) {
            ArrayList<Double> expenses = expensesByCategories.get(category);
            for (Double expense : expenses) {
                if (expense > maxExpense) {
                    maxExpense = expense;
                }
            }
        } else {
            System.out.println("Такой категории пока нет.");
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expensesByCategories.clear();
        System.out.println("Траты удалены.");
    }

    double getExpensesSum() {
        Double sum = 0.0;
        Collection<ArrayList<Double>> values = expensesByCategories.values();
        for (ArrayList<Double> value : values) {
            for (Double aDouble : value) {
                sum += aDouble;
            }
        }
        return sum;

    }

    void removeCategory(String category) {
       expensesByCategories.remove(category);
    }

    String getMaxCategoryName() {
        double maxCategorySum = 0;
        String maxCategoryName = "";
        for (Map.Entry<String, ArrayList<Double>> stringArrayListEntry : expensesByCategories.entrySet()) {
            String innerCustomerName = stringArrayListEntry.getKey();
            ArrayList<Double> value = stringArrayListEntry.getValue();
            Double sum = 0.0;
            for (double orderPrice : value ) {
                sum += orderPrice;
            }
            if (sum > maxCategorySum) {
                maxCategorySum = sum;
                maxCategoryName = innerCustomerName;
            }
        }


        return maxCategoryName;
    }

   /* ... // Напишите метод для получения суммы всех трат

            ... // Напишите метод для удаления категории

            ... // Напишите метод для получения категории, где размер трат больше всего
    // Используйте эти переменные для сохранения промежуточных значений
    double maxCategorySum = 0;
    String maxCategoryName = "";
*/
}