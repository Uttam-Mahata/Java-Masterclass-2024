
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Uttam",1000,
                "uttamm@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());

        Customer secondCustomer = new Customer();

        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());


    }
}