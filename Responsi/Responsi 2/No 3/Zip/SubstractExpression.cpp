#include "SubstractExpression.hpp"
#include <iostream>
using namespace std;

int SubstractExpression::solve(){
    this->hasil = this->x->solve() - this->y->solve();
    return hasil;
}

SubstractExpression::SubstractExpression(Expression *a, Expression *b) : BinaryExpression(a, b){
}