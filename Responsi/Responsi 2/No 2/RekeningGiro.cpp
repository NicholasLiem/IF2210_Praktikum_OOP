#include <iostream>
#include "RekeningGiro.h"
using namespace std;

RekeningGiro::RekeningGiro(double a, double b) : Rekening(a){
    if (b < 0){
        this->sukuBunga = 0.0;
    } else {
        this->sukuBunga = b;
    }
}

void RekeningGiro::setSukuBunga(double b){
    this->sukuBunga = b;
}

double RekeningGiro::getSukuBunga() const {
    return this->sukuBunga;
}

double RekeningGiro::hitungBunga(){
    return Rekening::getSaldo() * this->sukuBunga;
}
