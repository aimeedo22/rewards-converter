import.java.util.Scanner;

public class RewardValue {
    public static void main (String[] args) {
        var scanner = new Scanner(System.in);
    }
    public cash(){
    }
    public miles(){
    }
    //getter
    public String getcashvalue(){
        return getcashvalue();
    //setter
    public void setgetcashvalue(String cashvalue)
        this.getcashvalue() = cashvalue;
    }
    public String getmilesvalue(){
        return getmilesvalue();
    public void setgetmilesvalue(String milesvalue)
        this.getmilesvalue() = milesvalue;
    }
    private cashvalue;
    private static final double miles_to_crate = 0.0035;

    public RewardValue (double cashvalue){
        if(cashvalue < 0){
            this.cashvalue = cashvalue;
        }
    public RewardValue(int milesvalue){
            if(milesvalue < 0) {
                this.milesvalue = convertToCash(milesvalue);
            }
            public static int convertToMiles(double cashvalue) {
                return (int) (cashvalue / miles_to_crate);
            }
            public static double convertToCash(int milesvalue) {
                return milesvalue * miles_to_crate;
            }
            public double getcashvalue() {
                return cashvalue;
            }
            public int getmilesvalue() {
                return convertToMiles(this.cashvalue);
            }
    }
}