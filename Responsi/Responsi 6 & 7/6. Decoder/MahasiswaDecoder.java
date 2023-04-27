import java.lang.reflect.*;

public class MahasiswaDecoder {

    private Mahasiswa teman;

    MahasiswaDecoder(Mahasiswa mahasiswa) {
        this.teman = mahasiswa;
    }

    public void addMatkul(String name) throws Exception {
        Method addMatkulMethod = Mahasiswa.class.getDeclaredMethod("addMatkul", String.class);
        addMatkulMethod.setAccessible(true);
        addMatkulMethod.invoke(teman, name);
    }

    public int getNIM() throws Exception {
        Field nimField = Mahasiswa.class.getDeclaredField("NIM");
        nimField.setAccessible(true);
        return (int) nimField.get(teman);
    }

    public double getIPK() throws Exception {
        Field ipkField = Mahasiswa.class.getDeclaredField("IPK");
        ipkField.setAccessible(true);
        return (double) ipkField.get(teman);
    }

}
