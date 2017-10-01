package com.trp.mft.trace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class GrandCentralTracerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrandCentralTracerApplication.class, args);
	}
}
