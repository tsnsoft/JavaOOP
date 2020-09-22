package javaoop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class launch {

    public static void main(String[] args) {
        BrickTel nokia3310 = new BrickTel();
//        nokia3310.call("777");
//        nokia3310.sendSMS("777", "Hi, OOP!");
//        nokia3310.takePhoto();
//        
//        System.out.println("");
        
        NormTel xiaomiNote8 =  new NormTel();
//        xiaomiNote8.call("999");
//        xiaomiNote8.sendSMS("999", "Hi, OOP!");
//        xiaomiNote8.takePhoto();
        
        SuperTel xiaomiNote9 =  new SuperTel();

        List<ATelephone> tel = new ArrayList<>();
        tel.add(xiaomiNote8);
        tel.add(xiaomiNote9);
        tel.add(nokia3310);
        
        for (ATelephone t : tel) {
            t.takePhoto();
        }

        System.out.println("");
        
        for (int i = 0; i<tel.size(); i++) {
            tel.get(i).takePhoto();
        }
        
        
    }
    
}
