

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Анатолий", 56, 175, 80);
        person.setMoney(5000);

        Person person1 = new Person("Марина", 15, 160, 55);
        person1.setMoney(45);

        Person person2 = new Person("Семен", 85, 180, 75);
        person2.setMoney(2500);

        Person person3 = new Person("Елена", 36, 168, 58);
        person3.setMoney(6000);

        Person person4 = new Person("Петр", 10, 145, 40);
        person4.setMoney(10);

        person.getInfo();
        person1.getInfo();
        person2.getInfo();
        person3.getInfo();
        person4.getInfo();

        person.goToWork();
        person1.goToWork();
        person2.goToWork();
        person3.goToWork();
        person4.goToWork();
    }



}
