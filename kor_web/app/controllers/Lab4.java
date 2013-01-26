package controllers;

import java.util.Collection;
import java.util.Collections;

import kor.data.KorData;
import play.mvc.Controller;
import play.mvc.Result;
import pl.wcislo.sbql4j.java.model.runtime.Struct;

import views.html.*;

public class Lab4 extends Controller {

	public static Result index() {
		return ok(lab4.render(play.api.templates.HtmlFormat.raw("Wybierz zapytanie z prawego menu.")));
	}

	public static Result query1() {
		KorData korData = new KorData();
		Collection<kor.model.Professor> data = null;
		try {
			data = korData.query20();
			return ok(query19.render(
					"(Professor as p order by p.address.city asc)", data));
		} finally {
			korData.shutDown();
		}
	}

	public static Result query2() {
		KorData korData = new KorData();
		Boolean data = null;
		try {
			data = korData.query21();
			return ok(query20.render(
					"all Professor married", data));
		} finally {
			korData.shutDown();
		}
	}

	public static Result query3() {
		KorData korData = new KorData();
		Collection<kor.model.Student> data = null;
		try {
			data = korData.query22();
			return ok(query21
					.render("Student as s where s.promoter.married == (not any Student married)",
							data));
		} finally {
			korData.shutDown();
		}
	}

}