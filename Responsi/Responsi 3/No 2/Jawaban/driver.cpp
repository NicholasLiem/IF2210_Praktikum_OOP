#include "sekretaris.h"
#include "exception.h"
#include "memo.h"
#include <iostream>
using namespace std;

int main(){
    Sekretaris haha(1, 100);
    haha.isiKertas(1);
    haha.isiTinta(100);
    haha.printStatus();
    haha.buatMemo("Hello10000000", "Joe");
    haha.buatMemo("Hello10", "Joe");
    haha.printStatus();
    return 0;
}