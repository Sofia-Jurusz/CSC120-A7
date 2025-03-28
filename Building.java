public class Building {

    //attributes
    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;

    /**
     * Constructor for building
     * @param name building's name
     * @param address building's address
     * @param nFloors number of floors in building
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * accessor for building's name
     * @return building's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * accessor for building's address
     * @return building's address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * accessor for number of floors in building
     * @return number of floors in building
     */
    public int getFloors() {
        return this.nFloors;
    }

    /**
     * toString method for the building
     * @return stylized string of building's name, number of floors, and address
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}
