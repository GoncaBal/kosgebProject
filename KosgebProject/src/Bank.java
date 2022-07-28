import java.util.List;

public class Bank {
    private int id;
    private String name;

    private List<BankEmployee> bankEmployees;

    public Bank(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BankEmployee> getBankEmployees() {
        return bankEmployees;
    }

    public void setBankEmployees(List<BankEmployee> bankEmployees) {
        this.bankEmployees = bankEmployees;
    }
}
