package ru.netology.domain;

public class Radio {
    private int currentStation = 10;
    private int middleStation = 5;
    private int minStation = 0;
    private int maxStation = 10;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int stationsAmount = 10;

    public Radio() {}

    public Radio(int currentStation, int middleStation, int minStation, int maxStation, int minVolume, int maxVolume, int stationsAmount) {
        this.currentStation = currentStation;
        this.middleStation = middleStation;
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.stationsAmount = stationsAmount;
    }

    public int getStationsAmount() {
        return stationsAmount;
    }

    public void setStationsAmount(int stationsAmount) {
        this.stationsAmount = stationsAmount;
    }

    public int getMiddleStation() {
        return middleStation;
    }

    public int setMiddleStation(int middleStation) {
        if (middleStation != 5) {
            return middleStation;
        }
        this.middleStation = middleStation;
        return middleStation;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
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


    public int getMaxStation() {
        return maxStation;
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

