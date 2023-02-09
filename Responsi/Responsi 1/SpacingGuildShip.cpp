#include "SpacingGuildShip.hpp"
#include <iostream>
using namespace std;

int SpacingGuildShip::producedShips = 0;
float SpacingGuildShip::totalGuildTravel = 0;


SpacingGuildShip::SpacingGuildShip() : guildNavigatorCount(3), maxPassengerCap(50), serialNum(SpacingGuildShip::producedShips+1){
	this->passengerCount = 0;
    this->spiceStock = 50;
    this->operatingGuildNavigator = 3;
    SpacingGuildShip::producedShips++;
}

SpacingGuildShip::SpacingGuildShip(int maxPassengerCap, int guildNavigatorCount, int spiceStock) : guildNavigatorCount(guildNavigatorCount), maxPassengerCap(maxPassengerCap), serialNum(SpacingGuildShip::producedShips+1){
	this->passengerCount = 0;
    this->spiceStock = spiceStock;
    this->operatingGuildNavigator = guildNavigatorCount;
    SpacingGuildShip::producedShips++;
}
SpacingGuildShip::SpacingGuildShip(const SpacingGuildShip& ship): guildNavigatorCount(ship.guildNavigatorCount), maxPassengerCap(ship.maxPassengerCap), serialNum(ship.producedShips+1){
	this->passengerCount = ship.passengerCount;
    this->spiceStock = ship.spiceStock;
    this->operatingGuildNavigator = ship.operatingGuildNavigator;
    this->producedShips++;
}

SpacingGuildShip::~SpacingGuildShip(){

}

int SpacingGuildShip::getShipSerialNum() const{
    return this->serialNum;
}

int SpacingGuildShip::getPassengerCount() const{
    return this->passengerCount;
}

void SpacingGuildShip::travel(float distance){
    if (operatingGuildNavigator == 0){

    } else {
        float dist = distance / (E*E * this->operatingGuildNavigator);
        SpacingGuildShip::totalGuildTravel += dist;
        this->operatingGuildNavigator--;
    }
}

void SpacingGuildShip::boarding(int addedPassengers){
    if (addedPassengers + this->passengerCount > this->maxPassengerCap){
        this->passengerCount = maxPassengerCap;
    } else {
        this->passengerCount += addedPassengers;
    }

}


void SpacingGuildShip::dropOff(int droppedPassengers){
    if (droppedPassengers > this->passengerCount){
        this->passengerCount = 0;
    } else {
        this->passengerCount -= droppedPassengers;
    }
}

void SpacingGuildShip::refreshNavigator(int n){
    int available = this->guildNavigatorCount - this->operatingGuildNavigator;
    if (n * GUILD_NAVIGATOR_SPICE_DOSE < this->spiceStock){
        if (n < available){
            this->spiceStock -= GUILD_NAVIGATOR_SPICE_DOSE * n;
            this->operatingGuildNavigator += n;
        } else {
            this->spiceStock -= GUILD_NAVIGATOR_SPICE_DOSE * available;
            this->operatingGuildNavigator += available;
        }
    } else {
        this->spiceStock -= (this->spiceStock/GUILD_NAVIGATOR_SPICE_DOSE) * GUILD_NAVIGATOR_SPICE_DOSE;
        this->operatingGuildNavigator += (this->spiceStock/GUILD_NAVIGATOR_SPICE_DOSE);  }

}

void SpacingGuildShip::transitToArrakis(int addedSpice){
    this->spiceStock += addedSpice;
}

