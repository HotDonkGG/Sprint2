import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExpensesManager {
     //ArrayList<Double> expensesByCategories; // Замените на таблицу с именем expensesByCategories
    HashMap<String, ArrayList<Double>> expensesByCategories;

    ExpensesManager() {
        expensesByCategories = new HashMap<>(); // Создайте таблицу
    }

    // Добавьте в метод ещё один параметр — category
    double saveExpense(double moneyBeforeSalary, double expense, String category) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        expensesByCategories.putIfAbsent(category, new ArrayList<>());// Замените на работу с таблицей
        expensesByCategories.get(category).add(expense);
        if (moneyBeforeSalary < 1000) {
        System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
    }
        return moneyBeforeSalary;
}


    void printAllExpensesByCategories() {
        // Замените логику для работы с таблицами
        for (Map.Entry<String, ArrayList<Double>> stringArrayListEntry : expensesByCategories.entrySet()) {
            System.out.println(stringArrayListEntry.getKey());
            ArrayList<Double> arrayListOfValues = stringArrayListEntry.getValue();
            for (Double insideArray : arrayListOfValues) {
                System.out.println(insideArray);
            }
        }


        /*for (int i = 0; i < expenses.size(); i++) {
            System.out.println("Трата № " + (i + 1) + ". Потрачено " + expenses.get(i) + " рублей");
        } */
    }

    // Метод должен принимать название категории и называться findMaxExpenseInCategory
    double findMaxExpenseInCategory(String category) {
        double maxExpense = 0;
        ArrayList<Double> doubles = expensesByCategories.get(category);
        if (doubles == null) {
            System.out.println("Такой категории пока нет.");

        }
        else {
            for (Double expense: doubles) {
                if(expense > maxExpense) {
                    maxExpense = expense;
                }
            }
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expensesByCategories.clear(); // Таблица называется иначе
        System.out.println("Траты удалены.");
    }
}