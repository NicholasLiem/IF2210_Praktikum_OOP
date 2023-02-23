#include <iostream>
#include "ExplodableBarrel.hpp"
using namespace std;

ExplodableBarrel::ExplodableBarrel() : Damageable(1), Explodable(){
	this->radius = 5;
}

ExplodableBarrel::ExplodableBarrel(int radius, int baseDamage) : Damageable(1), Explodable(baseDamage){
	this->radius = radius;	
}

void ExplodableBarrel::takeDamage(int dmg, string element){
	if(this->isDestroyed()){

	} else {
		this->Damageable::takeDamage(dmg*5);
		if(this->isDestroyed()){
			this->Explodable::explode(this->radius);
		}	
	}
}
