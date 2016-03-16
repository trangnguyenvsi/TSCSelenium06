package com.vsii.tsc.TSCSelenium06.DiuTTM.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utility {
public static Properties readConfig() throws IOException{
	Properties properties=new Properties();
	InputStream stream = new FileInputStream("C:\\Users\\diuttm\\workspace\\diuttt\\src\\test\\java\\com\\vsii\\tsc\\TSCSelenium06\\DiuTTM\\DataProvider\\config.properties");
	properties.load(stream);
	return properties;
}
}
