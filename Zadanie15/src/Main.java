import java.util.ArrayList;

/* public class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Шиншила");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");
        System.out.println("Сегодня в зоопарке можно увидеть кормления " + animals.size() + " животных:" + animals);
        System.out.println("Расписание кормлений:");
        for (String animal : animals) {
        System.out.println("В 9:00 - " + animals.get(1) + "\n" + "В 10:00 - " + animals.get(4) + "\n" + "В 11:00 - " + animals.get(0) + "\n" + "В 12:00 - " + animals.get(2) + "\n" + "В 13:00 - " + animals.get(3));
       /* System.out.println("В 10:00 - " + animals.get(4));
        System.out.println("В 11:00 - " + animals.get(0));
        System.out.println("В 12:00 - " + animals.get(2));
        System.out.println("В 13:00 - " + animals.get(3));
            break;
        }

        }
} */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");
        System.out.println("Сегодня в зоопарке можно увидеть кормления " + animals.size() + " животных:");
        System.out.println("Это будут:");
        for (String animal : animals)
            System.out.println(animal);{
            System.out.println("Расписание кормлений:" + "\n");
            System.out.println("В 9:00 - " + animals.get(1));
            System.out.println("В 10:00 - " + animals.get(4));
            System.out.println("В 11:00 - " + animals.get(0));
            System.out.println("В 12:00 - " + animals.get(2));
            System.out.println("В 13:00 - " + animals.get(3));
            }
    }
}

// "Сегодня в зоопарке можно увидеть кормления " + ... + " животных:"
        // "Это будут:"
		// "Шиншилла"
        // "Крокодил"
        // "Лев"
        // "Медведь"
        // "Слон"
        // "Расписание кормлений:"
        // "В 9:00 - "
        // "В 10:00 - "
        // "В 11:00 - "
        // "В 12:00 - "
        // "В 13:00 - " */