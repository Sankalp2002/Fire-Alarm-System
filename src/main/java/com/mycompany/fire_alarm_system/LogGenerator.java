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
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogGenerator {
    
    LogGenerator() throws InterruptedException {
 
    Logger FireAlarmLogger = Logger.getLogger("FireAlarmLog");

    // Simple file logging Handler.
    FileHandler FileHandler;
		
    try {

            // We are setting handler to true = append data to file
            //C:\\Users\\rajen\\Documents\\NetBeansProjects\\Fire-Alarm-System\\src\\main\\resources\\\\log\\FireAlarm.log
            File f = new File("FireAlarm.log");
            String path = f.getAbsolutePath();
            FileHandler = new FileHandler(path, true);
            FireAlarmLogger.addHandler(FileHandler);

            // Print a brief summary of the LogRecord in a human readable format.
            SimpleFormatter formatter = new SimpleFormatter();	
            FileHandler.setFormatter(formatter);
			
 
 
			// infinite loop
                // Log an INFO message.
        while(true){
            String log = "";
            log += "Floor 0:\n";
            for(Map.Entry<String,Location> mp : f0.entrySet()){
                log += "Location: "+mp.getKey()+": \n";
                log += "CO Sensor " + mp.getValue().Ccvalue + " Heat Sensor " +  mp.getValue().Hcvalue + " Smoke Sensor " +  mp.getValue().Scvalue + "\n";
            }
            log += "Floor 1:\n";
            for(Map.Entry<String,Location> mp : f1.entrySet()){
                log += "Location: "+mp.getKey()+": \n";
                log += "CO Sensor " + mp.getValue().Ccvalue + " Heat Sensor " +  mp.getValue().Hcvalue + " Smoke Sensor " +  mp.getValue().Scvalue + "\n";
            }        
            log += "Floor 2:\n";
            for(Map.Entry<String,Location> mp : f2.entrySet()){
                log += "Location: "+mp.getKey()+": \n";
                log += "CO Sensor " + mp.getValue().Ccvalue + " Heat Sensor " +  mp.getValue().Hcvalue + " Smoke Sensor " +  mp.getValue().Scvalue + "\n";
            }
            log += "Floor 3:\n";
            for(Map.Entry<String,Location> mp : f3.entrySet()){
                log += "Location: "+mp.getKey()+": \n";
                log += "CO Sensor " + mp.getValue().Ccvalue + " Heat Sensor " +  mp.getValue().Hcvalue + " Smoke Sensor " +  mp.getValue().Scvalue + "\n";
            }
            log += "Floor 4:\n";
            for(Map.Entry<String,Location> mp : f4.entrySet()){
                log += "Location: "+mp.getKey()+": \n";
                log += "CO Sensor " + mp.getValue().Ccvalue + " Heat Sensor " +  mp.getValue().Hcvalue + " Smoke Sensor " +  mp.getValue().Scvalue + "\n";
            }
            log += "Floor 5:\n";
            for(Map.Entry<String,Location> mp : f5.entrySet()){
                log += "Location: "+mp.getKey()+": \n";
                log += "CO Sensor " + mp.getValue().Ccvalue + " Heat Sensor " +  mp.getValue().Hcvalue + " Smoke Sensor " +  mp.getValue().Scvalue + "\n";
            }
                                
            FireAlarmLogger.info(log);
            Thread.sleep(1000*Location.log);
    }
       
        } catch (SecurityException e) {
                e.printStackTrace();
        } catch (IOException e) {
                e.printStackTrace();
        
        }
 
	}
    
}