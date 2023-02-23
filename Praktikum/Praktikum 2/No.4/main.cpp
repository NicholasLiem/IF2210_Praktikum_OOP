#include <iostream>
#include "Tool.hpp"
#include "Pickaxe.hpp"
#include "ReinforcedAxe.hpp"
using namespace std;

int main() {
  Pickaxe *p1 = new Pickaxe();
  p1->use();
  p1->enchant();
  Pickaxe *p2 = new Pickaxe(*p1);
  Pickaxe *p3 = new Pickaxe();
  *p3 = *p1;
  ReinforcedAxe *ra1 = new ReinforcedAxe();
  ra1->use();
  ReinforcedAxe *ra2 = new ReinforcedAxe(*ra1);
  ra2->enchant();
  ReinforcedAxe *ra3 = new ReinforcedAxe(*ra1 + *ra2);
  ra3->repair();
  delete ra1;
  delete ra2;
  delete ra3;
  delete p1;
  delete p2;
  return 0;
}