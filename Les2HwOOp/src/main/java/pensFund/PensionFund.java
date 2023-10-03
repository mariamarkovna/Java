package pensFund;

import person.AbleToCalculatePension;
import person.Worker;

import java.util.List;
import java.util.Objects;

public class PensionFund {
    private String name;
    private boolean state;
    private String startDate;
    private List<Worker> persons;


    public PensionFund(String name, boolean state, String startDate, List<Worker> persons) {
        this.name = name;
        this.state = state;
        this.startDate = startDate;
        this.persons = persons;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getStartDate() {
        return startDate;
    }

    public List<Worker> getPersons() {
        return persons;
    }

    public void setPersons(int numberOfMembers) {

        this.persons = persons;
    }

    public void info() {
        System.out.println("Название пенсионного фонда: " + name);
        System.out.println("Дата основания пенсионного фонда: " + startDate);
        if (persons == null) {
            return;
        }
        if (state) {
            System.out.println("Государственный пенсионный фонд. Использует " + persons.size() / 1000 + " тысяч человек");
        } else {
            System.out.println("Негосударственный пенсионный фонд. Использует " + persons.size() + " человек");
        }
        System.out.println(" ");
    }

    public double calculatePensionFor(AbleToCalculatePension obj) {
        if (isState()) {
            return obj.calculatePension();
        } else {
            return 0.0;
        }
    }

    public double calculateMedianPension() {
        if (persons == null || persons.size() == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (Worker worker : persons) {
            sum += calculatePensionFor(worker);

        }
        return sum / persons.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PensionFund that = (PensionFund) o;
        return state == that.state && Objects.equals(name, that.name) && Objects.equals(startDate, that.startDate) && Objects.equals(persons, that.persons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, state, startDate, persons);
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "name='" + name + '\'' +
                ", state=" + state +
                ", startDate='" + startDate + '\'' +
                ", persons=" + persons +
                '}';
    }
}
