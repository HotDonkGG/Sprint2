import java.util.ArrayList;
import java.util.HashMap;
import  java.util.Scanner;
// Импортируйте нужные классы

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> musicGroups = new HashMap<>(); // Объявите и проиницализируйте хеш-таблицу musicGroups
        musicGroups.put("The Beatles", 1960);
        musicGroups.put("Rammstein", 1994);
        musicGroups.put("Queen", 1970);
        musicGroups.put("Led Zeppelin", 1968);
        musicGroups.put("Black Sabbath", 1968);
        musicGroups.put("AC/DC", 1973);
        musicGroups.put("The Rolling Stones", 1962);
        musicGroups.put("The Who", 1964);
        musicGroups.put("Nightwish", 1996);
        musicGroups.put("Nirvana", 1987);
        musicGroups.put("Guns N’ Roses", 1985);
        musicGroups.put("Scorpions", 1965);
        musicGroups.put("Kiss", 1973);
        musicGroups.put("The Doors", 1965);

        System.out.println("Легендарные группы, год основания которых вы можете узнать:");
        for (String group : musicGroups.keySet()) { // Распечайте список групп
            System.out.println(group);
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите опцию");
            System.out.println("1 - Узнать год основания группы");
            System.out.println("2 - Добавить любимую группу");
            System.out.println("3 - Выйти из приложения");
            int command = Integer.parseInt(scanner.nextLine());
            if (command == 1) {
                System.out.println("Введите название группы"); // "Введите название группы"
                 // "Введите название группы"
                String keyGroup = scanner.nextLine(); // keyGroup
                Integer year = musicGroups.get(keyGroup); // year
                System.out.println("Год основания " + keyGroup); // "Год основания " + keyGroup
                System.out.println(year);

            } else if (command == 2) {
                System.out.println("Добавьте свою любимую группу\n Введите её название"); // "Добавьте свою любимую группу"
                 // "Введите её название"
                String nameGroup = scanner.nextLine();// nameGroup
                System.out.println("Введите год основания"); // "Введите год основания"
Integer bornYear = Integer.parseInt(scanner.nextLine());
                //Integer bornYear = scanner.nextInt(); // bornYear
                musicGroups.put(nameGroup, bornYear);
                System.out.println("Информация о группе " + nameGroup + " добавлена.");

            } else if (command == 3) {
              break; // Остановите цикл
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }
}