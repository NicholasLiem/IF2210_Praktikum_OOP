#include <iostream>
#include "Item.hpp"
using namespace std;

int Item::totalItems = 0;
int Item::totalRevenue = 0;

Item::Item() : serialNum(Item::totalItems + 1){
	this->stock = 0;
	this->price = 0;
	this->sold = 0;
	Item::totalItems++;
}

Item::Item(int stk, int prc) : serialNum(Item::totalItems + 1){
	this->stock = stk;
	this->price = prc;
	this-> sold = 0;
	Item::totalItems++;
}

Item::Item(const Item& old) : serialNum(Item::totalItems + 1){
	this->stock = old.stock;
	this->price = old.price;
	this->sold = old.sold;
	Item::totalItems++;
}

Item::~Item(){

}

int Item::getSerialNum() const{
	return this->serialNum;
}

int Item::getSold() const{
	return this->sold;
}

int Item::getPrice() const{
	return this->price;
}

void Item::addStock(int addedStock){
	this->stock += addedStock;
}

void Item::sell(int soldStock){
	if (soldStock >= this->stock){
		this->sold += this->stock;
		Item::totalRevenue += this->price * this->stock;
		this->stock = 0;
	} else {
		this->stock -= soldStock;
		Item::totalRevenue += this->price * soldStock;
		this->sold += soldStock;
	}

}

void Item::setPrice(int newPrice){
	this->price = newPrice;
}