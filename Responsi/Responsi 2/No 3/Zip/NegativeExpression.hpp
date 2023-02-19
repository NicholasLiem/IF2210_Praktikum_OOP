#ifndef _NEGEXPRESSION_HPP_
#define _NEGEXPRESSION_HPP_

#include "Expression.hpp"

class NegativeExpression : public UnaryExpression {
    protected:
        int hasil;

    public:
        NegativeExpression(Expression* x);
        virtual int solve();
};

#endif