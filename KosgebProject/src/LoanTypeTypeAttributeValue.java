public class LoanTypeTypeAttributeValue {
    private int id;
    private LoanType loanType;
    private TypeAttributeValue typeAttributeValue;

    public LoanTypeTypeAttributeValue(int id, LoanType loanType, TypeAttributeValue typeAttributeValue) {
        this.id = id;
        this.loanType = loanType;
        this.typeAttributeValue = typeAttributeValue;
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

    public TypeAttributeValue getTypeAttributeValue() {
        return typeAttributeValue;
    }

    public void setTypeAttributeValue(TypeAttributeValue typeAttributeValue) {
        this.typeAttributeValue = typeAttributeValue;
    }
}
