#include "PremiumUser.h"
#include <iostream>
#include <cstring>
using namespace std;

PremiumUser::PremiumUser(char* nama) : User(nama){
    this->num_of_music_downloaded = 0;
    this->active = true;
}

PremiumUser::PremiumUser(const PremiumUser& A) : User(A){
    this->num_of_music_downloaded = A.num_of_music_downloaded;
    this->active = A.active;
}

PremiumUser::~PremiumUser(){
    // cout << "Premium user " << name << " deleted" << endl;
}

void PremiumUser::downloadMusic(char* judul){
    if (this->active){
        cout << "Music Downloaded: " << judul << endl;
        this->num_of_music_downloaded++;
    } else {
        cout << "Activate premium account to download music" << endl;
    }
}

void PremiumUser::inactivatePremium(){
    this->active = false;
}

void PremiumUser::activatePremium(){
    this->active = true;
}

int PremiumUser::getNumOfMusicDownloaded() const{
    return this->num_of_music_downloaded;
}

bool PremiumUser::getPremiumStatus() const{
    return this->active;
}