public class Pensioner extends Person{
    private double pension;
    public Pensioner(String name, int age, int height, double weight,double pension) {
        super(name, age, height, weight);
        this.pension=pension;
    }

    @Override
    public void die() {
        double x = (getAge()-50)*pension;
        System.out.println("Этот пенсионер умер, он заработал "+ x);
    }
}
