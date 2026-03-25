import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie: " + name + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<Bogie> passengerBogies = new ArrayList<>();

        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 60));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("General", 90));

        System.out.println("Before Sorting:");
        passengerBogies.forEach(System.out::println);

        passengerBogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting by Capacity (Ascending):");
        passengerBogies.forEach(System.out::println);
    }
}