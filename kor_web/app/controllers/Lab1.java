package controllers;

import java.util.Collection;
import java.util.Collections;

import kor.data.KorData;
import play.mvc.Controller;
import play.mvc.Result;
import pl.wcislo.sbql4j.java.model.runtime.Struct;

import views.html.*;
import model.*;

public class Lab1 extends Controller {

	public static Result index() {
		return ok(lab1.render(play.api.templates.HtmlFormat.raw("Wybierz zapytanie z prawego menu.")));
	}

	public static Result query1(Integer indexnum) {
		KorData korData = new KorData();
		Collection<kor.model.Student> data = null;
		try {
			data = korData.query2(indexnum);
			return ok(query1.render(
					"Student where indexnum > " + indexnum.toString(), data));
		} finally {
			korData.shutDown();
		}
	}

	public static Result query2() {
		KorData korData = new KorData();
		Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> data = null;
		try {
			data = korData.query3();
			return ok(query2
					.render("Professor.(sname, fname, title, address.street, address.city, address.zip)",
							data));
		} finally {
			korData.shutDown();
		}
	}

	public static Result query3() {
		KorData korData = new KorData();
		Collection<pl.wcislo.sbql4j.java.model.runtime.Struct> data = null;
		try {
			data = korData.query4();
			return ok(query3
					.render("Student.(sname, fname, address.street, address.city, address.zip, promoter.fname, promoter.sname)",
							data));
		} finally {
			korData.shutDown();
		}
	}

	public static Result query4(String klass) {
		KorData korData = new KorData();
		Collection<Struct> data = null;
		try {
			System.out.println(klass);
			if (klass.equals("")) {
				data = Collections.emptyList();
			} else {
				data = korData.query5(klass);
			}
			return ok(query4.render(
					"Student as s.((s.sname, s.fname) where s.address.city == "
							+ klass + ")", data));
		} finally {
			korData.shutDown();
		}
	}

	public static Result query5() {
		KorData korData = new KorData();
		Collection<Struct> data = null;
		try {
			data = korData.query6();
			return ok(query5
					.render("Student.(sname, fname, address.street, address.city, address.zip) group as studs",
							data));
		} finally {
			korData.shutDown();
		}
	}

	public static Result query6() {
		KorData korData = new KorData();
		Collection<Struct> data = null;
		try {
			data = korData.query7();
			return ok(query6.render(
					"Student.(sname, fname) join Professor.(sname, fname)",
					data));
		} finally {
			korData.shutDown();
		}
	}

}