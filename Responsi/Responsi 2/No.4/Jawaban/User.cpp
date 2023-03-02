#include "User.h"
#include <iostream>
#include <cstring>
using namespace std;

int User::n_user = 0;

User::User(char* nama){
    this->name = new char[strlen(nama)];
    strcpy(this->name, nama);
    this->num_of_favourite_music = 0;
    this->music_list = new char*[3000];
    User::n_user++;
}

User::User(const User& A){
    this->name = new char[strlen(A.name)];
    this->music_list = new char*[2000];
    strcpy(this->name, A.getName());
    
    this->num_of_favourite_music = A.num_of_favourite_music;

    for (int i = 0; i < this->num_of_favourite_music; i++){
        this->music_list[i] = new char[strlen(A.music_list[i])];
        strcpy(this->music_list[i], A.music_list[i]);
    }
    User::n_user++;
}

User::~User(){
    cout << "User " << this->name << " deleted" << endl;
    delete[] this->music_list;
    delete[] name;
}

void User::addFavouriteMusic(char* musik){
    this->music_list[num_of_favourite_music] = new char[strlen(musik)];
    strcpy(this->music_list[num_of_favourite_music], musik);
    num_of_favourite_music++;
}

void User::deleteFavouriteMusic(char* musik){
    int idx = -1;
    int i = 0;
    while (idx == -1 && i < num_of_favourite_music){
        if (strcmp(musik, this->music_list[i]) == 0){
            idx = i;
        } else {
            i++;
        }
    }

    if (idx == -1){
        return;
    }

    for(int j = idx; j < num_of_favourite_music - 1; j++){
        this->music_list[j] = new char[strlen(this->music_list[j+1])];
        strcpy(this->music_list[j], this->music_list[j+1]);
    }
    num_of_favourite_music--;
}

void User::setName(char* nama){
    this->name = new char[strlen(nama)];
    strcpy(this->name, nama);
}

char* User::getName() const{
    return this->name;
}

int User::getNumOfFavouriteMusic() const{
    return this->num_of_favourite_music;
}

void User::viewMusicList() const{
    if (this->num_of_favourite_music == 0){
        cout << "No music in your favourite list" << endl;
    } else {
        for (int i = 0; i < num_of_favourite_music; i++){
            cout << i+1 << ". " << this->music_list[i] << endl;
        }
    }
}

int User::getNumOfUser(){
    return User::n_user;
}