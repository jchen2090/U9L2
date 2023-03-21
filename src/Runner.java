public class Runner {
    public static void main(String[] args) {
        Cat meow = new Cat("mr meow", 50, false);
        System.out.println("name:"+meow.getName());
        System.out.println("age:"+meow.getAge());
        System.out.println("vaccinated:"+meow.isVaccinated());
        System.out.println("played?:"+meow.hasPlayedWith());
        meow.adopt();
        meow.feed();
        meow.play();

        System.out.println("doggo");
        Dog bark = new Dog("let me do it for you", 83, true);
        System.out.println("name:"+bark.getName());
        System.out.println("age:"+bark.getAge());
        System.out.println("vaccinated:"+bark.isVaccinated());
        System.out.println("walked?:"+bark.isWalked());
        bark.adopt();
        bark.feed();
        bark.walk();
    }
}
