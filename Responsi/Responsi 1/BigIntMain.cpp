#include <iostream>
#include "BigNumber.cpp"
using namespace std;

ostream& operator<<(ostream& os, const BigNumber& bn) {
  bool foundNonZero = false;
  for (int i = 20 - 1; i >= 0; i--) {
    if (bn[i] > 0) {
      foundNonZero = true;
    }
    if (foundNonZero) {
      os << bn[i];
    }
  }
  if (!foundNonZero) {
    os << "0";
  }
  return os;
}

int main() {
  BigNumber a(22199999), b(130);
  cout << (a - b) << endl; // 2333
  return 0;
}