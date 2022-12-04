package com.xworkz.multipleInheritance.boot;

import com.xworkz.multipleInheritance.bridge.Institute;
import com.xworkz.multipleInheritance.follower.Xworkz;
import com.xworkz.multipleInheritance.subclass.DevelopmentInstitute;
import com.xworkz.multipleInheritance.subclass.TestingInstitute;

public class XworkzRajajinagara extends Xworkz{

	public static void main(String[] args) throws InterruptedException {
		
		Object obj = new XworkzRajajinagara();
		
		obj.equals(obj);
		obj.getClass();
		obj.hashCode();
		obj.notify();
		obj.notifyAll();
		obj.toString();
		obj.wait();
		obj.wait(0);
		obj.wait(0, 0);
		
		Institute institute = new XworkzRajajinagara();
		
		institute.equals(obj);
		institute.getClass();
		institute.hashCode();
		institute.notify();
		institute.notifyAll();
		institute.placements();
		institute.toString();
		institute.training();
		institute.wait();
		institute.wait(0);
		institute.wait(0, 0);
		
		Xworkz xworkz = new XworkzRajajinagara();
		
		xworkz.equals(obj);
		xworkz.getClass();
		xworkz.hashCode();
		xworkz.interviews();
		xworkz.notify();
		xworkz.notifyAll();
		xworkz.placements();
		xworkz.toString();
		xworkz.training();
		xworkz.wait();
		xworkz.wait(0);
		xworkz.wait(0, 0);
		
		DevelopmentInstitute develop = new XworkzRajajinagara();
		
		develop.equals(obj);
		develop.getClass();
		develop.hashCode();
		develop.interviews();
		develop.notify();
		develop.notifyAll();
		develop.placements();
		develop.toString();
		develop.training();
		develop.wait();
		develop.wait(0);
		develop.wait(0, 0);
		
		TestingInstitute test = new XworkzRajajinagara();
		
		test.equals(obj);
		test.getClass();
		test.hashCode();
		test.interviews();
		test.notify();
		test.notifyAll();
		test.placements();
		test.toString();
		test.training();
		test.wait();
		test.wait(0);
		test.wait(0, 0);
		
		XworkzRajajinagara rajaji = new XworkzRajajinagara();
		
		rajaji.equals(obj);
		rajaji.getClass();
		rajaji.hashCode();
		rajaji.interviews();
		rajaji.notify();
		rajaji.notifyAll();
		rajaji.placements();
		rajaji.toString();
		rajaji.training();
		rajaji.wait();
		rajaji.wait(0);
		rajaji.main(args);
		rajaji.wait(0, 0);
	}

}
