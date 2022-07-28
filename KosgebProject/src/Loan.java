import java.time.LocalDate;

public class Loan {
    private int id;
    private String name;
    private Customer customer;
    private LoanType loanType;
    private LocalDate startDate;
    private LocalDate endDate;

    public Loan(int id, String name, Customer customer, LoanType loanType, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.name = name;
        this.customer = customer;
        this.loanType = loanType;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
