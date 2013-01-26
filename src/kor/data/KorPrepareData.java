package kor.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import kor.model.Address;
import kor.model.Class;
import kor.model.Professor;
import kor.model.Student;

import com.google.common.base.Splitter;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;

public class KorPrepareData {

	private List<Class> classes;
	private List<Professor> professors;
	private List<Student> students;
	
	public List<Class> getClasses() {
		if(this.classes == null){
			this.initData();
		}
		return classes;
	}
	public List<Professor> getProfessors() {
		if(this.professors == null){
			this.initData();
		}
		return professors;
	}
	public List<Student> getStudents() {
		if(this.students == null){
			this.initData();
		}
		return students;
	}

	private void initData(){
		classes = new ArrayList<Class>();
		professors = new ArrayList<Professor>();
		students = new ArrayList<Student>();
		List<String> cities = this.readFile("./data/cities.txt");
		List<String> fnames = this.readFile("./data/fNames.txt");
		List<String> snames = this.readFile("./data/sNames.txt");
		List<String> classe = this.readFile("./data/classes.txt");
		List<String> street = this.readFile("./data/streets.txt");
		List<String> titles = new ArrayList<String>();
		titles.add("dr");
		titles.add("mgr");
		titles.add("prof");
		
		Random rand = new Random(); 
		for(Integer i: Range.openClosed(0, 100).asSet(DiscreteDomain.integers())){
			Professor p = new Professor(this.randomString(fnames),
					this.randomString(snames), (i%3==0), (i < 30 ? i+30 : (i > 65 ? i-30 : i)),
					new Address(randomString(cities), randomString(street),
					this.randomZip(), rand.nextInt(100)),
					this.randomString(titles), rand.nextInt(200));
			this.professors.add(p);
		}
		
		for(String c: classe){
			List<String> splited = Lists.newArrayList(Splitter.on("|").trimResults().split(c));
			Class cc = new Class(splited.get(0), splited.get(1),
					(Professor) this.randomItem(this.professors));
			this.classes.add(cc);
		}
		
		for(Integer i: Range.openClosed(0, 100).asSet(DiscreteDomain.integers())){
			List<Class> cls = new ArrayList<Class>();
			cls.add((Class) randomItem(this.classes));
			cls.add((Class) randomItem(this.classes));
			cls.add((Class) randomItem(this.classes));
			Student p = new Student(this.randomString(fnames),
					this.randomString(snames), (i%3==0), (i < 20 ? i+15 : (i > 65 ? i-45 : i)),
					new Address(randomString(cities), randomString(street),
					this.randomZip(), rand.nextInt(100)+i),
					rand.nextInt(100)*100+i, new Date(), new Date(), rand.nextDouble()+4.0,
					(Professor) this.randomItem(this.professors), (i%5)+1, cls);
//					(Professor) this.randomItem(this.professors), (i%5)+1, cls.get(i%3) );
			this.students.add(p);
		}
		
	}
	
	private Object randomItem(List<?> list){
		Random rand = new Random();
		Integer index = rand.nextInt(list.size());
		return list.get(index);	
	}
		
	private String randomString(List<String> list){
		Random rand = new Random();
		Integer index = rand.nextInt(list.size());
		return list.get(index);
	}
	
	private List<String> readFile(String filename)
	{
		List<String> records = new ArrayList<String>();
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = reader.readLine()) != null)
			{
				records.add(line);
			}
			reader.close();
			return records;
		}
		catch (Exception e)
		{
			System.err.format("Exception occurred trying to read '%s'.", filename);
			e.printStackTrace();
			return null;
		}
	}
	
	private String randomZip(){
		Random rand = new Random();
		Integer first = rand.nextInt(99);
		return (first < 9 ? first+10 : first ) + "-" + (rand.nextInt(899)+100);
	}
}
