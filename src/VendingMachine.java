import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private boolean machineOn = true;
    private static final int MAX_ITEMS = 10;
    private static final int MIN_ITEMS = 0;
    private final String DRINK_NAME = "Drinks";
    private int drinksRemaining = 0;
    private double drinkCost;
    private final String CRISP_NAME = "Crisps";
    private int crispsRemaining = 0;
    private double crispsCost;
    private final String COOKIES_NAME = "Cookies";
    private int cookiesRemaining = 0;
    private double cookiesCost;
    public VendingMachine(double drinkCost, double crispsCost, double cookiesCost){
        this.drinkCost = drinkCost;
        this.crispsCost = crispsCost;
        this.cookiesCost = cookiesCost;
    }

    public boolean isMachineOn() {
        return machineOn;
    }

    public void buyDrink(){
        if (drinksRemaining == MIN_ITEMS) {
            System.out.println("No drinks remaining");
        } else if (!machineOn) {
            System.out.println("Machine off");
        } else{
            drinksRemaining--;
        }
    }

    public void buyCrisps(){
        if (crispsRemaining == MIN_ITEMS) {
            System.out.println("No crisps remaining");
        } else if (!machineOn) {
            System.out.println("Machine off");
        }
        else{
            crispsRemaining--;
        }
    }

    public void buyCookies(){
        if (cookiesRemaining == MIN_ITEMS) {
            System.out.println("No cookies remaining");
        } else if (!machineOn) {
            System.out.println("Machine off");
        }
        else{
            cookiesRemaining--;
        }
    }

    public void setDrinksRemaining(int number) {
        if (drinksRemaining == MAX_ITEMS) {
            System.out.println("Machine already full");
        } else if (!machineOn) {
            System.out.println("Machine off");
        }
        else {
            drinksRemaining = number;
        }
    }

    public void setCrispsRemaining(int number) {
        if (crispsRemaining == MAX_ITEMS) {
            System.out.println("Machine already full");
        } else if (!machineOn) {
            System.out.println("Machine off");
        }
        else {
            crispsRemaining = number;
        }
    }

    public void setCookiesRemaining(int number) {
        if (cookiesRemaining == MAX_ITEMS) {
            System.out.println("Machine already full");
        } else if (!machineOn) {
            System.out.println("Machine off");
        }
        else {
            cookiesRemaining = number;
        }
    }


    public void togglePower() {
        machineOn = !machineOn;
    }
    public String toString() {
        if (machineOn) {
            return "Item-Name   Quantity    Cost\n" +
                    "Drinks       " + drinksRemaining + "          £" + drinkCost + "\n" +
                    "Crisps       " + crispsRemaining + "          £" + crispsCost + "\n" +
                    "Cookies      " + cookiesRemaining + "          £" + cookiesCost + "\n";
        }
        else {
            return "Machine off";
        }

    }

    public static void main(String[] args) {
        VendingMachine testMachine = new VendingMachine(5.00, 3.00, 1.50);
        System.out.println(testMachine.toString());
    }
}