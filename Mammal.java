public class Mammal {
    Integer energyLevel = 100;

    // public Mammal (int energyLevel) {
    //     this.energyLevel = energyLevel;
    // }

    public Integer displayEnergy() {
        System.out.println("This mammal has " + energyLevel + " energy points.");
        return energyLevel;
    }
}