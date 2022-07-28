import java.time.LocalDate;

public class BlockedCustomer{
    private int id;
    private Customer customer;
    private LocalDate blockedDate;

    public BlockedCustomer(int id, Customer customer, LocalDate blockedDate) {
        this.id = id;
        this.customer = customer;
        this.blockedDate = blockedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getBlockedDate() {
        return blockedDate;
    }

    public void setBlockedDate(LocalDate blockedDate) {
        this.blockedDate = blockedDate;
    }
}