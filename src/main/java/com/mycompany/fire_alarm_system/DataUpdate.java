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
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TimerTask;
import javax.swing.table.DefaultTableModel;
import static com.mycompany.fire_alarm_system.MonitorScreen.valuesTable;
import static com.mycompany.fire_alarm_system.MonitorScreen.alertsTable;
import static com.mycompany.fire_alarm_system.MonitorScreen.choosenFloor;

/**
 *
 * @author rajen
 */
public class DataUpdate extends TimerTask{

    @Override
    public void run() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        Location.allSet();
        DefaultTableModel tm1=(DefaultTableModel)valuesTable.getModel();
        DefaultTableModel tm2=(DefaultTableModel)alertsTable.getModel();
        
        switch(choosenFloor){
            case 0:              
                if(tm1.getRowCount()!=0){
                    int c =tm1.getRowCount();
                    for(int i=0;i<c;i++){
                        tm1.removeRow(0);
                    }
                }
                for(Map.Entry<String,Location> mp : f0.entrySet()){
                    String data[]={mp.getKey(),String.valueOf(mp.getValue().smokeCrValue),String.valueOf(mp.getValue().heatCrValue),String.valueOf(mp.getValue().coCrValue)};
                    tm1.addRow(data);
                }
                for(Map.Entry<String,Location> mp : f0.entrySet()){
                    if(mp.getValue().smokeCrValue>Location.smokeThValue){
                        String d[]={""+dtf.format(LocalTime.now()),"Smoke","Ground",mp.getKey(),"Threshold Breached!"};
                        tm2.addRow(d);
                    }
                    if(mp.getValue().heatCrValue>Location.heatThValue){
                        String d[]={""+dtf.format(LocalTime.now()),"Heat","Ground",mp.getKey(),"Threshold Breached!"};
                        tm2.addRow(d);
                    }
                    if(mp.getValue().coCrValue>Location.coThValue){
                        String d[]={""+dtf.format(LocalTime.now()),"CO","Ground",mp.getKey(),"Threshold Breached!"};
                        tm2.addRow(d);
                    }
                    if(mp.getValue().isManualAlarmTriggered==1){
                        String d[]={""+dtf.format(LocalTime.now()),"Manual CallPoint","Ground",mp.getKey(),"Manual Alarm Triggered!"};
                        tm2.addRow(d);
                    }
                }
                break;
                
             case 1:
                if(tm1.getRowCount()!=0){
                    int c =tm1.getRowCount();
                    for(int i=0;i<c;i++){
                        tm1.removeRow(0);
                    }
                }
                for(Map.Entry<String,Location> mp : f1.entrySet()){
                    String data[]={mp.getKey(),String.valueOf(mp.getValue().smokeCrValue),String.valueOf(mp.getValue().heatCrValue),String.valueOf(mp.getValue().coCrValue)};
                    tm1.addRow(data);
                }
                for(Map.Entry<String,Location> mp : f1.entrySet()){
                    if(mp.getValue().smokeCrValue>Location.smokeThValue){
                        String d[]={""+dtf.format(LocalTime.now()),"Smoke","First",mp.getKey(),"Threshold Breached!"};
                        tm2.addRow(d);
                    }
                    if(mp.getValue().heatCrValue>Location.heatThValue){
                        String d[]={""+dtf.format(LocalTime.now()),"Heat","First",mp.getKey(),"Threshold Breached!"};
                        tm2.addRow(d);
                    }
                    if(mp.getValue().coCrValue>Location.coThValue){
                        String d[]={""+dtf.format(LocalTime.now()),"CO","First",mp.getKey(),"Threshold Breached!"};
                        tm2.addRow(d);
                    }
                    if(mp.getValue().isManualAlarmTriggered==1){
                        String d[]={""+dtf.format(LocalTime.now()),"Manual CallPoint","First",mp.getKey(),"Manual Alarm Triggered!"};
                        tm2.addRow(d);
                    }
                }
                break;
                
            case 2:
                if(tm1.getRowCount()!=0){
                    int c =tm1.getRowCount();
                    for(int i=0;i<c;i++){
                        tm1.removeRow(0);
                    }
                }               
                for(Map.Entry<String,Location> mp : f2.entrySet()){
                    String data[]={mp.getKey(),String.valueOf(mp.getValue().smokeCrValue),String.valueOf(mp.getValue().heatCrValue),String.valueOf(mp.getValue().coCrValue)};
                    tm1.addRow(data);
                }
                for(Map.Entry<String,Location> mp : f2.entrySet()){
                    if(mp.getValue().smokeCrValue>Location.smokeThValue){
                        String d[]={""+dtf.format(LocalTime.now()),"Smoke","Second",mp.getKey(),"Threshold Breached!"};
                        tm2.addRow(d);
                    }
                    if(mp.getValue().heatCrValue>Location.heatThValue){
                        String d[]={""+dtf.format(LocalTime.now()),"Heat","Second",mp.getKey(),"Threshold Breached!"};
                        tm2.addRow(d);
                    }
                    if(mp.getValue().coCrValue>Location.coThValue){
                        String d[]={""+dtf.format(LocalTime.now()),"CO","Second",mp.getKey(),"Threshold Breached!"};
                        tm2.addRow(d);
                    }
                    if(mp.getValue().isManualAlarmTriggered==1){
                        String d[]={""+dtf.format(LocalTime.now()),"Manual Callpoint","Second",mp.getKey(),"Manual Alarm Triggered!"};
                        tm2.addRow(d);
                    }
                }
                break;
                
            case 3:
                if(tm1.getRowCount()!=0){
                    int c =tm1.getRowCount();
                    for(int i=0;i<c;i++){
                        tm1.removeRow(0);
                    }
                }               
                for(Map.Entry<String,Location> mp : f3.entrySet()){
                    String data[]={mp.getKey(),String.valueOf(mp.getValue().smokeCrValue),String.valueOf(mp.getValue().heatCrValue),String.valueOf(mp.getValue().coCrValue)};
                    tm1.addRow(data);
                }
                for(Map.Entry<String,Location> mp : f3.entrySet()){
                    if(mp.getValue().smokeCrValue>Location.smokeThValue){
                        String d[]={""+dtf.format(LocalTime.now()),"Smoke","Third",mp.getKey(),"Threshold Breached!"};
                        tm2.addRow(d);
                    }
                    if(mp.getValue().heatCrValue>Location.heatThValue){
                        String d[]={""+dtf.format(LocalTime.now()),"Heat","Third",mp.getKey(),"Threshold Breached!"};
                        tm2.addRow(d);
                    }
                    if(mp.getValue().coCrValue>Location.coThValue){
                        String d[]={""+dtf.format(LocalTime.now()),"CO","Third",mp.getKey(),"Threshold Breached!"};
                        tm2.addRow(d);
                    }
                    if(mp.getValue().isManualAlarmTriggered==1){
                        String d[]={""+dtf.format(LocalTime.now()),"Manual Callpoint","Third",mp.getKey(),"Manual Alarm Triggered!"};
                        tm2.addRow(d);
                    }
                }
                break;
                
            case 4:
                if(tm1.getRowCount()!=0){
                    int c =tm1.getRowCount();
                    for(int i=0;i<c;i++){
                        tm1.removeRow(0);
                    }
                }               
                for(Map.Entry<String,Location> mp : f4.entrySet()){
                    String data[]={mp.getKey(),String.valueOf(mp.getValue().smokeCrValue),String.valueOf(mp.getValue().heatCrValue),String.valueOf(mp.getValue().coCrValue)};
                    tm1.addRow(data);
                }
                for(Map.Entry<String,Location> mp : f4.entrySet()){
                    if(mp.getValue().smokeCrValue>Location.smokeThValue){
                        String d[]={""+dtf.format(LocalTime.now()),"Smoke","Fourth",mp.getKey(),"Threshold Breached!"};
                        tm2.addRow(d);
                    }
                    if(mp.getValue().heatCrValue>Location.heatThValue){
                        String d[]={""+dtf.format(LocalTime.now()),"Heat","Fourth",mp.getKey(),"Threshold Breached!"};
                        tm2.addRow(d);
                    }
                    if(mp.getValue().coCrValue>Location.coThValue){
                        String d[]={""+dtf.format(LocalTime.now()),"CO","Fourth",mp.getKey(),"Threshold Breached!"};
                        tm2.addRow(d);
                    }
                    if(mp.getValue().isManualAlarmTriggered==1){
                        String d[]={""+dtf.format(LocalTime.now()),"Manual Callpoint","Fourth",mp.getKey(),"Manual Alarm Triggered!"};
                        tm2.addRow(d);
                    }
                }
                break;
                
            case 5:
                if(tm1.getRowCount()!=0){
                    int c =tm1.getRowCount();
                    for(int i=0;i<c;i++){
                        tm1.removeRow(0);
                    }
                }               
                for(Map.Entry<String,Location> mp : f5.entrySet()){
                    String data[]={mp.getKey(),String.valueOf(mp.getValue().smokeCrValue),String.valueOf(mp.getValue().heatCrValue),String.valueOf(mp.getValue().coCrValue)};
                    tm1.addRow(data);
                }
                for(Map.Entry<String,Location> mp : f5.entrySet()){
                    if(mp.getValue().smokeCrValue>Location.smokeThValue){
                        String d[]={""+dtf.format(LocalTime.now()),"Smoke","Fifth",mp.getKey(),"Threshold Breached!"};
                        tm2.addRow(d);
                    }
                    if(mp.getValue().heatCrValue>Location.heatThValue){
                        String d[]={""+dtf.format(LocalTime.now()),"Heat","Fifth",mp.getKey(),"Threshold Breached!"};
                        tm2.addRow(d);
                    }
                    if(mp.getValue().coCrValue>Location.coThValue){
                        String d[]={""+dtf.format(LocalTime.now()),"CO","Fifth",mp.getKey(),"Threshold Breached!"};
                        tm2.addRow(d);
                    }
                    if(mp.getValue().isManualAlarmTriggered==1){
                        String d[]={""+dtf.format(LocalTime.now()),"Manual Callpoint","Fifth",mp.getKey(),"Manual Alarm Triggered!"};
                        tm2.addRow(d);
                    }
                }
                break;
        }
    }   
}
