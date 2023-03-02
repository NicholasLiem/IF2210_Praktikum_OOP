#include <iostream>
#include "memo.h"
#include "exception.h"
using namespace std;

Memo::Memo(){
    this->pesan = "";
    this->untuk = "";
}

Memo::Memo(string pesan, string untuk){
    if (pesan.length() > PESAN_MAX){
        throw PesanKepanjanganException();
    }
    this->pesan = pesan;
    this->untuk = untuk;
}

Memo& Memo::operator=(Memo& obj){
    this->pesan = obj.getPesan();
    this->untuk = obj.getUntuk();
    return *this;
}

string Memo::getUntuk(){
    return this->untuk;
}

string Memo::getPesan(){
    return this->pesan;
}