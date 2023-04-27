public class Email {
    private String email; 

    public Email(String email) {
        this.email = email;
    }

    public boolean validateEmail() throws InvalidDomainException, InvalidEmailException {
        if (this.email.isEmpty()) {
            throw new InvalidEmailException("Email tidak boleh kosong");
        }

        int firstAtSymbol = this.email.indexOf('@');
        if (firstAtSymbol == -1 || firstAtSymbol != this.email.lastIndexOf('@') ) {
            throw new InvalidEmailException("Email harus mengandung tepat satu buah @");
        }

        if (this.email.indexOf('@') == 0) {
            throw new InvalidEmailException("@ tidak boleh di awal email");
        }

        String[] parts = this.email.split("@");

        if (parts.length != 2 || parts[0].isEmpty() || parts[1].indexOf('.') == -1) {
            throw new InvalidDomainException();
        }

        String[] domainParts = parts[1].split("\\.");

        if (domainParts.length != 2 || domainParts[0].isEmpty() || domainParts[1].isEmpty()) {
            throw new InvalidDomainException();
        }

        return true;
    }
}

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class InvalidDomainException extends Exception {
    public String getMessage() {
        return "Email harus memiliki domain yang valid";
    }
}