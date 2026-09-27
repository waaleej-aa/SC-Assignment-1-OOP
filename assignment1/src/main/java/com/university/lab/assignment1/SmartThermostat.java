/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.assignment1;

/**
 *
 * @author waleeja
 */
public class SmartThermostat implements SmartDevice {
    private boolean isOn;
    private double temperature;

    public SmartThermostat() {
        this.isOn = false;
        this.temperature = 20.0; // default temp
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public String getStatus() {
        return "Thermostat is " + (isOn ? "ON" : "OFF") + ", temperature: " + temperature + "°C";
    }

    public void setTemperature(double temp) {
        temperature = temp;
    }
}
