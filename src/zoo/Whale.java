package zoo;

public class Whale extends Mammal {

    /**
     * data
     * @return
     */

    private boolean isMammal = true;
    private Integer size = 20;
    private String food = "plankton";
    private String reproduce = "Sexually";
    private Integer numberOfLegs = 0;
    private boolean Move = true;

    /**
     * process
     * @return
     */
    String milk() { return "true"; }

    public boolean getMammal() { return this.isMammal; }

    public Integer getSize() { return this.size; }

    public void setSize(Integer i) { this.size = i; }

    public String getEat() { return this.food; }

    public String getReproduce() { return this.reproduce; }

    public boolean getMove() { return this.Move; }

    public Integer getNumberOfLegs() { return numberOfLegs; }
}



