#include <iostream>
#include "Rekening.h"
using namespace std;

Rekening::Rekening(double saldo){
    if (saldo < 0){
        this->saldo = 0.0;
    } else {
        this->saldo = saldo;
    }
}

void Rekening::setSaldo(double saldo){
    this->saldo = saldo;
}

double Rekening::getSaldo() const {
    return this->saldo;
}

void Rekening::simpanUang(double simpan){
    this->saldo += simpan;
}

bool Rekening::tarikUang(double tarik){
    if(tarik <= this->saldo){
        this->saldo -= tarik;
        return true;
    } else {
        return false;
    }
}