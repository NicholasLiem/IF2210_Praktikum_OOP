#include "AppreciatingAsset.hpp"
#include <iostream>
using namespace std;

double AppreciatingAsset::getValue(int years){
	double hasil = this->x->getValue(years);
	for(int i = 0; i < years; i++){
		hasil *= (1+(this->rate));
	}
	return hasil;
}
