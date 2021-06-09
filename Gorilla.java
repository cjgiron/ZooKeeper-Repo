public class Gorilla extends Mammal {
    // public Gorilla (int energyLevel) {
    //     super(energyLevel);
    // }

    public void throwSomething() {
        energyLevel -= 5;
        System.out.println("The gorilla has thrown something and its energy level decreased by 5");
        
    }

    public void eatBanana() {
        energyLevel += 10;
        System.out.println("The gorilla ate a banana and its energy level increased by 10.");
    }

    public void climb () {
        energyLevel -= 10;
        System.out.println("The gorilla climbed and its energy decreased by 10.");
    }
}