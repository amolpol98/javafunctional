package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer amol = new Customer("Amol", "123123");

        // Normal java function
        greetCustomer(amol);

        // Consumer Functional interface
        greetCustomerConsumer.accept(amol);
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->  System.out.println("hello " + customer.customerName + ", your phone number - " + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("hello " + customer.customerName + ", your phone number - " + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
