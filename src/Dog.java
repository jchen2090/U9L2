    public class Dog extends Animal {

    private boolean walked;

    public Dog(String name, int age, boolean vaccinated) {
        super(name, age, vaccinated);
        this.walked = false;
    }

    public void walk() {
        System.out.println("Going on a walk");
        this.walked = true;
    }

    public boolean isWalked() {
        return walked;
    }
}
