public class BankEmployee extends User{
    private Bank bank;

    public BankEmployee(int id, String username, String password, Bank bank) {
        super(id, username, password);
        this.bank = bank;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}