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
    private int stationsAmount = 10;
}

