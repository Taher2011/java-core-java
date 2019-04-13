package _24propertiesClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Enumeration;

public class _01PropertiesMethod {

	/*
	 * returns value associated with specified property, if specified property
	 * is not available then it returns null.
	 */
	public String getProperty(String pName) {
		return "pValue";
	}

	/*
	 * to set new property, if specified property already available then old
	 * value will be replaced with new value value it returns old value.
	 */
	public String setProperty(String pName, String pValue) {
		return "pValue";
	}

	/*
	 * returns all properties name present in property object.
	 */
	public Enumeration propertyNames() {
		return null;
	}

	/*
	 * to load properties from properties file into java Properties object.
	 */
	public void load(FileInputStream fileInputStream) {

	}

	/*
	 * to store properties from java Properties object into properties file.
	 */
	public void store(FileOutputStream fileOutputStream, String comment) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
