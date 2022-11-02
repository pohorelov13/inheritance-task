package task;

public class Animal {

    private String name;
    private static int amountAnimal;

    public Animal(String name) {
        this.name = name;
        amountAnimal++;
    }

    public void run(int distance){
        System.out.println(this.name + " ran " + distance + " m.");
    }

    public void swim(int distance){
        System.out.println(this.name + " swam " + distance + " m.");
    }

    public String getName() {
        return name;
    }

    public static int getAmountAnimal() {
        return amountAnimal;
    }
}
