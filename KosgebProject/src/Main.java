import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer(1, "musteri111", "12345");
        Customer customer2 = new Customer(2, "musteri222", "12345");
        Customer customer3 = new Customer(3, "musteri333", "12345");

        Employee employee1 = new Employee(2, "calisan123", "12345");
        BankEmployee bankEmployee1 = new BankEmployee(3, "bankaci123", "12345", new Bank(1, "Garanti Bankasi"));

        Role finansUzmani = new Role(1, "Finans Uzmani", "Finans uzmani olan kisi.");
        Role kobiMusteri = new Role(2, "Kobi Musteri", "Kobi musterisi olan kisi.");
        Role bankaSubeMuduru = new Role(3, "Banka Sube Muduru", "Banaka sube muduru olan kisi.");

        Permission permission1 = new Permission(1, "Tüm Kredileri Sorgulama", "");
        Permission permission2 = new Permission(2, "Kredi Onaylama", "");
        Permission permission3 = new Permission(3, "Başvuru Yapabilme", "");
        Permission permission4 = new Permission(4, "İlgili hizmet merkezindeki krediyi sorgulama", "");
        Permission permission5 = new Permission(5, "Kendi kredi başvurusunu sorgulayabilme", "");

        Variant variantCustomer = new Variant(1, Variant.Variants.CUSTOMER);
        Variant variantEmployee = new Variant(2, Variant.Variants.EMPLOYEE);
        Variant variantBankEmployee = new Variant(3, Variant.Variants.BANKEMPLOYEE);

        VariantRole variantRoleCustomer = new VariantRole(1, variantCustomer, kobiMusteri);
        VariantRole variantRoleEmployee = new VariantRole(2, variantEmployee, finansUzmani);
        VariantRole variantRoleBankEmployee = new VariantRole(3, variantBankEmployee, bankaSubeMuduru);

        UserRole userRole1 = new UserRole(1, customer1, variantRoleCustomer, true);
        UserRole userRole2 = new UserRole(2, employee1, variantRoleEmployee, true);
        UserRole userRole3 = new UserRole(3, bankEmployee1, variantRoleBankEmployee, true);

        VariantRolePermission variantRolePermission1 = new VariantRolePermission(1, variantRoleCustomer, permission1);
        VariantRolePermission variantRolePermission2 = new VariantRolePermission(2, variantRoleCustomer, permission2);
        VariantRolePermission variantRolePermission3 = new VariantRolePermission(3, variantRoleCustomer, permission3);
        VariantRolePermission variantRolePermission4 = new VariantRolePermission(4, variantRoleEmployee, permission4);
        VariantRolePermission variantRolePermission5 = new VariantRolePermission(5, variantRoleEmployee, permission5);
        VariantRolePermission variantRolePermission6 = new VariantRolePermission(6, variantRoleBankEmployee, permission3);

        BlockedCustomer bc1 = new BlockedCustomer(1, customer1, LocalDate.now());

        LoanType loanErzurumKredi = new LoanType(1, "Erzurum Kredisi");
        TypeAttribute typeAttribute1 = new TypeAttribute(1, "City: ", null);

        LoanTypeAttribute loanTypeAttribute1 = new LoanTypeAttribute(1, loanErzurumKredi, typeAttribute1);
        typeAttribute1.setLoanTypeAttribute(loanTypeAttribute1);
        TypeAttributeValue typeAttributeValue1 = new TypeAttributeValue(1, typeAttribute1, "Istanbul");
        LoanTypeTypeAttributeValue loanTypeTypeAttributeValue1 = new LoanTypeTypeAttributeValue(1, loanErzurumKredi, typeAttributeValue1);

        Application application1 = new Application(1, customer2, Application.Status.ACCEPTED, Application.ApplicationType.FIRST, loanErzurumKredi);
        Loan loan1 = new Loan(1, "Ahmet'in kredisi", customer2, loanErzurumKredi, LocalDate.now(), LocalDate.of(2023, 10, 15));

        System.out.println("Kredi Kullanici Adi: " + loan1.getCustomer().getUsername());
        customer2.getLoanList().add(loan1);
        for (Loan loan : loan1.getCustomer().getLoanList()) {
            System.out.println("Kredi adi: " + loan.getName());
            System.out.println("Kredi Turu: " + loan.getLoanType().getName());
        }
    }
}