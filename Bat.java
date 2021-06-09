public class Bat extends Mammal {

    public Bat () {
        this.energyLevel = 300;
    }

    public void fly () {
        energyLevel -= 50;
        System.out.println("Flap, flap, flap. The bat took flight and lost 50 energy points.");
    }

    public void eatHuman() {
        energyLevel += 25;
        System.out.println("Oh no! The bat ate a human and gained 25 energy points.");
    }

    public void attackTown() {
        energyLevel -= 100;
        System.out.println("Crackle crackle. The bat attacked the town and lost 100 energy points.");
    }
}