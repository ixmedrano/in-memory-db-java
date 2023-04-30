import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InMemoryDatabase {
    private Map<Integer, String> database;

    public InMemoryDatabase() {
        database = new HashMap<>();
    }

    // Create
    public void create(int id, String value) {
        if (database.containsKey(id)) {
            System.out.println("Error: Record with ID " + id + " already exists.");
        } else {
            database.put(id, value);
        }
    }

    // Read
    public String read(int id) {
        return database.get(id);
    }

    // Update
    public void update(int id, String newValue) {
        if (database.containsKey(id)) {
            database.put(id, newValue);
        } else {
            System.out.println("Error: Record with ID " + id + " not found.");
        }
    }

    // Delete
    public void delete(int id) {
        if (database.containsKey(id)) {
            database.remove(id);
        } else {
            System.out.println("Error: Record with ID " + id + " not found.");
        }
    }

    public static void main(String[] args) {
        InMemoryDatabase db = new InMemoryDatabase();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a command (CREATE, READ, UPDATE, DELETE, EXIT):");
            String command = scanner.nextLine().trim().toUpperCase();

            switch (command) {
                case "CREATE":
                    System.out.println("Enter ID and value separated by a space:");
                    int createId = scanner.nextInt();
                    String createValue = scanner.nextLine().trim();
                    db.create(createId, createValue);
                    break;

                case "READ":
                    System.out.println("Enter ID to read:");
                    int readId = scanner.nextInt();
                    scanner.nextLine(); 
                    String readValue = db.read(readId);
                    if (readValue == null) {
                        System.out.println("Error: Record with ID " + readId + " not found.");
                    } else {
                        System.out.println("Value: " + readValue);
                    }
                    break;

                case "UPDATE":
                    System.out.println("Enter ID and new value separated by a space:");
                    int updateId = scanner.nextInt();
                    String updateValue = scanner.nextLine().trim();
                    db.update(updateId, updateValue);
                    break;

                case "DELETE":
                    System.out.println("Enter ID to delete:");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine(); 
                    db.delete(deleteId);
                    break;

                case "EXIT":
                    scanner.close();
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid command. Please try again.");
                    break;
            }
        }
    }
}
