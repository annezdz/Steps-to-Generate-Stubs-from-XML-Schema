package com.bharath.training.jaxb;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.bharatthippireddy.patient.Patient;

public class JAXBDemo {

	public static void main(String[] args) {
		
		try {
			JAXBContext context = JAXBContext.newInstance(Patient.class);
			Marshaller marshaler = context.createMarshaller();
			
			Patient patient = new Patient();
			patient.setId(123);
			patient.setName("Anne");
			
			StringWriter writer = new StringWriter();
			marshaler.marshal(patient, writer);
			
			System.out.println(writer.toString());
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
