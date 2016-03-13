package com.vsii.tsc.TSCSelenium06.tranglt.ReadConfig;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utility {
public static Properties readConfig() throws IOException{
	Properties properties=new Properties();
	InputStream stream = new FileInputStream("./properties/config.properties");
	properties.load(stream);
	return properties;
}
}
