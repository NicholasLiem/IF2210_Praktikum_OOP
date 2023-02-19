#include "NegativeExpression.hpp"
#include <iostream>
using namespace std;

int NegativeExpression::solve(){
    this->hasil = this->x->solve() * -1;
    return hasil;
}

NegativeExpression::NegativeExpression(Expression *a) : UnaryExpression(a){
}