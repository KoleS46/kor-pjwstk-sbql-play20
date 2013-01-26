package kor.data;

import com.db4o.*;
import kor.model.Class;
import kor.model.Professor;
import kor.model.Student;
import pl.wcislo.sbql4j.java.model.runtime.*;
import pl.wcislo.sbql4j.java.model.runtime.Struct;
import java.util.*;

public class KorData {
    private ObjectContainer db;
    private KorPrepareData data;
    
    public static void main(String[] args) {
        new KorData();
    }
    
    public KorData() {
        super();
        getConnection();
        prepareData();
    }
    
    public ObjectContainer getConnection() {
        if (db == null) {
            this.db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "korData.db");
        }
        return db;
    }
    
    public KorPrepareData getData() {
        if (data == null) {
            data = new KorPrepareData();
        }
        return data;
    }
    
    private void prepareData() {
        ObjectContainer con = getConnection();
        KorPrepareData data = getData();
        ObjectSet<Professor> emp = con.query(Professor.class);
        if (emp.isEmpty()) {
            for (Professor e : data.getProfessors()) {
                con.store(e);
            }
        }
        ObjectSet<Class> depts1 = con.query(Class.class);
        if (depts1.isEmpty()) {
            for (Class d : data.getClasses()) {
                con.store(d);
            }
        }
        ObjectSet<Student> depts = con.query(Student.class);
        if (depts.isEmpty()) {
            for (Student d : data.getStudents()) {
                con.store(d);
            }
        }
        con.commit();
    }
    
    public void prepare() {
        prepareData();
    }
    
    public void shutDown() {
        getConnection().close();
    }
    
    public Collection<Struct> query1(String name) {
        Collection<Struct> deptAvgSal = new KorData_SbqlQuery0(db,name).executeQuery();
        return deptAvgSal;
    }
    
    public Collection<Student> query2(Integer indexn) {
        Collection<Student> deptAvgSal = new KorData_SbqlQuery1(db,indexn).executeQuery();
        return deptAvgSal;
    }
    
    public Collection<Struct> query3() {
        Collection<Struct> deptAvgSal = new KorData_SbqlQuery2(db).executeQuery();
        return deptAvgSal;
    }
    
    public Collection<Struct> query4() {
        Collection<Struct> deptAvgSal = new KorData_SbqlQuery3(db).executeQuery();
        return deptAvgSal;
    }
    
    public Collection<Struct> query5(String city) {
        Collection<Struct> deptAvgSal = new KorData_SbqlQuery4(db,city).executeQuery();
        return deptAvgSal;
    }
    
    public Collection<Struct> query6() {
        Collection<Struct> deptAvgSal = new KorData_SbqlQuery5(db).executeQuery();
        return deptAvgSal;
    }
    
    public Collection<Struct> query7() {
        Collection<Struct> deptAvgSal = new KorData_SbqlQuery6(db).executeQuery();
        return deptAvgSal;
    }
    
    public Collection<Struct> query8() {
        Collection<Struct> deptAvgSal = new KorData_SbqlQuery7(db).executeQuery();
        return deptAvgSal;
    }
    
    public Collection<Struct> query9(String tite) {
        Collection<Struct> deptAvgSal = new KorData_SbqlQuery8(db,tite).executeQuery();
        return deptAvgSal;
    }
    
    public Collection<Struct> query10() {
        Collection<Struct> deptAvgSal = new KorData_SbqlQuery9(db).executeQuery();
        return deptAvgSal;
    }
    
    public Collection<Struct> query11() {
        Collection<Struct> deptAvgSal = new KorData_SbqlQuery10(db).executeQuery();
        return deptAvgSal;
    }
    
    public Collection<Struct> query12() {
        Collection<Struct> deptAvgSal = new KorData_SbqlQuery11(db).executeQuery();
        return deptAvgSal;
    }
    
    public Collection<Struct> query13(String klass) {
        Collection<Struct> deptAvgSal = new KorData_SbqlQuery12(db,klass).executeQuery();
        return deptAvgSal;
    }
    
    public Collection<Student> query14() {
        Collection<Student> deptAvgSal = new KorData_SbqlQuery13(db).executeQuery();
        return deptAvgSal;
    }
    
    public Collection<Student> query15() {
        Collection<Student> deptAvgSal = new KorData_SbqlQuery14(db).executeQuery();
        return deptAvgSal;
    }
    
    public Collection<Student> query16() {
        Collection<Student> deptAvgSal = new KorData_SbqlQuery15(db).executeQuery();
        return deptAvgSal;
    }
    
    public Collection<Student> query17() {
        Collection<Student> deptAvgSal = new KorData_SbqlQuery16(db).executeQuery();
        return deptAvgSal;
    }
    
    public Collection<Professor> query18() {
        Collection<Professor> deptAvgSal = new KorData_SbqlQuery17(db).executeQuery();
        return deptAvgSal;
    }
    
    public Struct query19() {
        Struct deptAvgSal = new KorData_SbqlQuery18(db).executeQuery();
        return deptAvgSal;
    }
    
    public Collection<Professor> query20() {
        Collection<Professor> deptAvgSal = new KorData_SbqlQuery19(db).executeQuery();
        return deptAvgSal;
    }
    
    public Boolean query21() {
        Boolean deptAvgSal = new KorData_SbqlQuery20(db).executeQuery();
        return deptAvgSal;
    }
    
    public Collection<Student> query22() {
        Collection<Student> deptAvgSal = new KorData_SbqlQuery21(db).executeQuery();
        return deptAvgSal;
    }
}