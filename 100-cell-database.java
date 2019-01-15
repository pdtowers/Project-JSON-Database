import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Database {

  public static void main(String[] args) {

    String[] database = new String[100];
    Arrays.fill(database, "");
    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNextLine()) {

      try {

        String input = scanner.nextLine();
        String[] stringArray = input.split(" ");
        String action = stringArray[0];

        if (action.equals("exit")) {
          System.exit(0);
        }

        int position = Integer.parseInt(stringArray[1]) - 1;
        StringBuilder entry = new StringBuilder();

        for (int i = 2; i < stringArray.length - 1; i++) {
          entry.append(stringArray[i]);
          entry.append(" ");
        }

        entry.append(stringArray[stringArray.length - 1]);
        String arrayEntry = new String(entry);

        switch (action) {

          case "get":
            get(position, database);
            break;
          case "set":
            set(position, arrayEntry, database);
            break;
          case "delete":
            delete(position, database);
            break;
          default:
            System.out.println("ERROR");
            break;

        }

      } catch (ArrayIndexOutOfBoundsException | NumberFormatException exception) {
        System.out.println("ERROR");
      }
    }
  }

  private static void get(int position, String[] database) {
    if (database[position].equals("")) {
      System.out.println("ERROR");
    } else {
      System.out.println(database[position]);
    }
  }

  private static void set(int position, String arrayEntry, String[] database) {
    Array.set(database, position, arrayEntry);
    System.out.println("OK");
  }

  private static void delete(int position, String[] database) {
    database[position] = "";
    System.out.println("OK");
  }

}
