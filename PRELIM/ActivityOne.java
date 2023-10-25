//John Louie R. Gaborno BSIT 2B
import java.util.Scanner;

class ActivityOne {
    public static void main(String args[]) {
        System.out.println("Activity One: What does the animal say?");
        Selections choose = new Selections();
        choose.choices();
    }
}

class Dog {
    public void makeSound() {
        System.out.println("Arf Arf Grr!");
    }
}

class Cat extends Dog {
    @Override
    public void makeSound() {
        System.out.println("meow! meow! meow!");
    }
}

class Trex extends Dog {
    @Override
    public void makeSound() {
        System.out.println("Grraawwwr Rawrrrrr!");
    }
}

class Frog extends Dog {
    @Override
    public void makeSound() {
        System.out.println("Kokak Kokak Kokak!");
    }
}

class Frog extends Dog {
    @Override
    public void makeSound() {
        System.out.println("Kokak Kokak Kokak!");
    }
}

class Frog extends Dog {
    @Override
    public void makeSound() {
        System.out.println("Kokak Kokak Kokak!");
    }
}

class Frog extends Dog {
    @Override
    public void makeSound() {
        System.out.println("Kokak Kokak Kokak!");
    }
}

class Frog extends Dog {
    @Override
    public void makeSound() {
        System.out.println("Kokak Kokak Kokak!");
    }
}

class Selections {
    private Scanner scan = new Scanner(System.in);

    public void choices() {
        int number;
        System.out.println("Select an animal: ");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Trex");
        System.out.println("4. Frog");
        System.out.println("\nEnter a number: ");
        number = scan.nextInt();

        switch (number) {
            case 1:
                System.out.println("Animal: Dog");
                Dog dog = new Dog();
                dog.makeSound();
                break;
            case 2:
                System.out.println("Animal: Cat");
                Cat cat = new Cat();
                cat.makeSound();
                break;
            case 3:
                System.out.println("Animal: Trex");
                Trex trex = new Trex();
                trex.makeSound();
                break;
            case 4:
                System.out.println("Animal: Frog");
                Frog frog = new Frog();
                frog.makeSound();
                break;
            default:
                System.out.println("Out of the choices");
        }
    }
}