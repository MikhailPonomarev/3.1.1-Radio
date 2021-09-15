package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int stationsAmount = 10;

    public Radio() {
    }

    public Radio(int stationsAmount) {
        if (stationsAmount > minStation) {
            this.stationsAmount = stationsAmount - 1;
        }
    }

    public int getStationsAmount() {
        return stationsAmount;
    }


    public void setStationsAmount(int stationsAmount) {
        if (stationsAmount < minStation) {
            return;
        }
        this.stationsAmount = stationsAmount;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > stationsAmount) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = stationsAmount;
        }
        this.currentStation = currentStation;
    }


    public int getMinStation() {
        return minStation;
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

    public int getCurrentVolume() {
        return currentVolume;
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


    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        if (minVolume != this.minVolume) {
            return;
        }
        this.minVolume = minVolume;
    }


    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        if (maxVolume != this.maxVolume) {
            return;
        }
        this.maxVolume = maxVolume;
    }

    public void nextStation() {
        if (currentStation >= stationsAmount) {
            this.currentStation = minStation;
        }
        else if (currentStation == minStation) {
            return;
        }
        else {
            this.currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation < minStation) {
            this.currentStation = stationsAmount;
        }
        else if (currentStation == minStation) {
            this.currentStation = stationsAmount;
        }
        else {
            this.currentStation = currentStation - 1;
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

