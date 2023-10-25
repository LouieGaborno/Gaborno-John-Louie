import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.println("Menu:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Cow");
        System.out.println("4. Frog");
        System.out.println("5. Trex");
        System.out.println("6. Wolf");

        System.out.println("Enter the number of an animal (or 'exit' to quit): ");

        while (true) {
            System.out.print("Your choice: ");
            String userInput = scanner.nextLine().toLowerCase().trim();

            if (userInput.equals("exit")) {
                break;
            }

            String sound = getAnimalSoundByChoice(userInput);
            System.out.println(sound);
        }

        System.out.println("Goodbye!");
        scanner.close();
    }

    private static String getAnimalSoundByChoice(String choice) {
        switch (choice) {
            case "1":
                return "Animal: Dog\nSound: Arf Arf Grr";
            case "2":
                return "Animal: Cat\nSound: Meow meow";
            case "3":
                return "Animal: Cow\nSound: Mooooo";
             case "4":
                return "Animal: Frog\nSound: Kokak KOKAK!";
             case "5":
                return "Animal: Trex\nSound: RAAAWRRR GRRRAWR!";
             case "6":
                return "Animal: Wolf\nSound: AWooooooooo";

    
            default:
                return "Animal not found.";
        }
    }
}
