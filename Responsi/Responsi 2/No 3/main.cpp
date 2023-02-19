#include "AddExpression.hpp"
#include "NegativeExpression.hpp"
#include "SubtractExpression.hpp"
#include "Expression.hpp"
#include <iostream>
using namespace std;

int main(){ 
    AddExpression e = AddExpression(new TerminalExpression(4), new TerminalExpression(6));
    e.solve();
    SubtractExpression e1 = SubtractExpression(new TerminalExpression(4), new TerminalExpression(6));
    e1.solve();
    NegativeExpression e2 = NegativeExpression(new TerminalExpression(1));
    e2.solve();
}
