package controllers;

import java.util.Collection;
import java.util.Collections;

import kor.data.KorData;
import play.mvc.Controller;
import play.mvc.Result;
import pl.wcislo.sbql4j.java.model.runtime.Struct;

import views.html.*;

public class Application extends Controller {

	public static Result index() {
		return ok(index.render());
	}

}