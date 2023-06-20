import java.util.ArrayList;
import java.util.Scanner;

public class Openlogix {
    static Library lib = new Library();

    static void printMenu() {
        System.out.println("Hi, what would you like to do? Press the number from (1-5)");
        System.out.println("1) Add Book\n2) Add User\n3) Search Book\n4) Search User\n5) Exit");
    }

    public static void main(String[] args) {
        printMenu();
        Scanner scan;
        int userInput = -1;

        while(userInput != 5) {
            scan = new Scanner(System.in);
            userInput = scan.nextInt();

            while(!(userInput > 0 && userInput <= 5) ) {
                printMenu();
                scan = new Scanner(System.in);
                userInput = scan.nextInt();
            }
            switch (userInput) {
                case 1:
                    lib.addBook("Harry Potter", "Someone");
                    System.out.println("Added Book to the Library");
                    break;
                case 2:
                    lib.addUser("Sai","8636488913");
                    System.out.println("added user to Library");
                    break;
                case 3:
                    System.out.println("Searching");
                    ArrayList<Book> results = lib.searchBook("Harry Potter");
                    System.out.println("Found: " + results.size());
                    for(Book result: results) {
                        System.out.println(result);
                    }
                    break;
                case 4:
                    System.out.println("searching user");
                    ArrayList<User> names = lib.searchUser("Sai");
                    System.out.println("Found: " + names.size());
                    for(User name: names) {
                        System.out.println(name);
                    }
                    break;
                default:
                    System.out.println("EXIT");
            }
        }
    }
}
