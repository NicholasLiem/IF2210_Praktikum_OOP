#include "ArtistUser.h"
#include <iostream>
#include <cstring>
using namespace std;

int ArtistUser::num_of_artist = 0;

ArtistUser::ArtistUser(char* nama) : User(nama) {
    this->num_of_music_uploaded = 0;
    this->uploaded_music_list = new char*[3000];
    num_of_artist++;
}

ArtistUser::ArtistUser(const ArtistUser& A) : User(A) {
    this->num_of_music_uploaded = A.num_of_music_uploaded;
    this->uploaded_music_list = new char*[3000];
    for (int i = 0; i < num_of_music_uploaded; i++) {
        this->uploaded_music_list[i] = new char[strlen(A.uploaded_music_list[i])];
        strcpy(this->uploaded_music_list[i], A.uploaded_music_list[i]);
    }
    ArtistUser::num_of_artist++;
}

ArtistUser::~ArtistUser() {
    delete[] this->uploaded_music_list;
    cout << "Artist user " << name << " deleted" << endl;
}

void ArtistUser::uploadMusic(char* musik){
    this->uploaded_music_list[num_of_music_uploaded] = new char[strlen(musik)];
    strcpy(this->uploaded_music_list[num_of_music_uploaded], musik);
    num_of_music_uploaded++;
}

void ArtistUser::deleteUploadedMusic(char* musik){
    int idx = -1;
    int i = 0;
    while (idx == -1 && i < num_of_music_uploaded){
        if (strcmp(musik, this->uploaded_music_list[i]) == 0){
            idx = i;
        } else {
            i++;
        }
    }
    if (idx == -1){
        return;
    }

    for(int j = idx; j < num_of_music_uploaded - 1; j++){
        this->uploaded_music_list[j] = new char[strlen(this->uploaded_music_list[j+1])];
        strcpy(this->uploaded_music_list[j], this->uploaded_music_list[j+1]);
    }
    num_of_music_uploaded--;
}

void ArtistUser::viewUploadedMusicList() const{
    if (this->num_of_music_uploaded == 0){
        cout << "No music uploaded" << endl;
    } else {
        for (int i = 0; i < num_of_music_uploaded; i++){
            cout << i+1 << ". " << this->uploaded_music_list[i] << endl;
        }
    }
}

int ArtistUser::getNumOfMusicUploaded() const{
    return this->num_of_music_uploaded;
}

int ArtistUser::getNumOfArtist() {
    return ArtistUser::num_of_artist;
}