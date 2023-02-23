#include <iostream>
#include "BurnableBarrel.hpp"
using namespace std;

BurnableBarrel::BurnableBarrel() : Damageable(), Burnable(){
}

BurnableBarrel::BurnableBarrel(int health) : Damageable(health), Burnable(){
}

void BurnableBarrel::takeDamage(int dmg, string element){
	if (this->isDestroyed()){
	} else {
		if (element == "fire"){
			this->burn();
		} else if (element == "water"){
			this->watered();
		}
		if (this->isBurned()){
			dmg = dmg * this->multiplier;
		}

		this->Damageable::takeDamage(dmg);	
	}
}
