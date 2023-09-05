package person;

import java.util.Objects;

public class Worker extends Person {
    private int minSalary;
    private int maxSalary;

    public Worker(String name, int age, int height, double weight, int minSalary, int maxSalary) {
        super(name, age, height, weight);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }
    public Worker(String name, int age, int height, double weight){
        super(name, age, height, weight);
    };

    public Worker(String name, int age,int minSalary, int maxSalary){
        super(name,age);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }
    public Worker(String name, int age,int maxSalary){
        super(name,age);
        this.maxSalary = maxSalary;
    }


    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }

    @Override
    public void die(int years) {
        System.out.println("Этот человек не доживет до пенсии и умрет через " + years + " лет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Worker worker = (Worker) o;
        return minSalary == worker.minSalary && maxSalary == worker.maxSalary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), minSalary, maxSalary);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                '}';
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }
}
