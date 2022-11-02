package task;

public class Cat extends Animal {
    private static int amountCats;
    private static final int CAT_RUN_DISTANCE = 200;

    public Cat(String name) {
        super(name);
        amountCats++;
    }

    @Override
    public void run(int distance) {
        if (distance <= CAT_RUN_DISTANCE && distance >= 0) {
            super.run(distance);
        }
        else if (distance < 0){
            System.out.println("Are you kidding me?");
        }
        else {
            System.out.println("Cat will not run so much");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats cant swim :(");
    }

    public static int getAmountCats() {
        return amountCats;
    }
}
