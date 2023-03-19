package OOP2;

public class CustomerRunner {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice",new Address("호매실동","수원시","한국"));
        System.out.println("customer = " + customer);
        customer.setWorkAddress(new Address("신림동","서울시","한국"));
        System.out.println("customer = " + customer);
    }
}
