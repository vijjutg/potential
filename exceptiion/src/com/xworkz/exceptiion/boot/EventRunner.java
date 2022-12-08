package com.xworkz.exceptiion.boot;

import java.util.zip.DataFormatException;

import com.xworkz.exceptiion.base.EventCreator;

public class EventRunner {

	public static void main(String[] args)   {
        
		EventCreator create = new EventCreator();
		try {
			System.out.println("Before Event creator.");
		    create.method1();
		    System.out.println("After Event creator.");
		}
		catch(DataFormatException except) {
			System.out.println("Running catch block..");
			
			except.addSuppressed(except);
			except.equals(except);
			except.fillInStackTrace();
			except.getCause();
			except.getClass();
			except.getLocalizedMessage();
			except.getMessage();
			except.getStackTrace();
			except.getSuppressed();
			except.hashCode();
			except.initCause(except);
			except.notify();
			except.notifyAll();
			except.printStackTrace();
			except.setStackTrace(null);
			except.toString();
			try {
			except.wait();
			except.wait(0);
			except.wait(0, 0);
			}
			catch(InterruptedException inter) {
				System.out.println("Handled exception..");
			}
			
		}
		finally {
			System.out.println("Program completed...");
		}
	}

}
