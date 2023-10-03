package pensFund;


import person.Worker;

import java.util.ArrayList;
import java.util.List;

import static person.Gender.FEMALE;
import static person.Gender.MALE;

public class MainPensionFund {
    public static void main(String[] args) {
        Worker vasja = new Worker("Vasja", 25, MALE, 1500, 2000);
        Worker elena = new Worker("Elena", 30, FEMALE, 2000, 3400);
        List<Worker> workerList = new ArrayList<>();
        workerList.add(vasja);
        workerList.add(elena);


        PensionFund pensionFund = new PensionFund("Star", true, "20.10.2022", workerList);
        PensionFund pensionFund1 = new PensionFund("Happiness", true, "05.11.1922", workerList);
        PensionFund pensionFund2 = new PensionFund("Flower", false, "12.07.1986", workerList);
        PensionFund pensionFund3 = new PensionFund("Starship", true, "23.12.1976", workerList);

//        pensionFund.info();
//        pensionFund1.info();
//        pensionFund2.info();
//        pensionFund3.info();

        double stateFundAveragePension = pensionFund.calculateMedianPension();
        double stateFundAveragePension1 = pensionFund1.calculateMedianPension();
        double notStateFundAveragePension = pensionFund2.calculateMedianPension();
        double stateFundAveragePension2 = pensionFund3.calculateMedianPension();

        System.out.println(stateFundAveragePension);
        System.out.println(stateFundAveragePension1);
        System.out.println(stateFundAveragePension2);
        System.out.println(notStateFundAveragePension);
    }
}
