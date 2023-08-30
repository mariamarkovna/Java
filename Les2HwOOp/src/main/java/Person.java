public class Person {
    private String name;
    private int age;
    private int height;
    private double weight;
    private int money;


    public Person(String name, int age, int height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

    }

    public void getInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Лет: " + age);
        System.out.println("Рост: " + height);
        System.out.println("Вес: " + weight);
        System.out.println("Сумма денег: " + money+"\n");
    }

    public void setName(String name){
        this.name= name;
    };

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age= age;
    };

    public int getAge(){
        return age;
    }

    public void setHeight(int height){
        this.height= height;
    };

    public int getHeight(){
        return height;
    }

    public void setWeight(double weight){
        this.weight= weight;
    };

    public double getWeight() {
        return weight;
    }

    public void goToWork() {
        if (age < 18 || age > 70) {
            System.out.println(name+": Йехуууу!!!!Oтдыхаю дома");
        } else {
            System.out.println(name+": Работаю");
        }
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void die(){
        System.out.println("Человек погиб");
    }
}
