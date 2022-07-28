public class UserRole {
    private int id;
    private User user;
    private VariantRole variantRole;
    private boolean value;

    public UserRole(int id, User user, VariantRole variantRole, boolean value) {
        this.id = id;
        this.user = user;
        this.variantRole = variantRole;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public VariantRole getVariantRole() {
        return variantRole;
    }

    public void setVariantRole(VariantRole variantRole) {
        this.variantRole = variantRole;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}