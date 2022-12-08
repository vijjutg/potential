package com.xworkz.exceptiion.base;

import java.util.zip.DataFormatException;

public class EventCreator {

	public void method1() throws DataFormatException {
      method2();
	}

	public void method2() throws DataFormatException {
      method3();
	}

	public void method3() throws DataFormatException {
      method4();
	}

	public void method4() throws DataFormatException {
       method5();
	}

	public void method5() throws DataFormatException {
      throw new DataFormatException();
	}
	
	public EventCreator() {
		System.out.println("Running const..");
	}
	
	 EventCreator(String message) {
			System.out.println("Running const with string param..");
		}
	 
	 EventCreator(String message, Throwable cause) {
		 System.out.println("Running const3..");
	 }
	 
	 EventCreator (String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		 System.out.println("Running const4...");
	 }
	 
	 EventCreator(Throwable cause) {
		 System.out.println("Running const5...");
	 }
	 

}
