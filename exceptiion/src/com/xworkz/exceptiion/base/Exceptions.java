package com.xworkz.exceptiion.base;

import java.awt.AWTError;
import java.awt.AWTException;
import java.awt.FontFormatException;
import java.awt.color.CMMException;
import java.awt.color.ProfileDataException;
import java.awt.datatransfer.MimeTypeParseException;
import java.awt.geom.IllegalPathStateException;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.image.RasterFormatException;
import java.beans.IntrospectionException;
import java.io.IOError;
import java.io.IOException;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.invoke.WrongMethodTypeException;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.UndeclaredThrowableException;
import java.nio.*;
import java.nio.channels.AlreadyBoundException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.rmi.MarshalException;
import java.rmi.NotBoundException;
import java.security.GeneralSecurityException;
import java.security.ProviderException;
import java.security.cert.CertificateException;
import java.util.*;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.RejectedExecutionException;
import java.util.zip.DataFormatException;

import javax.lang.model.type.MirroredTypesException;
import javax.management.BadAttributeValueExpException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.BadStringOperationException;
import javax.management.InvalidApplicationException;
import javax.management.JMException;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.naming.NamingException;
import javax.print.attribute.UnmodifiableSetException;
import javax.security.auth.DestroyFailedException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.text.BadLocationException;
import javax.swing.tree.ExpandVetoException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.ietf.jgss.GSSException;
import org.w3c.dom.DOMException;
import org.w3c.dom.events.EventException;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class Exceptions {

	public void method1() {
		System.out.println("Running method 1...");
		throw new AnnotationTypeMismatchException(null, null);
	}

	public void method2() {
		System.out.println("Running method 2...");
		throw new ArithmeticException();
	}

	public void method3() {
		System.out.println("Running method 3...");
		throw new ArrayStoreException();
	}

	public void method4() {
		System.out.println("Running method 4...");
		throw new BufferOverflowException();
	}

	public void method5() {
		System.out.println("Running method 5...");
		throw new BufferUnderflowException();
	}

	public void method6() {
		System.out.println("Running method 6...");
		throw new CannotRedoException();
	}

	public void method7() {
		System.out.println("Running method 7...");
		throw new CannotUndoException();
	}

	public void method8() {
		System.out.println("Running method 8...");
		throw new ClassCastException();
	}

	public void method9() {
		System.out.println("Running method 9...");
		throw new CMMException(null);
	}

	public void method10() {
		System.out.println("Running method 10...");
		throw new ConcurrentModificationException();
	}

	public void method11() {
		System.out.println("Running method 11...");
		throw new DOMException((short) 0, null);
	}

	public void method12() {
		System.out.println("Running method 12...");
		throw new EmptyStackException();
	}

	public void method13() {
		System.out.println("Running method 13...");
		throw new EnumConstantNotPresentException(null, null);
	}

	public void method14() {
		System.out.println("Running method 14...");
		throw new EventException((short) 0, null);
	}

	public void method15() {
		System.out.println("Running method 15...");
		throw new FileSystemAlreadyExistsException();
	}

	public void method16() {
		System.out.println("Running method 16...");
		throw new FileSystemNotFoundException();
	}

	public void method17() {
		System.out.println("Running method 17...");
		throw new IllegalArgumentException();
	}

	public void method18() {
		System.out.println("Running method 18...");
		throw new IllegalMonitorStateException();
	}

	public void method19() {
		System.out.println("Running method 19...");
		throw new IllegalPathStateException();
	}

	public void method20() {
		System.out.println("Running method 20...");
		throw new WrongMethodTypeException();
	}

	public void method21() {
		System.out.println("Running method 21...");
		throw new UnsupportedOperationException();
	}

	public void method22() {
		System.out.println("Running method 22...");
		throw new UnmodifiableSetException();
	}

	public void method23() {
		System.out.println("Running method 23...");
		throw new UndeclaredThrowableException(null);
	}

	public void method24() {
		System.out.println("Running method 24...");
		throw new TypeNotPresentException(null, null);
	}

	public void method25() {
		System.out.println("Running method 25...");
		throw new SecurityException();
	}

	public void method26() {
		System.out.println("Running method 26...");
		throw new RejectedExecutionException();
	}

	public void method27() {
		System.out.println("Running method 27...");
		throw new RasterFormatException(null);
	}

	public void method28() {
		System.out.println("Running method 28...");
		throw new ProviderNotFoundException();
	}

	public void method29() {
		System.out.println("Running method 29...");
		throw new ProviderException();
	}

	public void method30() {
		System.out.println("Running method 30...");
		throw new ProfileDataException(null);
	}

	public void method31() {
		System.out.println("Running method 31...");
		throw new NullPointerException();
	}

	public void method32() {
		System.out.println("Running method 32...");
		throw new NoSuchMechanismException();
	}

	public void method33() {
		System.out.println("Running method 33...");
		throw new NoSuchElementException();
	}

	public void method34() {
		System.out.println("Running method 34...");
		throw new MissingResourceException(null, null, null);
	}

	public void method35() {
		System.out.println("Running method 35...");
		throw new MirroredTypesException(null);
	}

	public void cut1() throws BadLocationException {
		System.out.println("Running cut1..");
		throw new BadLocationException(null, 0);
	}

	public void cut2() throws BadBinaryOpValueExpException {
		System.out.println("Running cut2..");
		throw new BadBinaryOpValueExpException(null);
	}

	public void cut3() throws BadAttributeValueExpException {
		System.out.println("Running cut3..");
		throw new BadAttributeValueExpException(null);
	}

	public void cut4() throws AWTException {
		System.out.println("Running cut4..");
		throw new AWTException(null);
	}

	public void cut5() {
		System.out.println("Running cut5..");
		throw new AlreadyBoundException();
	}

	public void cut6() throws DestroyFailedException {
		System.out.println("Running cut6..");
		throw new DestroyFailedException();
	}

	public void cut7() throws DatatypeConfigurationException {
		System.out.println("Running cut7..");
		throw new DatatypeConfigurationException();
	}

	public void cut8() throws DataFormatException {
		System.out.println("Running cut8..");
		throw new DataFormatException();
	}

	public void cut9() throws CloneNotSupportedException {
		System.out.println("Running cut9..");
		throw new CloneNotSupportedException();
	}

	public void cut10() throws CertificateException {
		System.out.println("Running cut10..");
		throw new CertificateException();
	}

	public void cut11() throws BrokenBarrierException {
		System.out.println("Running cut11..");
		throw new BrokenBarrierException();
	}

	public void cut12() throws BadStringOperationException {
		System.out.println("Running cut12..");
		throw new BadStringOperationException(null);
	}

	public void cut13() throws InvalidMidiDataException {
		System.out.println("Running cut13..");
		throw new InvalidMidiDataException();
	}

	public void cut14() throws InvalidApplicationException {
		System.out.println("Running cut14..");
		throw new InvalidApplicationException(null);
	}

	public void cut15() throws IntrospectionException {
		System.out.println("Running cut15..");
		throw new IntrospectionException(null);
	}

	public void cut16() throws InterruptedException {
		System.out.println("Running cut16..");
		throw new InterruptedException();
	}

	public void cut17() throws IllegalClassFormatException {
		System.out.println("Running cut17..");
		throw new IllegalClassFormatException();
	}

	public void cut18() throws GSSException {
		System.out.println("Running cut18..");
		throw new GSSException(0);
	}

	public void cut19() throws GeneralSecurityException {
		System.out.println("Running cut19..");
		throw new GeneralSecurityException();
	}

	public void cut20() throws FontFormatException {
		System.out.println("Running cut20..");
		throw new FontFormatException(null);
	}

	public void cut21() throws ExpandVetoException {
		System.out.println("Running cut21..");
		throw new ExpandVetoException(null);
	}

	public void cut22() throws MarshalException {
		System.out.println("Running cut22..");
		throw new MarshalException(null);
	}

	public void cut23() throws LineUnavailableException {
		System.out.println("Running cut23..");
		throw new LineUnavailableException();
	}

	public void cut24() throws KeySelectorException {
		System.out.println("Running cut24..");
		throw new KeySelectorException();
	}

	public void cut25() throws JMException {
		System.out.println("Running cut25..");
		throw new JMException();
	}

	public void cut26() throws IOException {
		System.out.println("Running cut26..");
		throw new IOException();
	}

	public void cut27() throws InvalidTargetObjectTypeException {
		System.out.println("Running cut27..");
		throw new InvalidTargetObjectTypeException();
	}

	public void cut28() {
		System.out.println("Running cut28..");
		throw new ParseException(null, 0);
	}

	public void cut29() throws NotBoundException {
		System.out.println("Running cut29..");
		throw new NotBoundException();
	}

	public void cut30() throws NoninvertibleTransformException {
		System.out.println("Running cut30..");
		throw new NoninvertibleTransformException(null);
	}

	public void cut31() throws NamingException {
		System.out.println("Running cut31..");
		throw new NamingException();
	}

	public void cut32() throws MimeTypeParseException {
		System.out.println("Running cut32..");
		throw new MimeTypeParseException();
	}

	public void cut33() throws MimeTypeParseException {
		System.out.println("Running cut33..");
		throw new MimeTypeParseException();
	}

	public void cut34() {
		System.out.println("Running cut34..");
		throw new RuntimeException();
	}

	public void cut35() throws ReflectiveOperationException {
		System.out.println("Running cut35..");
		throw new ReflectiveOperationException();
	}

	public void defect1() {
		System.out.println("Running defect1..");
        throw new  AnnotationFormatError(null, null);
	}
	
	public void defect2() {
		System.out.println("Running defect2..");
		throw new AssertionError();
	}
	
	public void defect3() {
		System.out.println("Running defect3..");
		throw new AWTError(null);
	}
	
	public void defect4() {
		System.out.println("Running defect4..");
		throw new  CoderMalfunctionError(null);
	}
	
    public void defect5() {
    	System.out.println("Running defect5...");
    	throw new FactoryConfigurationError();
    }
    
    public void defect6() {
    	System.out.println("Running defect6...");
    	throw new FactoryConfigurationError();
    }
    
    public void defect7() {
    	System.out.println("Running defect7...");
    	throw new  IOError(null);
    }
    
    public void defect8() {
    	System.out.println("Running defect8...");
    	throw new LinkageError();
    }
    
    public void defect9() {
    	System.out.println("Running defect9...");
    	throw new BootstrapMethodError();
    }
    
    public void defect10() {
    	System.out.println("Running defect10...");
    	throw new  ClassCircularityError();
    }
    
    public void defect11() {
    	System.out.println("Running defect11...");
    	throw new  GenericSignatureFormatError();
    }
    
    public void defect12() {
    	System.out.println("Running defect12...");
    	throw new UnsupportedClassVersionError();
    }
    
    public void defect13() {
    	System.out.println("Running defect13...");
    	throw new  ExceptionInInitializerError();
    }
    
    public void defect14() {
    	System.out.println("Running defect14...");
    	throw new AbstractMethodError();
    }
    
    public void defect15() {
    	System.out.println("Running defect15...");
    	throw new IllegalAccessError();
    }
    
    public void defect16() {
    	System.out.println("Running defect16...");
    	throw new  InstantiationError();
    }
    
    public void defect17() {
    	System.out.println("Running defect17...");
    	throw new  NoSuchFieldError();
    }
    
    public void defect18() {
    	System.out.println("Running defect18...");
    	throw new  NoSuchMethodError();
    }
    
    public void defect19() {
    	System.out.println("Running defect19...");
    	throw new IncompatibleClassChangeError();
    }
    
    public void defect20() {
    	System.out.println("Running defect20...");
    	throw new NoClassDefFoundError();
    }
    
    public void defect21( ) {
    	System.out.println("Running defect21...");
    	throw new UnsatisfiedLinkError();
    }
    
    public void defect22( ) {
    	System.out.println("Running defect22...");
    	throw new VerifyError();
    }
    
    public void defect23( ) {
    	System.out.println("Running defect23...");
    	throw new ServiceConfigurationError(null);
    }
    
    public void defect24( ) {
    	System.out.println("Running defect24...");
    	throw new ThreadDeath();
    }
    
    public void defect25( ) {
    	System.out.println("Running defect25...");
    	throw new TransformerFactoryConfigurationError();
    }
    
    public void defect26( ) {
    	System.out.println("Running defect26...");
    	throw new InternalError();
    }
    
    public void defect27( ) {
    	System.out.println("Running defect27...");
    	throw new  OutOfMemoryError();
    }
    
    public void defect28( ) {
    	System.out.println("Running defect28...");
    	throw new  StackOverflowError();
    }
    
    public void defect29( ) {
    	System.out.println("Running defect29...");
    	throw new  UnknownError();
    }
    
    public void defect30( ) {
    	System.out.println("Running defect30...");
    	VirtualMachineError();
    }

	public Exception VirtualMachineError() {
		return null;
	}

}
