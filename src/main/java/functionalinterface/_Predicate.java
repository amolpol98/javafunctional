package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("9999999999"));
        System.out.println(isPhoneNumberValid("1999999999"));
        System.out.println(isPhoneNumberValid("999999999"));

        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidPredicate.test("9999999999"));
        System.out.println(isPhoneNumberValidPredicate.test("1999999999"));
        System.out.println(isPhoneNumberValidPredicate.test("999999999"));

        System.out.println(
                isPhoneNumberValidPredicate.and(containsNumber3).test("999999999")
        );
        System.out.println(
                isPhoneNumberValidPredicate.and(containsNumber3).test("9999999399")
        );
        System.out.println(
                isPhoneNumberValidPredicate.or(containsNumber3).test("999399999")
        );
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("9") && phoneNumber.length() == 10;
    }

    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("9") && phoneNumber.length() == 10;

    static Predicate<String> containsNumber3 =
            phoneNumber -> phoneNumber.contains("3");
}
