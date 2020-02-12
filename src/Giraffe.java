public class Giraffe extends Animal {

    public Giraffe(String name) {
        super(name, "leaves");
    }

    public void eat(String food) {
        if(food == favoriteFood) {
            System.out.println(this.name + " eats " + food);
            System.out.println("YUM!!! " + this.name + " wants more " + food + ". ");
            this.sleep();
        }else {
            System.out.println("YUCK!!! " + name + " will not eat " + food + ".");
        }
    }

}
