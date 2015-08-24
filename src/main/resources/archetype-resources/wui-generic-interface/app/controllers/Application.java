#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
	public static final String APP_NAME = Play.application().configuration().getString("app.name");
	public static final String APP_VERSION = Play.application().configuration().getString("app.version");

	public static final String TITLE = APP_NAME.toUpperCase();
	public static final String SUB_TITLE = "A web interface to present what you want";
	
    public static Result index() {
        return ok(views.html.index.render(TITLE, SUB_TITLE, APP_NAME, APP_VERSION, "home"));
    }
    public static Result about() {
        return ok(views.html.about.render(TITLE, SUB_TITLE, APP_NAME, APP_VERSION, "about"));
    }
    
    public static Result theme() {
        return ok(views.html.theme.render(TITLE, "Bootswatch them preview", APP_NAME, APP_VERSION, "preview"));
    }
  
}
