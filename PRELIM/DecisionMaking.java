import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double FIRST = 140.2;
        final double SECOND = 142.4;
        final double THIRD = 153.2;

        System.out.println("Route to Moalboal");
        System.out.println("Default Routes");
        System.out.println("Cebu City (Start)");
        System.out.println("Minglanilla (Route 1)");
        System.out.println("San Fernando (Route 2)");
        System. out.println("CarCar (Route 3)");
        System.out.println("Barili (Route 4.1)");
        System.out.println("Dumanjug (Route 4.1.1)");
        System.out.println("Alcantara (Route 4.1.2)");
        System.out.println("Moalboal (End)");

        System.out.println("\n");

        System.out.println("Starting point is Cebu City:");

        System.out.println("Route 1 (Minglanilla)  ");

        System.out.println("Route 2 (San Fernando) ");

        System.out.println("Route 3 (Carcar)");

        System.out.println("Route 4.1 (Barili) Is Barili Obstructed? Yes = 1 No = 2 : ");
        int barili = scan.nextInt();

        if (barili == 2) {
            System.out.println("How fast are you going in km/h?: ");
            double speed1KmPerHour = scan.nextDouble();

            System.out.println("The recommended route is:");

            System.out.println("Cebu City (Start)");
            System.out.println("Minglanilla (Route 1)");
            System.out.println("San Fernando (Route 2)");
            System.out.println("CarCar (Route 3)(You are here)");
            System.out.println("Route 4.1 (Barili)");
            System.out.println("Route 4.1.1 (Dumajug)");
            System.out.println("Route 4.1.2 (Alcantara)");

            // Calculate ETA in hours
            double eta1 = FIRST / speed1KmPerHour;
            int hours1 = (int) eta1;
            int minutes1 = (int) ((eta1 - hours1) * 60); // Extract remaining minutes

            System.out.println("You reached Moalboal");
            System.out.println("Your Speed Is: " + speed1KmPerHour + " km/h");
            System.out.println("The Distance is: " + FIRST + " km");
            System.out.println("Your ETA is: " + hours1 + " hours and " + minutes1 + " minutes");
            return;
        } else {
            System.out.println("You are redirected in Route 4.2 (Sibonga)");
        }

        System.out.println("You are now in Route 4.2 (Sibonga)");

        System.out.println("Route 4.2.1 (Dumanjug) Is Dumanjug Obstructed? Yes = 1 No = 2: ");
        int dumanjug = scan.nextInt();

        if (dumanjug == 2) {
            System.out.println("How fast are you going in km/h?: ");
            double speed2KmPerHour = scan.nextDouble();

            System.out.println("The recommended route is: ");
            System.out.println("Cebu City (Start)");
            System.out.println("Minglanilla (Route 1)");
            System.out.println("San Fernando (Route 2)");
            System.out.println("CarCar (Route 3)");
            System.out.println("Sibonga (Route 4.2)");
            System.out.println("Route 4.2.1 (Dumanjug)");
            System.out.println("Route 4.2.2 (Alcantara)");
            System.out.println("You reached Moalboal");

            // Calculate ETA in hours
            double eta2 = SECOND / speed2KmPerHour;
            int hours2 = (int) eta2;
            int minutes2 = (int) ((eta2 - hours2) * 60); // Extract remaining minutes

            System.out.println("You reached Moalboal");
            System.out.println("Your Speed Is: " + speed2KmPerHour + " km/h");
            System.out.println("The Distance is: " + SECOND + " km");
            System.out.println("Your ETA is: " + hours2 + " hours and " + minutes2 + " minutes");
            return;
        } else {
            System.out.println("How fast are you going in km/h?: ");
            double speed3KmPerHour = scan.nextDouble();

            System.out.println("The recommended route is: ");
            System.out.println("Cebu City (Start)");
            System.out.println("Minglanilla (Route 1)");
            System. out.println("San Fernando (Route 2)");
            System.out.println("CarCar (Route 3)");
            System.out.println("Sibonga (Route 4.2)");
            System.out.println("Route 5 (Argao)");
            System.out.println("Route 5.1 (Ronda)");
            System.out.println("Route 5.2 (Alcantara)");
            System.out.println("You reached Moalboal");

            // Calculate ETA in hours
            double eta3 = THIRD / speed3KmPerHour;
            int hours3 = (int) eta3;
            int minutes3 = (int) ((eta3 - hours3) * 60); // Extract remaining minutes

            System.out.println("You reached Moalboal");
            System.out.println("Your Speed Is: " + speed3KmPerHour + " km/h");
            System.out.println("The Distance is: " + THIRD + " km");
            System.out.println("Your ETA is: " + hours3 + " hours and " + minutes3 + " minutes");
            return;
        }
    }
}
