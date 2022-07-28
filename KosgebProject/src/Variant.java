public class Variant {
    private Variants variant;
    private int id;
    public enum Variants{
        EMPLOYEE,
        CUSTOMER,
        BANKEMPLOYEE
    }

    public Variant( int id,Variants variant) {
        this.id = id;
        this.variant = variant;
    }
}