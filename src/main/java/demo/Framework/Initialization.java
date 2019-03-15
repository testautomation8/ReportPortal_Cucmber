package demo.Framework;

import java.io.FileInputStream;
import java.util.Properties;

public class Initialization {

    Properties pro;

    //Constructor
    public Initialization(){

        try {

            FileInputStream fis = new FileInputStream("./Config_and_Environment/config.properties");
            pro = new Properties();
            pro.load(fis);
        } catch (Exception e) {

            System.out.println("Not able to load Config File" + e.getMessage());
        }

    }

    //Method to return value of specified Property
    public String getPropValue(String propertyName){

        return pro.getProperty(propertyName);

    }

    //Method for Excel file
    //Method for JSON file

}
