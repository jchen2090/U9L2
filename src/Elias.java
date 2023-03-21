public class Elias extends Human {
    private boolean wentToTechCodes;

    public Elias(String name, int age) {
        super(name, age);
        this.wentToTechCodes = false;
    }

    public void goToTechCodes() {
        System.out.println("Going to tech codes...");
        this.wentToTechCodes = true;
    }

    public boolean wentToTechCodes() {
        return this.wentToTechCodes;
    }
}
