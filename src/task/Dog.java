package task;

public class Dog extends Animal {
    private static int amountDogs;
    private static final int DOG_RUN_DISTANCE = 500;
    private static final int DOG_SWIM_DISTANCE = 10;

    public Dog(String name) {
        super(name);
        amountDogs++;
    }

    public static int getAmountDogs() {
        return amountDogs;
    }

    @Override
    public void run(int distance) {
        if (distance <= DOG_RUN_DISTANCE && distance >= 0) {
            super.run(distance);
        } else if (distance < 0) {
            System.out.println("Are you kidding me?");
        } else {
            System.out.println("Dog will not run so much");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance < DOG_SWIM_DISTANCE && distance >= 0) {
            super.run(distance);
        } else if (distance < 0) {
            System.out.println("Are you kidding me?");
        } else {
            System.out.println("Dog will not run so much");
        }
    }
}