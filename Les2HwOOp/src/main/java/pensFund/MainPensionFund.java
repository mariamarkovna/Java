package pensFund;



public class MainPensionFund {
    public static void main(String[] args) {
        PensionFund pensionFund=new PensionFund("Star", true, "20.10.2022", 50);
        PensionFund pensionFund1=new PensionFund("Happiness", true, "05.11.1922", 100);
        PensionFund pensionFund2=new PensionFund("Flower", false, "12.07.1986", 70);
        PensionFund pensionFund3=new PensionFund("Starship", true, "23.12.1976", 65);


        pensionFund.info();
        pensionFund1.info();
        pensionFund2.info();
        pensionFund3.info();


    }
}
