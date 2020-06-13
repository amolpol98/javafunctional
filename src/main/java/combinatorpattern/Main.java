package combinatorpattern;

import combinatorpattern.CustomerRegistrationValidator.ValidationResult;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.ValidationResult.SUCCESS;
import static combinatorpattern.CustomerRegistrationValidator.isEmailValid;
import static combinatorpattern.CustomerRegistrationValidator.isPhoneNumberValid;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Amol",
                "amolgmail.com",
                "9999999999",
                LocalDate.of(2000, 1, 1)
        );

//        System.out.println(new CustomerValidatorService().isValid(customer));

        // if valid we can store customer in DB

        // Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .apply(customer);

        System.out.println(result);

        if (result != SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
