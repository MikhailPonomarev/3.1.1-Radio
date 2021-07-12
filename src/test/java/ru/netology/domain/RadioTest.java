package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class RadioTest {
    Radio radio = new Radio(
            10,
            5,
            0,
            10,
            15,
            0,
            100,
            10);

    @Test
    public void shouldUseAllArgsConstructor() {
        assertEquals(10, radio.getStationsAmount());
        assertEquals(15, radio.getCurrentVolume());
    }

    @Test
    public void shouldUseNoArgsConstructor() {
        Radio radio = new Radio();
        assertEquals(15, radio.getCurrentVolume());
        assertEquals(10, radio.getStationsAmount());
    }

    @Test
    public void middleStationLowerThanExpected() {
        radio.setMiddleStation(4);
        assertEquals(5, radio.getMiddleStation());
    }

    @Test
    public void middleStationHigherThanExpected() {
        radio.setMiddleStation(6);
        assertEquals(5, radio.getMiddleStation());
    }

    @Test
    public void middleStationMustBe5() {
        int expected = radio.getStationsAmount() / 2;
        assertEquals(expected, radio.getMiddleStation());
    }

    @Test
    public void currentStationInInitialRange() {
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
    }

    //если текущая станция < минимальной, то должна переключиться на максимальную
    @Test
    public void ifCurrentStationLower() {
        radio.setCurrentStation(-1);
        assertEquals(10, radio.getCurrentStation());

    }

    //если текущая станция > максимальной, то должна переключиться на минимальную
    @Test
    public void ifCurrentStationHigher() {
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }

    //минимальная станция должна быть №0
    @Test
    public void minStationMustBeZero() {
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void minStationLowerThanExpected() {
        radio.setMinStation(-1);
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void minStationHigherThanExpected() {
        radio.setMinStation(1);
        assertEquals(0, radio.getMinStation());
    }

    //максимальная радиостанция должна быть №10
    @Test
    public void maxStationMustBe10() {
        radio.setMaxStation(15);
        assertEquals(10, radio.getMaxStation());
    }

    @Test
    public void maxStationLowerThanExpected() {
        radio.setMaxStation(9);
        assertEquals(10, radio.getMaxStation());
    }

    @Test
    public void maxStationHigherThanExpected() {
       radio.setMaxStation(11);
       assertEquals(10, radio.getMaxStation());
    }

    @Test
    public void currentVolumeInInitialRange() {
        radio.setCurrentVolume(50);
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void currentVolumeLowerThanAvailable() {
       radio.setCurrentVolume(-1);
        assertEquals(15, radio.getCurrentVolume());
    }

    @Test
    public void currentVolumeHigherThanAvailable() {
        radio.setCurrentVolume(101);
        assertEquals(15, radio.getCurrentVolume());
    }
//
    @Test
    public void minVolumeMustBeZero() { //минимальная громкость должна быть = 0
        radio.setMinVolume(1);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void minVolumeLowerThanExpected() {
        radio.setMinVolume(-1);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void minVolumeHigherThanExpected() {
        radio.setMinVolume(1);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void maxVolumeMustBe100() { //максимальная громкость должна быть = 100
        radio.setMaxVolume(100);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void maxVolumeLowerThanExpected() {
        radio.setMaxVolume(99);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void maxVolumeHigherThanExpected() {
        radio.setMaxVolume(101);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void switchingStationToNext() {
        radio.setCurrentStation(3);
        radio.nextStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void nextStationOverThanAvailable() {
        radio.setCurrentStation(10);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void switchingStationToPrevious() {
        radio.setCurrentStation(7);
        radio.prevStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void prevStationLowerThanAvailable() {
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void increasingVolume() {
        radio.setCurrentVolume(62);
        radio.increaseVolume();
        assertEquals(63, radio.getCurrentVolume());
    }

    @Test
    public void highestVolumeMustBe100() { //максимальная громкость должна быть = 100
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    public void decreasingVolume() {
        radio.setCurrentVolume(51);
        radio.decreaseVolume();
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void lowestVolumeMustBeZero() { //минимальная громкость должна быть = 0
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}