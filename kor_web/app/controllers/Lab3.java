package controllers;

import java.util.Collection;
import java.util.Collections;

import kor.data.KorData;
import play.mvc.Controller;
import play.mvc.Result;
import pl.wcislo.sbql4j.java.model.runtime.Struct;

import views.html.*;

public class Lab3 extends Controller {

	public static Result index() {
		return ok(lab3.render(play.api.templates.HtmlFormat.raw("Wybierz zapytanie z prawego menu.")));
	}

	public static Result query1() {
		KorData korData = new KorData();
		Collection<kor.model.Student> data = null;
		try {
			data = korData.query14();
			return ok(query13.render(
					"(Student as s where s.age == max(Student.age)).(s)", data));
		} finally {
			korData.shutDown();
		}
	}

	public static Result query2() {
		KorData korData = new KorData();
		Collection<kor.model.Student> data = null;
		try {
			data = korData.query15();
			return ok(query14.render(
					"(Student as s where s.age == min(Student.age)).(s)", data));
		} finally {
			korData.shutDown();
		}
	}

	public static Result query3() {
		KorData korData = new KorData();
		Collection<kor.model.Student> data = null;
		try {
			data = korData.query16();
			return ok(query15
					.render("(Student where age == min(Student.age)) union (Student where age == max(Student.age))",
							data));
		} finally {
			korData.shutDown();
		}
	}

	public static Result query4() {
		KorData korData = new KorData();
		Collection<kor.model.Student> data = null;
		try {
			data = korData.query17();
			return ok(query16
					.render("(Student as s where s.classes.shortname in (Class.shortname))",
							data));
		} finally {
			korData.shutDown();
		}
	}

	public static Result query5() {
		KorData korData = new KorData();
		Collection<kor.model.Professor> data = null;
		try {
			data = korData.query18();
			return ok(query17.render(
					"(Professor as p).(p where p.age > avg(Professor.age)",
					data));
		} finally {
			korData.shutDown();
		}
	}

	public static Result query6() {
		KorData korData = new KorData();
		Struct data = null;
		try {
			data = korData.query19();
			return ok(query18
					.render("(sum(Professor.age), sum(Student.age), avg(Professor.pensum), avg(Student.average))",
							data));
		} finally {
			korData.shutDown();
		}
	}

}