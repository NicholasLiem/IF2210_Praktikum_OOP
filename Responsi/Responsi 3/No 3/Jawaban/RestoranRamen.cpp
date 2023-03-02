#include <iostream>
#include "RestoranRamen.hpp"
using namespace std;

void RestoranRamen::tambahOrder(int n, int p) {
    if (daftarMeja.find(n) == daftarMeja.end()) {
        // Meja belum terisi, langsung tambahkan
        daftarMeja[n] = p;
    } else {
        // Meja sudah terisi, tambahkan dengan total sebelumnya
        daftarMeja[n] += p;
    }
}

int RestoranRamen::tutupOrder(int n) {
    int total = 0;
    if (daftarMeja.find(n) != daftarMeja.end()) {
        // Meja terisi, ambil total harga pesanan
        total = daftarMeja[n];
        // Hapus entri untuk meja tersebut
        daftarMeja.erase(n);
    }
    return total;
}

int RestoranRamen::cekTotal(int n) {
    int total = 0;
    if (daftarMeja.find(n) != daftarMeja.end()) {
        // Meja terisi, ambil total harga pesanan
        total = daftarMeja[n];
    }
    return total;
}

int RestoranRamen::totalMeja() {
    return daftarMeja.size();
}

void RestoranRamen::cetakMeja() {
    if (daftarMeja.empty()) {
        cout << "Restoran kosong" << endl;
    } else {
        for (auto it = daftarMeja.begin(); it != daftarMeja.end(); it++) {
            cout << "Meja " << it->first << " = " << it->second << endl;
        }
    }
}
