package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int middleStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

    public void nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation >= 9) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation < 0) {
            currentStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume +1;
        }
        if (currentVolume > 10) {
            return;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume < 0) {
            return;
        }
    }


    //Middle Station
    public int getMiddleStation() {
        return middleStation;
    }

    public void setMiddleStation(int middleStation) {
        if (middleStation != 4) {
            return;
        }
        this.middleStation = middleStation;
    }

    //Current Station
    public int getCurrentStation() {
        return currentStation; //позволяет получить данные о текущей станции от объекта Радио
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        //this.currentStation = currentStation;

    }

    //Min
    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    //Max
    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    //Current Volume
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    //Min Volume
    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    //Max Volume
    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }
}

