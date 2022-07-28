public class TypeAttribute {
    private int id;
    private String name;
    private LoanTypeAttribute loanTypeAttribute;

    public TypeAttribute(int id, String name, LoanTypeAttribute loanTypeAttribute) {
        this.id = id;
        this.name = name;
        this.loanTypeAttribute = loanTypeAttribute;
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

    public LoanTypeAttribute getLoanTypeAttribute() {
        return loanTypeAttribute;
    }

    public void setLoanTypeAttribute(LoanTypeAttribute loanTypeAttribute) {
        this.loanTypeAttribute = loanTypeAttribute;
    }
}
