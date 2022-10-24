package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//This class is only 1 time we are creating in utilities package
//you will just call getProperty method with this class name
//
public class ConfigurationReader {

    //1-Create the object of properties class
    //We need properties class to use methods coming from class like load(),getProperty("key")
    //it is static because we using it in static method
    //It is private because I will be using only in this class
    private static Properties properties = new Properties();

    //We want to open the properties file and load to properties object ONLY ONCE before reading
    //having static block because static runs first
    static {
        try {


            //2-Creat the object of FileInputStream
            //We need this object to open file as a stream in java memory
            FileInputStream file = new FileInputStream("configuration.properties");


            //3- Load the properties object using FileInputStream object
            //Load"properties" object with the "file" we opened using FileInputStream
            properties.load(file);

            //close the file after loading
            //if we do not close the file,it will take space from computer memory like Scanner
            file.close();

        } catch (IOException e){

        }
    }

    /**
     * This method is used to read value from a configuration
     * @param keyword
     * @return
     */
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
