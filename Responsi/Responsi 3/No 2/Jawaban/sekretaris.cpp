#include <iostream>
#include "sekretaris.h"
#include "exception.h"
using namespace std;

Sekretaris::Sekretaris(){
    this->energi = ENERGI_MAX;
    this->kertas = KERTAS_DEFAULT;
    this->tinta = TINTA_DEFAULT;
    this->memoLength = 0;
    this->memo = new Memo[3000];
}

Sekretaris::Sekretaris(int kertas, int tinta){
    this->energi = ENERGI_MAX;
    this->kertas = kertas;
    this->tinta = tinta;
    this->memoLength = 0;
    this->memo = new Memo[1000];
}

Sekretaris::~Sekretaris(){
    delete[] this->memo;
}

void Sekretaris::buatMemo(string pesan, string untuk) {
    try {
        pakaiKertas();
        pakaiTinta(pesan.length());
        pakaiEnergi();
        Memo memoBaru(pesan, untuk);
        this->memo[memoLength] = memoBaru;
        cout << "Memo [" << memoLength+1 << "] untuk " << this->memo[memoLength].getUntuk() << " berhasil dibuat" << endl;
        memoLength++;
    } catch (KertasHabisException& e) {
        cout << e.what() << ", segera isi kertas" << endl;
    } catch (TintaKurangException& e) {
        cout << e.what() << ", segera isi tinta" << endl;
        batalPakaiKertas();
    } catch (EnergiHabisException& e) {
        cout << e.what() << ", segera istirahat" << endl;
        batalPakaiKertas();
        batalPakaiTinta(pesan.length());
    } catch (PesanKepanjanganException& e) {
        cout << e.what() << ", perpendek pesannya" << endl;
        batalPakaiKertas();
        batalPakaiTinta(pesan.length());
        batalPakaiEnergi();
    }
}

void Sekretaris::pakaiTinta(int num) {
    if (tinta < num) {
        throw TintaKurangException();
    }
    tinta -= num;
}

void Sekretaris::pakaiEnergi() {
    if (energi <= 0) {
        throw EnergiHabisException();
    }
    energi--;
}

void Sekretaris::pakaiKertas(){
    if(kertas <= 0){
        throw KertasHabisException();
    }
    kertas--;
}

void Sekretaris::batalPakaiKertas() {
    kertas++;
}

void Sekretaris::batalPakaiTinta(int num) {
    tinta += num;
}

void Sekretaris::batalPakaiEnergi() {
    energi++;
}

void Sekretaris::isiTinta(int num) {
    tinta += num;
}

void Sekretaris::isiKertas(int num) {
    kertas += num;
}

void Sekretaris::istirahat() {
    energi = ENERGI_MAX;
}

void Sekretaris::printStatus(){
    cout << "Status" << endl;
    cout << "  Energi : " << energi << endl;
    cout << "  Tinta : " << tinta << endl;
    cout << "  Kertas : " << kertas << endl;
    cout << "  Memo : " << memoLength << endl;
    for (int i = 0; i < memoLength; i++) {
        cout << "    Memo [" << i+1 << "]" << endl;
        cout << "      Pesan : " << this->memo[i].getPesan() << endl;
        cout << "      Untuk : " << this->memo[i].getUntuk() << endl;
    }
}