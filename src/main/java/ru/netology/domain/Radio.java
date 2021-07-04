package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int middleStation;
    private int minStation = 0;
    private int maxStation = 9;
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
            currentVolume = currentVolume + 1;
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



    public int getMiddleStation() {
        return middleStation;
    }

    public void setMiddleStation(int middleStation) {
        if (middleStation != 4) {
            return;
        }
        this.middleStation = middleStation;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation && currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }


    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        if (minStation != 0) {
            return;
        }
        this.minStation = minStation;
    }


    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        if (maxStation != 9) {
            return;
        }
        this.maxStation = maxStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10 && currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        if (minVolume < 0) {
            return;
        }
        this.minVolume = minVolume;
    }


    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        if (maxVolume > 10) {
            return;
        }
        this.maxVolume = maxVolume;
    }
}

