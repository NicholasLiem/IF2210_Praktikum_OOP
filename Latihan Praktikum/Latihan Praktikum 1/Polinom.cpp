#include <iostream>
#include "Polinom.hpp"
using namespace std;

Polinom::Polinom(){
    this->derajat = 0;
    this->koef = new int[this->derajat+1];
    this->koef[0] = 0;
}

Polinom::Polinom(int n){
    this->derajat = n;
    this->koef = new int[this->derajat+1];
    for(int i = 0; i < this->derajat+1; i++){
        this->koef[i] = 0;
    }
}

Polinom::Polinom(const Polinom& p){
    this->derajat = p.derajat;
    this->koef = new int[this->derajat+1];
    for(int i = 0; i < this->derajat+1; i++){
        this->koef[i] = p.koef[i];
    }
}

Polinom::~Polinom(){
    delete[] this->koef;
}

Polinom& Polinom::operator=(const Polinom& p){
    this->derajat = p.derajat;
    delete[] this->koef;
    for(int i = 0; i < this->derajat+1; i++){
        this->koef[i] = p.koef[i];
    }
    return *this;
}

int Polinom::getKoefAt(int idx) const{
    return this->koef[idx];
}

int Polinom::getDerajat() const{
    return this->derajat;
}

void Polinom::setKoefAt(int idx, int val){
    this->koef[idx] = val;
}

void Polinom::setDerajat(int d){
    this->derajat = d;
}

void Polinom::input(){
    for(int i = 0; i < this->derajat+1; i++){
        cin >> this->koef[i];
    }
}

void Polinom::printKoef(){
    for(int i = 0; i < this->derajat+1; i++){
        cout << this->koef[i] << endl;
    }
}

int Polinom::substitute(int x){
    int res = 0;
    for(int i = 0; i < this->derajat+1; i++){
        int temp = this->koef[i];
        for(int j = 0; j < i; j++){
            temp *= x;
        }
        res += temp;
    }
    return res;
}

void Polinom::print(){
    bool allZeros = true;
    for(int i = 0; i < this->derajat+1; i++){
        if(this->koef[i] != 0){
            allZeros = false;
        }
    }
    if (allZeros){
        cout << 0 << endl;
    } else {
        bool first = true;
        for(int i = 0; i < this->derajat+1; i++){
            if(this->koef[i] != 0 && first){
                if(i == 0){
                    cout << this->koef[i];
                }else{
                    cout << this->koef[i] << "x^" << i;
                }
                first = false;
            } else {
                if(this->koef[i] > 0){
                    cout << "+" << this->koef[i] << "x^" << i;
                } else if (this->koef[i] < 0) {
                    cout << this->koef[i] << "x^" << i;
                }
            }
        }
    }
    cout << endl;
}


// int main(){
//     Polinom p(3);
//     p.input();
//     p.print();
//     cout << p.substitute(0) << endl;
//     return 0;
// }