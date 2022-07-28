public class TypeAttributeValue {
    private int id;
    private TypeAttribute typeAttribute;
    private String  value;

    public TypeAttributeValue(int id, TypeAttribute typeAttribute, String value) {
        this.id = id;
        this.typeAttribute = typeAttribute;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeAttribute getTypeAttribute() {
        return typeAttribute;
    }

    public void setTypeAttribute(TypeAttribute typeAttribute) {
        this.typeAttribute = typeAttribute;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}