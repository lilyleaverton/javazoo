public class Zookeeper {
    String name;

    public Zookeeper(String name) {
        this.name = name;
    }

    public void feedAnimals(Animal[] Animals, String food) {
        System.out.println(name + " is feeding " + food + " to " + Animals.length + " animals of " + Animal.population + " total animals.");
    }
}
