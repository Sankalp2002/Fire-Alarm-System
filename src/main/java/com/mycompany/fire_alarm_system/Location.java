/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fire_alarm_system;
//import floor hashmaps
import static com.mycompany.fire_alarm_system.MainScreen.f0;
import static com.mycompany.fire_alarm_system.MainScreen.f1;
import static com.mycompany.fire_alarm_system.MainScreen.f2;
import static com.mycompany.fire_alarm_system.MainScreen.f3;
import static com.mycompany.fire_alarm_system.MainScreen.f4;
import static com.mycompany.fire_alarm_system.MainScreen.f5;
import static java.lang.Math.floor;
import java.util.Map;

/**
 *
 * @author rajen
 */
//Location class for storing all details of a location
public class Location {
    //static threshold values for 3 types of sensors common for every location
    static float smokeThValue, heatThValue, coThValue;
    //static duration, log interval and volume common to all locations
    static int smokeAlarmDuration, heatAlarmDuration, coAlarmDuration, logInterval=10, alarmVolume=90;
    //float cuurent values for 3 types of sensors specific to each location 
    float smokeCrValue, heatCrValue, coCrValue;
    //variable holding 0 for manual alarm not triggered and 1 for manual alarm triggered in CC3
    int isManualAlarmTriggered;
    //ID strings for each type of sensor at each location
    String smokeID, heatID, coID;
    //constructor for initialising sensor IDs to null strings and current values to 0 at each location
    Location(){
        smokeCrValue=0;
        heatCrValue=0;
        coCrValue=0;
        smokeID=""; 
        heatID=""; 
        coID="";   
    }
    //methods to set static values common for each type of sensor
    public static void conSsensor(int d, int v, int l, float t){
        smokeAlarmDuration=d; alarmVolume=v; logInterval=l; smokeThValue=t;
    }
    public static void conHsensor(int d, int v, int l, float t){
        heatAlarmDuration=d; alarmVolume=v; logInterval=l; heatThValue=t;
    }
    public static void conCsensor(int d, int v, int l, float t){
        coAlarmDuration=d; alarmVolume=v; logInterval=l; coThValue=t;
    }
    //methods to set current values using random generator for each sensor at each location
    //max current value is 1.02 times of threshold to simulate low probability of breaching threshold 
    public void setScvalue(){
        float min=smokeThValue/2;
        float max=(float) (smokeThValue*1.02);
        smokeCrValue=RandomGenerator.RandomGenerator(min, max);
    }
    public void setHcvalue(){
        float min=heatThValue/2;
        float max=(float) (heatThValue*1.02);
        heatCrValue=RandomGenerator.RandomGenerator(min, max);
    }
    public void setCcvalue(){
        float min=coThValue/2;
        float max=(float) (coThValue*1.02);
        coCrValue=RandomGenerator.RandomGenerator(min, max);
    }
    //method to set mcp to 0 or 1 
    public void setmcp(){
        float min=0;
        float max=(float) (1.02);
        isManualAlarmTriggered=(int) floor(RandomGenerator.RandomGenerator(min, max));
    }
    //method to set current values for each location cuurently present in the hashmaps of floor by iterating through hashmaps
    //if the sensor id of a location is not null string, it knows then that that type of sensor has been registered and sets a-- 
    //--random value by using previous methods 
    public static void allSet(){
        for(Map.Entry<String,Location> mp : f0.entrySet()){
            if(!mp.getValue().smokeID.equals("")){
                mp.getValue().setScvalue();
            }
            if(!mp.getValue().heatID.equals("")){
                mp.getValue().setHcvalue();
            }
            if(!mp.getValue().coID.equals("")){
                mp.getValue().setCcvalue();
            }
            mp.getValue().setmcp();
        }
        for(Map.Entry<String,Location> mp : f1.entrySet()){
            if(!mp.getValue().smokeID.equals("")){
                mp.getValue().setScvalue();
            }
            if(!mp.getValue().heatID.equals("")){
                mp.getValue().setHcvalue();
            }
            if(!mp.getValue().coID.equals("")){
                mp.getValue().setCcvalue();
            }
            mp.getValue().setmcp();
        }
        for(Map.Entry<String,Location> mp : f2.entrySet()){
            if(!mp.getValue().smokeID.equals("")){
                mp.getValue().setScvalue();
            }
            if(!mp.getValue().heatID.equals("")){
                mp.getValue().setHcvalue();
            }
            if(!mp.getValue().coID.equals("")){
                mp.getValue().setCcvalue();
            }
            mp.getValue().setmcp();
        }
        for(Map.Entry<String,Location> mp : f3.entrySet()){
            if(!mp.getValue().smokeID.equals("")){
                mp.getValue().setScvalue();
            }
            if(!mp.getValue().heatID.equals("")){
                mp.getValue().setHcvalue();
            }
            if(!mp.getValue().coID.equals("")){
                mp.getValue().setCcvalue();
            }
            mp.getValue().setmcp();
        }
        for(Map.Entry<String,Location> mp : f4.entrySet()){
            if(!mp.getValue().smokeID.equals("")){
                mp.getValue().setScvalue();
            }
            if(!mp.getValue().heatID.equals("")){
                mp.getValue().setHcvalue();
            }
            if(!mp.getValue().coID.equals("")){
                mp.getValue().setCcvalue();
            }
            mp.getValue().setmcp();
        }
        for(Map.Entry<String,Location> mp : f5.entrySet()){
            if(!mp.getValue().smokeID.equals("")){
                mp.getValue().setScvalue();
            }
            if(!mp.getValue().heatID.equals("")){
                mp.getValue().setHcvalue();
            }
            if(!mp.getValue().coID.equals("")){
                mp.getValue().setCcvalue();
            }
            mp.getValue().setmcp();
        }
    }
    }

