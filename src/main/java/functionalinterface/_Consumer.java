package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer amol = new Customer("Amol", "123123");
        // Normal java function
        greetCustomer(amol);
        greetCustomerV2(amol, false);

        // Consumer Functional interface
        greetCustomerConsumer.accept(amol);

        greetCustomerConsumerV2.accept(amol, false);
    }

    static Consumer<Customer> greetCustomerConsumer =
            customer ->  System.out.println("hello " + customer.customerName + ", your phone number - " + customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 =
            (customer, showPhoneNumber) ->  System.out.println("hello " + customer.customerName + ", your phone number - " + (showPhoneNumber ? customer.customerPhoneNumber : "******"));

    static void greetCustomer(Customer customer) {
        System.out.println("hello " + customer.customerName + ", your phone number - " + customer.customerPhoneNumber);
    }

    static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
        System.out.println("hello " + customer.customerName + ", your phone number - " + (showPhoneNumber ? customer.customerPhoneNumber : "******"));
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
