package person;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private int height;
    private double weight;
    private int money;
    private Gender gender;

    public Person(String name, int age, int height, double weight, Gender gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender=gender;
    }
    public Person(String name, int age){
        this.name=name;
        this.age=age;
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

    public void setGender(Gender gender){
        this.gender=gender;
    };

    public Gender getGender(){
        return gender;
    };

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
    public abstract void die(int years);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && height == person.height && Double.compare(weight, person.weight) == 0 && money == person.money && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, weight, money);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", money=" + money +
                '}';
    }
}
