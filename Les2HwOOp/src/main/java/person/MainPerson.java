package person;

import static person.Gender.FEMALE;
import static person.Gender.MALE;

public class MainPerson {
    public static void main(String[] args) {
//        Person person = new Person("Анатолий", 56, 175, 80);
//        person.setMoney(5000);
//
//        Person person1 = new Person("Марина", 15, 160, 55);
//        person1.setMoney(45);
//
//        Person person2 = new Person("Семен", 85, 180, 75);
//        person2.setMoney(2500);
//
//        Person person3 = new Person("Елена", 36, 168, 58);
//        person3.setMoney(6000);
//
//        Person person4 = new Person("Петр", 10, 145, 40);
//        person4.setMoney(10);
//
//        person.getInfo();
//        person1.getInfo();
//        person2.getInfo();
//        person3.getInfo();
//        person4.getInfo();
//
//        person.goToWork();
//        person1.goToWork();
//        person2.goToWork();
//        person3.goToWork();
//        person4.goToWork();
//
//        Worker worker=new Worker("Ivanov",35,180,65.5, 3000,8000);
//        worker.die();
//
//        Pensioner pensioner=new Pensioner("Petrov",75,177,85.5,1000.78);
//        pensioner.die();

        Person worker = new Worker("Anna", 27, 169, 57.9, FEMALE, 2000,5000);
        Person pensioner = new Pensioner("Levon", 72, 183, 80.4, 1200,MALE);

        worker.die(15);
        worker.die();

        pensioner.die(9);
        pensioner.die();
        System.out.println(((Worker) worker).calculatePension());


    }
}
