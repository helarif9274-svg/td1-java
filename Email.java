public final class Email {
    private final String value;

    public Email(String value) {
        if (value == null || !value.contains("@")) {
            throw new IllegalArgumentException("Adresse e-mail invalide.");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Email e1 = new Email("user@example.com");
        System.out.println("Email : " + e1);

        try {
            Email e2 = new Email("invalidEmail");
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur création Email : " + e.getMessage());
        }
    }
}
