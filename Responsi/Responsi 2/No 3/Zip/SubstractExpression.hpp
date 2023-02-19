#ifndef _SUBSTRACTEXPRESSION_HPP_
#define _SUBSTRACTEXPRESSION_HPP_

#include "Expression.hpp"

class SubstractExpression : public BinaryExpression {
    protected:
        int hasil;

    public:
        SubstractExpression(Expression* x, Expression* y);
        virtual int solve();
};

#endif