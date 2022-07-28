import java.util.List;

public class LoanType {
    private int id;
    private String name;
    private List<TypeAttribute> typeAttributes;
    private List<LoanTypeAttribute> loanTypeAttributes;

    public LoanType(int id, String name) {
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

    public List<TypeAttribute> getTypeAttributes() {
        return typeAttributes;
    }

    public void setTypeAttributes(List<TypeAttribute> typeAttributes) {
        this.typeAttributes = typeAttributes;
    }

    public List<LoanTypeAttribute> getLoanTypeAttributes() {
        return loanTypeAttributes;
    }

    public void setLoanTypeAttributes(List<LoanTypeAttribute> loanTypeAttributes) {
        this.loanTypeAttributes = loanTypeAttributes;
    }
}