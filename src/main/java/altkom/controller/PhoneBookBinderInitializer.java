package altkom.controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;


public class PhoneBookBinderInitializer
		implements WebBindingInitializer {

	@Override
	public void initBinder( WebDataBinder binder, WebRequest request ) {
                System.out.println("*********jade");
		binder.registerCustomEditor( String.class, new StringTrimmerEditor( false ) );
	}

}
