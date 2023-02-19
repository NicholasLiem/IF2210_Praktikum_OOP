#ifndef _ADDEXPRESSION_HPP_
#define _ADDEXPRESSION_HPP_

#include "Expression.hpp"

class AddExpression : public BinaryExpression {
    protected:
        int hasil;

    public:
        AddExpression(Expression* x, Expression* y);
        virtual int solve();
};

#endif