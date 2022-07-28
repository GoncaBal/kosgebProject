public class LoanTypeAttribute {
    private int id;
    private LoanType loanType;
    private TypeAttribute typeAttribute;

    public LoanTypeAttribute(int id, LoanType loanType, TypeAttribute typeAttribute) {
        this.id = id;
        this.loanType = loanType;
        this.typeAttribute = typeAttribute;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public TypeAttribute getTypeAttribute() {
        return typeAttribute;
    }

    public void setTypeAttribute(TypeAttribute typeAttribute) {
        this.typeAttribute = typeAttribute;
    }
}
