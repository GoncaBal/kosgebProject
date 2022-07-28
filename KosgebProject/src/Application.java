public class Application {
    private int id;
    private Customer customer;
    private Status status;
    private ApplicationType applicationType;
    private LoanType loanType;
    public enum Status{
        PENDING,
        ACCEPTED,
        REFUSED
    }
    public enum ApplicationType{
        FIRST,
        SECOND
    }

    public Application(int id, Customer customer, Status status, ApplicationType applicationType, LoanType loanType) {
        this.id = id;
        this.customer = customer;
        this.status = status;
        this.applicationType = applicationType;
        this.loanType = loanType;
    }
}