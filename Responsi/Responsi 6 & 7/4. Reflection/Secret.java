import java.util.UUID;

public class Secret {
    private String email;
    private String nama;
    public static Integer counter = 0;
    private String uniqueId;

    public Secret(String email, String nama) {
        this.email = email;
        this.nama = nama;
        this.uniqueId = UUID.randomUUID().toString();
        counter++;
    }

    public boolean isThis(String email) {
        return this.email.equalsIgnoreCase(email);
    }

    public String getEmail() {
        return email;
    }

    public String getNama() {
        return nama;
    }

    public String getUniqueId() {
        return uniqueId;
    }
}