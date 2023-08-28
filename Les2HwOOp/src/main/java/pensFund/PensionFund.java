package pensFund;

public class PensionFund {
    private String name;
    private boolean state;
    private String startDate;
    private int numberOfMembers;

    public PensionFund(String name, boolean state, String startDate, int numberOfMembers) {
        this.name = name;
        this.state = state;
        this.startDate = startDate;
        this.numberOfMembers = numberOfMembers;
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

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    public void info() {
        System.out.println("Название пенсионного фонда: "+ name);
        System.out.println("Дата основания пенсионного фонда: "+ startDate);
        if (state == true) {
            System.out.println("Государственный пенсионный фонд. Использует " + numberOfMembers + " тысяч человек");
        } else {
            System.out.println("Негосударственный пенсионный фонд. Использует " + numberOfMembers + " человек");
        }
        System.out.println(" ");
    }
}
