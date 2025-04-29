/* This is a stub for the Cafe class */
public class Cafe extends Building implements CafeRequirements{

    //Attributes
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /**
     * Constructor for Cafe
     * @param name Cafe's name
     * @param address Cafe's address
     * @param nFloors Number of floors in Cafe
     */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }

    /**
     * decreases the inventory every time someone buys a coffee
     * @param size oz of coffee
     * @param nSugarPackets number of sugar packets
     * @param nCreams number of splashes of cream
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        System.out.println("One "+coffeeToString(size, nSugarPackets, nCreams)+" coming right up!");
        if (this.nCups >= 0 || 
            size <= this.nCoffeeOunces || 
            nSugarPackets <= this.nSugarPackets ||
            nCreams <= this.nCreams
            ) {
            System.out.println("One moment please.....we need to restock the ingredients....");
            this.restock(800, 100, 100, 100);
        } 

        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        System.out.println("Here is you're drink! ☕ Have a good day!");
    }

    /**
     * restocks the inventory when an ingredient runs out
     * @param nCoffeeOunces oz of coffee
     * @param nSugarPackets number of sugar packets
     * @param nCreams number of splashes of cream
     * @param nCups number fo cups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        
    }

    /**
     * toString method for an order at the cafe
     * @param size oz of coffee
     * @param nSugarPackets number of sugar packets
     * @param nCreams number of splashes of cream
     * @return stylized string
     */
    private String coffeeToString(int size, int nSugarPackets, int nCreams){
        return String.valueOf(size) + " oz coffee with "+ String.valueOf(nSugarPackets) + " packets of sugar and " + String.valueOf(nCreams)+" splashes of cream";
    }
    
    //main for testing
    public static void main(String[] args) {
        System.out.println();
        Cafe woodstar= new Cafe("Woodstar", "60 Masonic St, Northampton, MA", 1, 800, 100, 100, 100);
        System.out.println(woodstar.toString());
        woodstar.sellCoffee(800,1,0);

    }
    
}
