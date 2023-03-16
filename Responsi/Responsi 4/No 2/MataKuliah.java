import java.lang.Comparable;

class MataKuliah implements Comparable<MataKuliah> {
  private float rating;
  private String nama;
  private int kodeJurusan;
  private int tahunPengembalian;

  public MataKuliah(String nama, int kodeJurusan, int tahunPengembalian, float rating) {
    this.nama = nama;
    this.kodeJurusan = kodeJurusan;
    this.tahunPengembalian = tahunPengembalian;
    this.rating = rating;
  }

    public float getRating() {
        return rating;
    }

    public String getNama() {
        return nama;
    }

    public int getKodeJurusan() {
        return kodeJurusan;
    }

    public int getTahunPengambilan() {
        return tahunPengembalian;
    }

    public int compareTo(MataKuliah m) {
    // compareTo mengembalikan:
    // 0 bila this sama dengan m
    // 1 bila this lebih dari m
    // -1 bila this kurang dari m
        if (this.kodeJurusan < m.kodeJurusan || (this.kodeJurusan == m.kodeJurusan && this.tahunPengembalian < m.tahunPengembalian) || (this.kodeJurusan == m.kodeJurusan && this.tahunPengembalian == m.tahunPengembalian && this.rating < m.rating)) {
        return -1;
        } else if (this.kodeJurusan == m.kodeJurusan && this.tahunPengembalian == m.tahunPengembalian && this.rating == m.rating) {
        return 0;
        } else {
        return 1;
        }
  }
}

