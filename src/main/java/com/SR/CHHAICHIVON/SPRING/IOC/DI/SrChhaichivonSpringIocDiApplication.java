package com.SR.CHHAICHIVON.SPRING.IOC.DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(value={"com.SR.CHHAICHIVON.SPRING.IOC.DI.controller","com.SR.CHHAICHIVON.SPRING.IOC.DI.controller","com.SR.CHHAICHIVON.SPRING.IOC.DI.configure"})
public class SrChhaichivonSpringIocDiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrChhaichivonSpringIocDiApplication.class, args);
	}
}
