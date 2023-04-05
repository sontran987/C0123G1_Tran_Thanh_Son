package case_study_module02.models;

public class Contract {
    private int numberContract;
    private int codeBooking;
    private double advanceDepositAmount;
    private double totalPaymentAmount;
    private int codeCustomer;

    public Contract() {
    }

    public Contract(int numberContract, int codeBooking, double advanceDepositAmount, double totalPaymentAmount, int codeCustomer) {
        this.numberContract = numberContract;
        this.codeBooking = codeBooking;
        this.advanceDepositAmount = advanceDepositAmount;
        this.totalPaymentAmount = totalPaymentAmount;
        this.codeCustomer = codeCustomer;
    }

    public int getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }

    public int getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(int codeBooking) {
        this.codeBooking = codeBooking;
    }

    public double getAdvanceDepositAmount() {
        return advanceDepositAmount;
    }

    public void setAdvanceDepositAmount(double advanceDepositAmount) {
        this.advanceDepositAmount = advanceDepositAmount;
    }

    public double getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(double totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public int getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(int codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    @Override
    public String toString() {
        return "Contract: " +
                "numberContract= " + numberContract +
                ", codeBooking= " + codeBooking +
                ", advanceDepositAmount= " + advanceDepositAmount +
                ", totalPaymentAmount= " + totalPaymentAmount +
                ", codeCustomer= " + codeCustomer;
    }

    public String getInfoToCSV() {
        return numberContract + "," + codeBooking + "," + advanceDepositAmount + ","
                + totalPaymentAmount + "," + codeCustomer;
    }
}
