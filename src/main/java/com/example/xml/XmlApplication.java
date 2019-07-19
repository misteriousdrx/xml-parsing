package com.example.xml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
public class XmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlApplication.class, args);
	}


	@Bean
	public void test() throws IOException {

		try {
			String data = "<MENS><ORG-AREA>ORQUESTRAÇÃO</ORG-AREA><CANAL-AREA>CANAL</CANAL-AREA><DADOS-NEGOCIO><DADO-01>Dado 01</DADO-01><DADO-02>Dado 02</DADO-02><DADO-03>Dado 03</DADO-03></DADOS-NEGOCIO></MENS>";

			XmlMapper xmlMapper = new XmlMapper();
			ObjectMapper objectMapper = new ObjectMapper();

			DataResponse dataResponse = xmlMapper.readValue(data, DataResponse.class);
			Dados dados = objectMapper.readValue(dataResponse.getBusinessData(), Dados.class);

			System.out.println(dataResponse);
			System.out.println(dados);

		} catch (Exception e) {
			System.err.println(e.getMessage());

		}


	}

}
