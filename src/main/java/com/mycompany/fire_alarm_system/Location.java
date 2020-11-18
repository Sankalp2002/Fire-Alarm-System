/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fire_alarm_system;

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
/**
Stvalue, Htvalue, Ctvalue, Scvalue, Hcvalue, Ccvalue, Sid, Hid, Cid,;
*/
public class Location {
    static float Stvalue, Htvalue, Ctvalue;
    static int Sdur, Hdur, Cdur, log=10, vol=90;
    float Scvalue, Hcvalue, Ccvalue;
    int mcp;
    String Sid, Hid, Cid;
    Location(){
        Scvalue=0;
        Hcvalue=0;
        Ccvalue=0;
        Sid=""; 
        Hid=""; 
        Cid="";   
    }
    
//    public void setLoc(Sensor s){
//        loc=s.location;
//    }
    public static void conSsensor(int d, int v, int l, float t){
        Sdur=d; vol=v; log=l; Stvalue=t;
    }
    public static void conHsensor(int d, int v, int l, float t){
        Hdur=d; vol=v; log=l; Htvalue=t;
    }
    public static void conCsensor(int d, int v, int l, float t){
        Cdur=d; vol=v; log=l; Ctvalue=t;
    }
    public void setScvalue(){
        float min=Stvalue/2;
        float max=(float) (Stvalue*1.05);
        Scvalue=RandomGenerator.RandomGenerator(min, max);
    }
    public void setHcvalue(){
        float min=Htvalue/2;
        float max=(float) (Htvalue*1.05);
        Hcvalue=RandomGenerator.RandomGenerator(min, max);
    }
    public void setCcvalue(){
        float min=Ctvalue/2;
        float max=(float) (Ctvalue*1.05);
        Ccvalue=RandomGenerator.RandomGenerator(min, max);
    }
    public void setmcp(){
        float min=0;
        float max=(float) (1.05);
        mcp=(int) floor(RandomGenerator.RandomGenerator(min, max));
    }
    public static void allSet(){
        for(Map.Entry<String,Location> mp : f0.entrySet()){
            if(!mp.getValue().Sid.equals("")){
                mp.getValue().setScvalue();
            }
            if(!mp.getValue().Hid.equals("")){
                mp.getValue().setHcvalue();
            }
            if(!mp.getValue().Cid.equals("")){
                mp.getValue().setCcvalue();
            }
            mp.getValue().setmcp();
        }
        for(Map.Entry<String,Location> mp : f1.entrySet()){
            if(!mp.getValue().Sid.equals("")){
                mp.getValue().setScvalue();
            }
            if(!mp.getValue().Hid.equals("")){
                mp.getValue().setHcvalue();
            }
            if(!mp.getValue().Cid.equals("")){
                mp.getValue().setCcvalue();
            }
            mp.getValue().setmcp();
        }
        for(Map.Entry<String,Location> mp : f2.entrySet()){
            if(!mp.getValue().Sid.equals("")){
                mp.getValue().setScvalue();
            }
            if(!mp.getValue().Hid.equals("")){
                mp.getValue().setHcvalue();
            }
            if(!mp.getValue().Cid.equals("")){
                mp.getValue().setCcvalue();
            }
            mp.getValue().setmcp();
        }
        for(Map.Entry<String,Location> mp : f3.entrySet()){
            if(!mp.getValue().Sid.equals("")){
                mp.getValue().setScvalue();
            }
            if(!mp.getValue().Hid.equals("")){
                mp.getValue().setHcvalue();
            }
            if(!mp.getValue().Cid.equals("")){
                mp.getValue().setCcvalue();
            }
            mp.getValue().setmcp();
        }
        for(Map.Entry<String,Location> mp : f4.entrySet()){
            if(!mp.getValue().Sid.equals("")){
                mp.getValue().setScvalue();
            }
            if(!mp.getValue().Hid.equals("")){
                mp.getValue().setHcvalue();
            }
            if(!mp.getValue().Cid.equals("")){
                mp.getValue().setCcvalue();
            }
            mp.getValue().setmcp();
        }
        for(Map.Entry<String,Location> mp : f5.entrySet()){
            if(!mp.getValue().Sid.equals("")){
                mp.getValue().setScvalue();
            }
            if(!mp.getValue().Hid.equals("")){
                mp.getValue().setHcvalue();
            }
            if(!mp.getValue().Cid.equals("")){
                mp.getValue().setCcvalue();
            }
            mp.getValue().setmcp();
        }
    }
    }

