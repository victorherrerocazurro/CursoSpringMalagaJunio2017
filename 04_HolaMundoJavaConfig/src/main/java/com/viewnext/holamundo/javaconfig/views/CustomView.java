package com.viewnext.holamundo.javaconfig.views;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

/**
 * 
 * View que permite renderizar el contenido en text/html o text/plain, 
 * en cualquier otro caso se lanzar� una excepcion 
 * 
 * Se necesita establecer en el modelo, el parametro nombre.
 * 
 * @author alumno
 *
 */
@Component
public class CustomView implements View {
	
	@Autowired
	public CustomView(@Qualifier("contentTypeHtml") String contentType) {
		super();
		this.contentType = contentType;
	}

	private String contentType; 
	
	@Override
	public String getContentType() {
		return contentType;
	}

	@Override
	public void render(Map<String, ?> model, 
			HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		switch (contentType) {
		case "text/html":
			response.getWriter().println("<div>" + model.get("nombre") + "</div>");
			break;
		case "text/plain":
			response.getWriter().println(model.get("nombre"));
			break;
		default:
			throw new Exception("ContentType no soportado");
		}
	}

}
