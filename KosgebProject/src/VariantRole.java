public class VariantRole {
    private int id;
    private Variant variant;
    private Role role;

    public VariantRole(int id, Variant variant, Role role) {
        this.id = id;
        this.variant = variant;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Variant getVariant() {
        return variant;
    }

    public void setVariant(Variant variant) {
        this.variant = variant;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}