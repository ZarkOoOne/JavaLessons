class BankAccount {
    private String fullMame;
    private String bankAccountNo;
    private double balance;
    private int yearsActive;

    BankAccount(String fullMame, String bankAccountNo, double balance, int yearsActive){
       this.fullMame = fullMame;
       this.bankAccountNo = bankAccountNo;
       this. balance = balance;
       this.yearsActive = yearsActive;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setFullMame(String fullMame) {
        this.fullMame = fullMame;
    }

    public String getFullMame() {
        return fullMame;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setYearsActive(int yearsActive) {
        this.yearsActive = yearsActive;
    }

    public int getYearsActive() {
        return yearsActive;
    }

    void print(){
        System.out.println("FullName           :" + fullMame);
        System.out.println("BankAccount Number :" + bankAccountNo);
        System.out.println("Balance            :" + balance);
        System.out.println("Years Active       :" + yearsActive);
    }
}
