public class VariantRolePermission {
    private int id;
    private VariantRole variantRole;
    private Permission permission;

    public VariantRolePermission(int id, VariantRole variantRole, Permission permission) {
        this.id = id;
        this.variantRole = variantRole;
        this.permission = permission;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VariantRole getVariantRole() {
        return variantRole;
    }

    public void setVariantRole(VariantRole variantRole) {
        this.variantRole = variantRole;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
}