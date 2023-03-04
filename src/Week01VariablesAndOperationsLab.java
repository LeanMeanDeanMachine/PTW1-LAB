public class Week01VariablesAndOperationsLab {

    public static void main(String[] args) {

        System.out.println("Week 1 Lab");

        // 1. Create a variable to hold the quantity of
        //		available plane seats left on a flight

        int emptyPlaneSeats = 46;

        // 2. Create a variable to hold the cost of groceries at checkout

        double groceryCheckOut = 21.21;

        // 3. Create a variable to hold a person's middle initial

        char middleInit = 'W';

        // 4. Create a variable to hold true if it's hot outside
        //		and false if it's cold outside

        boolean isHot = false;

        // 5. Create a variable to hold a customer's first name

        String firstName = "Dean";

        // 6. Create a variable to hold a street address

        String stAddress = "833 Lamme Street";

        // 7. Print all variables to the console
        System.out.println("Available seats left on the plane: " + emptyPlaneSeats);
        System.out.println("Grocery checkout total: " + groceryCheckOut);
        System.out.println("Dean's Middle Initial is: " + middleInit);
        System.out.println("The Weather is Hot outside: " + isHot);
        System.out.println("The person's first name is: " + firstName);
        System.out.println(stAddress + " Is an address");


        // 8. A customer booked 2 plane seats,
        //		remove 2 seats from the available seats variable

        emptyPlaneSeats -=  2;

        // 9. Impulse candy bar purchase, add 2.15 to the grocery total

        groceryCheckOut +=  2.15;


        // 10.  The birth certificate was printed incorrectly,
        //		change the middle initial to something else

        middleInit = 'B';

        // 11.  The season has changed, update the hot outside
        //			variable to be opposite of what it was
        isHot = !isHot;

        // 12.  Create a new variable called full name using the customer's first name,
        //			the middle initial, and a last name of your choice

        String lastName = "Britten";
        String fullName = firstName + " " + middleInit + ". " + lastName;

        // 13.  Print a line to the console that introduces the customer and says they live
        // 			at the address variable

        System.out.println(fullName + " is a customer who lives at: " + stAddress);

    }
}
