#include "AddExpression.hpp"
#include <iostream>
using namespace std;

int AddExpression::solve(){
    this->hasil = this->x->solve() + this->y->solve();
    return hasil;
}

AddExpression::AddExpression(Expression *a, Expression *b) : BinaryExpression(a, b){
}