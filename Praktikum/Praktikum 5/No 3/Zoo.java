import java.io.*;
import java.util.*;

public class Zoo {
    private ArrayList<Enclosure<? extends Animal>> enclosures;
    private float ticketPrice;

    public Zoo() {
        this.enclosures = new ArrayList<Enclosure<? extends Animal>>();
        this.ticketPrice = 0;
        // Inisialisasi this.enclosures dan this.ticketPrice
    }

    public void addEnclosure(Enclosure<? extends Animal> enc) {
        if (!enc.isEmpty()){
            Boolean conflict = false;
            Animal ess = enc.getAnimalAt(0);
            for(int i = 0; i < enc.getAnimalCount(); i++){
                if (ess.getClass() != enc.getAnimalAt(i).getClass()){
                    conflict = true;
                }
            }
            if (!conflict){
                this.enclosures.add(enc);
            }
        }
        // Menambahkan Enclosure enc ke dalam this.enclosures apabila enc tidak kosong
    }

    public void updateTicketPrice() {
        float hargaTiketBaru = 0;
        for(Enclosure<? extends Animal> e: this.enclosures){
            if(e.safeForPetting()){
                hargaTiketBaru += 1.5 * e.getAnimalCount();
            } else {
                hargaTiketBaru += 1 * e.getAnimalCount();
            }
        }
        this.ticketPrice = hargaTiketBaru;
        // Melakukan update terhadap this.ticketPrice dengan rumus sebagai berikut
        // harga tiket baru = 0
        // Untuk setiap Enclosure dalam this.enclosures:
            // Apabila Enclosure bersifat safeForPetting:
            //     harga tiket baru += 1.5 * jumlah animal dalam enclosure
            // else:
            //     harga tiket baru += 1 * jumlah animal dalam enclosure 
    }

    public float getTicketPrice() {
        return this.ticketPrice;
        // getter untuk this.ticketPrice
    }

    public int getTotalAnimalCount() {
        int totalhewan = 0;
        for(Enclosure<? extends Animal> e : this.enclosures){
            totalhewan += e.getAnimalCount();
        }
        return totalhewan;
        // Mengembalikan jumlah total semua hewan yang ada pada semua enclosure dalam this.enclosures
    }

    public int getEnclosureCount() {
        return this.enclosures.size();
        // Mengembalikan jumlah enclosures dalam this.enclosures
    }

    public static void main(String args[]){
        Zoo zos = new Zoo();
        System.out.println(zos.getTicketPrice());
        Enclosure<Animal> e1 = new Enclosure<Animal>();
        Panda p1 = new Panda("Hehe", 10);
        Lion l1 = new Lion("Lolol", 10);
        e1.addAnimal(p1);
        e1.addAnimal(p1);
        e1.addAnimal(p1);
        e1.addAnimal(l1);
        
        System.out.println(e1.getAnimalAt(1).getName());
        zos.addEnclosure(e1);
        zos.updateTicketPrice();
        System.out.println("0: " + zos.getTicketPrice());
        Enclosure<Panda> e2 = new Enclosure<Panda>();
        Panda p2 = new Panda("Haha", 10);
        e2.addAnimal(p2);
        e2.addAnimal(p2);
        e2.addAnimal(p2);
        zos.addEnclosure(e2);
        zos.updateTicketPrice();
        System.out.println("1: " + zos.getTicketPrice());
        Enclosure<Lion> e4 = new Enclosure<Lion>();
        e4.addAnimal(l1);
        e4.addAnimal(l1);
        e4.addAnimal(l1);
        zos.addEnclosure(e4);
        zos.updateTicketPrice();
        System.out.println("2: " + zos.getTicketPrice());
        Enclosure<Animal> e3 = new Enclosure<Animal>();
        zos.addEnclosure(e3);
        zos.updateTicketPrice();
        System.out.println("3: " + zos.getTicketPrice());
        for(Enclosure<? extends Animal> e : zos.enclosures){
            System.out.println(e.getAnimalCount());
        }
        zos.updateTicketPrice();
        System.out.println(zos.getTicketPrice());
        System.out.println(zos.getTotalAnimalCount());
        e1.describe();
        e2.describe();
        e3.describe();
        e4.describe();
    }
}