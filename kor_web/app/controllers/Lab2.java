package controllers;

import java.util.Collection;
import java.util.Collections;

import kor.data.KorData;
import play.mvc.Controller;
import play.mvc.Result;
import pl.wcislo.sbql4j.java.model.runtime.Struct;

import views.html.*;

public class Lab2 extends Controller {

	public static Result index() {
		return ok(lab2.render(play.api.templates.HtmlFormat.raw("Wybierz zapytanie z prawego menu.")));
	}

	public static Result query1() {
		KorData korData = new KorData();
		Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> data = null;
		try {
			data = korData.query8();
			return ok(query7
					.render("Student as s.((s.fname, s.sname, s.average) where s.average > 4.5 and s.average < 5 )",
							data));
		} finally {
			korData.shutDown();
		}
	}

	public static Result query2(String tiltle) {
		KorData korData = new KorData();
		Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> data = null;
		try {
			data = korData.query9(tiltle);
			return ok(query8.render("(Professor as p where p.title == \""
					+ tiltle.toString() + "\").(p.fname, p.sname, p.title) ",
					data));
		} finally {
			korData.shutDown();
		}
	}

	public static Result query3() {
		KorData korData = new KorData();
		Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> data = null;
		try {
			data = korData.query10();
			return ok(query9
					.render("(Professor as p where p.married != not true).(p.fname, p.sname, p.married)",
							data));
		} finally {
			korData.shutDown();
		}
	}

	public static Result query4() {
		KorData korData = new KorData();
		Collection<Struct> data = null;
		try {
			data = korData.query11();
			return ok(query10
					.render("Student as s.((s.fname, s.sname, s.average) where s.year != 1 )",
							data));
		} finally {
			korData.shutDown();
		}
	}

	public static Result query5() {
		KorData korData = new KorData();
		Collection<Struct> data = null;
		try {
			data = korData.query12();
			return ok(query11
					.render("(Professor as p where p.pensum+p.age >= 100).(p.fname, p.sname, p.pensum, p.age, p.pensum+p.age)",
							data));
		} finally {
			korData.shutDown();
		}
	}

	public static Result query6(String klass) {
		KorData korData = new KorData();
		Collection<Struct> data = null;
		try {
			data = korData.query13(klass);
			return ok(query12.render("(Class as c where (c.shortname != \""
					+ klass + "\")).(c.shortname, c.name)", data));
		} finally {
			korData.shutDown();
		}
	}

}