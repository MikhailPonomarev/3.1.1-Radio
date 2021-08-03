package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentStation = 10;
    private int middleStation = 5;
    private int minStation = 0;
    private int maxStation = 10;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int stationsAmount;

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        this.currentStation = currentStation;
    }

    public void setMinStation(int minStation) {
        if (this.minStation > minStation) {
            return;
        }
        if (this.minStation < minStation) {
            return;
        }
        this.minStation = minStation;
    }

    public void setMaxStation(int maxStation) {
        if (this.maxStation > maxStation) {
            return;
        }
        if (this.maxStation < maxStation) {
            return;
        }
        this.maxStation = maxStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void setMinVolume(int minVolume) {
        if (minVolume != this.minVolume) {
            return;
        }
        this.minVolume = minVolume;
    }

    public void setMaxVolume(int maxVolume) {
        if (maxVolume != this.maxVolume) {
            return;
        }
        this.maxVolume = maxVolume;
    }

    public void nextStation() {
        if (currentStation <= 10) {
            currentStation = currentStation + 1;
        }
        if (currentStation > 10) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation <= 0) {
            currentStation = 10;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}

