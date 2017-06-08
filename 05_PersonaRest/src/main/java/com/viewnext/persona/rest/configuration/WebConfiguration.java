package com.viewnext.persona.rest.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebConfiguration implements WebApplicationInitializer {

	//Una vez que por el echo de tener en el classpath de la aplicacion web
	//spring-web, se consigue ejecutar este m�todo
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		//Crear un contexto de Spring que recoge la configuracion de los bean 
		//de clases anotadas con @Configuration
		AnnotationConfigWebApplicationContext webApplicationContext 
							= new AnnotationConfigWebApplicationContext();

		//Nos piden el nombre del paquete que contendra las clases anotadas 
		//con @Configuration
		webApplicationContext
			.scan(this.getClass().getPackage().getName());

		//Instanciamos el Servlet
		DispatcherServlet dispatcherServlet 
			= new DispatcherServlet(webApplicationContext);
		
		//Registramos el servlet en el contexto web
		Dynamic servlet = servletContext
				.addServlet("DispatcherServlet", dispatcherServlet);
		
		//Asociamos el servlet registrado con un mapping
		servlet.addMapping("/");
		
	}

}
