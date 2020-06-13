package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional.ofNullable(null)
//                .orElseGet(() -> "default value");
//        .orElseThrow(() -> new IllegalStateException());
//                    .ifPresent(val -> System.out.println(val));
        .ifPresentOrElse(
                email -> System.out.println("sending email to " + email),
                () -> System.out.println("Email not passed")
        );
//        System.out.println(value);
    }
}
