/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fire_alarm_system;
import java.text.DecimalFormat;
import java.util.Random ;
/**
 *
 * @author sahil
 */
public class RandomGenerator {
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static float RandomGenerator(float Min, float Max)
    {  
        Random rand ;
        rand = new Random();
        float RandNum =  Min + rand.nextFloat()*(Max-Min);
        return Float.parseFloat(df.format(RandNum)) ;
    } 
    
    
}
