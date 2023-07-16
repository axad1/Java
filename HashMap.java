import java.util.HashMap;

public class Main {
  public static void main(String[] args) {

    HashMap<String, String> cities = new HashMap<>();

    // Add keys and values (Country, City)
    cities.put("England", "London");
    cities.put("Germany", "Berlin");
    cities.put("Norway", "Oslo");
    cities.put("USA", "Washington DC");

    cities.get("England");
    cities.remove("England");

    cities.size();
    cities.keySet();
    cities.values();

    cities.clear();

  }
}