
/*@author: Aadesh.Khedkar
*/
package com.OrangeHRM.Utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import com.OrangeHRM.Constant.AppConstant;

public class PropertiesReader {


	public static String getValue(String key) throws IOException {
		FileInputStream fis = new FileInputStream(AppConstant.getPropfilepath());
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}

}
