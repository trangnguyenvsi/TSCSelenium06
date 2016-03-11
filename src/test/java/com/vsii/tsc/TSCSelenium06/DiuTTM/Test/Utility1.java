package com.vsii.tsc.TSCSelenium06.DiuTTM.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utility1 {
		public static Properties readConfig() throws IOException {
		// Create new properties variable
		Properties p = new Properties();
		// Read object properties file
		InputStream stream = new FileInputStream("C:\\Users\\diuttm\\git\\TSCSelenium06\\src\\main\\java\\com\\vsii\\tsc\\TSCSelenium06\\diuttm\\config.properties");
		// Load input stream file
		p.load(stream);
		return p;
		}
}
