public class EmailDriver {
    public static void main(String[] args) {
        String[] emails = {"johb@com.com.com"};
        for (String email : emails) {
            Email e = new Email(email);
            try {
                e.validateEmail();
                System.out.println(email + " => Valid email");
            } catch (InvalidEmailException ex) {
                System.out.println(email + " => " + ex.getMessage());
            } catch (InvalidDomainException ex) {
                System.out.println(email + " => " + ex.getMessage());
            }
        }
    }
}
