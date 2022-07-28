import java.util.ArrayList;
import java.util.List;

public class Customer extends User{

    private final List<Loan> loanList = new ArrayList<>();
    public Customer(int id, String username, String password) {
        super(id, username, password);
    }

    public List<Loan> getLoanList() {
        return loanList;
    }
}
