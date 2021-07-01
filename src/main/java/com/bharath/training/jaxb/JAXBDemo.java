package com.bharath.training.jaxb;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

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
			
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Patient patientResult = (Patient)unmarshaller.unmarshal(new StringReader(writer.toString()));
			
			System.out.println(patientResult.getName());
			System.out.println(patientResult.getId());


			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
