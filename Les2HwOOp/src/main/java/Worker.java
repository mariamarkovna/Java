public class Worker extends Person{
    private int minSalary;
    private int maxSalary;

    public Worker(String name, int age, int height, double weight, int minSalary, int maxSalary) {
        super(name, age, height, weight);
        this.minSalary= minSalary;
        this.maxSalary=maxSalary;
    }

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }
}
