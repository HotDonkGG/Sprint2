import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> statesCapitals = new HashMap<>();
        statesCapitals.put("Канада", "Торонто");
        statesCapitals.put("Ирак", "Багдад");
        statesCapitals.put("Австрия", "Вена");
        System.out.println(statesCapitals);
        statesCapitals.put("Канада", "Оттава");
        System.out.println(statesCapitals);
    }
}