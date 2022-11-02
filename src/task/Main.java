package task;

public class Main {

    public static void main(String[] args) {

        Cat catBarsik = new Cat("Barsik");
        Cat catRyzhik = new Cat("Ryzhik");
        Cat catMarsik = new Cat("Marsik");
        Dog dogBaron = new Dog("Baron");
        Dog dogTuzik = new Dog("Tuzik");
        Dog dogBelka = new Dog("Belka");
        Dog dogStrelka = new Dog("Strelka");

        catBarsik.run(200);
        catRyzhik.run(500);
        catMarsik.swim(10);
        System.out.println(" ");
        dogBaron.run(468);
        dogTuzik.run(867);
        dogBelka.swim(9);
        dogStrelka.swim(15);

        System.out.println("\nWow, you have " + Animal.getAmountAnimal() + " animals, including " +
                Cat.getAmountCats() + " cats and " + Dog.getAmountDogs() + " dogs.");
    }
}