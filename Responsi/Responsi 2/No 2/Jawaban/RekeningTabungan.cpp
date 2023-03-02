#include <iostream>
#include "RekeningTabungan.h"
using namespace std;

RekeningTabungan::RekeningTabungan(double a, double b) : Rekening(a){
    if (biayaTransaksi < 0){
        this->biayaTransaksi = 0.0;
    } else {
        this->biayaTransaksi = b;
    }
}

void RekeningTabungan::setBiayaTransaksi(double b){
    this->biayaTransaksi = b;
}

double RekeningTabungan::getBiayaTransaksi() const {
    return this->biayaTransaksi;
}

void RekeningTabungan::simpanUang(double simpan){
    Rekening::simpanUang(simpan-biayaTransaksi);
}

bool RekeningTabungan::tarikUang(double tarik){
    if(Rekening::tarikUang(tarik)){
        double saldoBaru = Rekening::getSaldo() - this->biayaTransaksi;
        Rekening::setSaldo(saldoBaru);
        return true;
    } else {
        return false;
    }
}