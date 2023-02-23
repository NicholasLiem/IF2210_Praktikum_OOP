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
			if (this->isBurned())
			{
				this->Damageable::takeDamage(dmg*2);
			} else {
				this->Damageable::takeDamage(dmg);
			}
		} else if (element == "water"){
			this->watered();
		}
	}
}
