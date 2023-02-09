#include <iostream>
#include "Kompleks.h"
using namespace std;

int Kompleks::n_kompleks = 0;

Kompleks::Kompleks(){
	this->real = 0;
	this->imaginer = 0;
	n_kompleks++;
}

Kompleks::Kompleks(int real, int imaginer){
	this->real = real;
	this->imaginer = imaginer;
	n_kompleks++;
}

int Kompleks::GetReal() const{
	return this->real;
}

int Kompleks::GetImaginer() const{
	return this->imaginer;
}

void Kompleks::SetReal(int a){
	this->real = a;
}

void Kompleks::SetImaginer(int a){
	this->imaginer = a;
}

Kompleks operator+(const Kompleks& a, const Kompleks&b){
	Kompleks c;
	int A = a.GetReal();
	int B = a.GetImaginer();
	int C = b.GetReal();
	int D = b.GetImaginer();
	c.SetReal(A+C);
	c.SetImaginer(B+D);
	return c;
}

Kompleks operator-(const Kompleks& a, const Kompleks&b){
	Kompleks c;
	c.SetReal(A-C);
	c.SetImaginer(B-D);
	return c;
}

Kompleks operator*(const Kompleks& a, const Kompleks&b){
	Kompleks c;
	int A = a.GetReal();
	int B = a.GetImaginer();
	int C = b.GetReal();
	int D = b.GetImaginer();
	c.SetReal(A*C-(B*D));
	c.SetImaginer(B*C+(A*D));
	return c;
}

Kompleks operator*(const Kompleks& a, const int integer){
	Kompleks c;
	int A = a.GetReal();
	int B = a.GetImaginer();
	c.SetReal(A*integer);
	c.SetImaginer(B*integer);
	return c;
}

Kompleks operator*(const int integer, const Kompleks& a){
	Kompleks c;
	int A = a.GetReal();
	int B = a.GetImaginer();
	c.SetReal(A*integer);
	c.SetImaginer(B*integer);
	return c;
}

int Kompleks::CountKompleksInstance(){
	return n_kompleks;
};

void Kompleks::Print(){
	if (this->imaginer < 0){
		cout << this->real << this->imaginer << "i" << endl;
	} else {
		cout << this->real << "+" << this->imaginer << "i" << endl;
	} 
}