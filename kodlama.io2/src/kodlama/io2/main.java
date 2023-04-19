package kodlama.io2;

import java.util.ArrayList;
import java.util.List;

import kodlama.io2.business.categoryManager;
import kodlama.io2.business.courseManager;
import kodlama.io2.business.instructerManager;
import kodlama.io2.core.logging.Logger;
import kodlama.io2.core.logging.dataBaseLogger;
import kodlama.io2.dataAccess.hibernateDao;
import kodlama.io2.entities.category;
import kodlama.io2.entities.course;
import kodlama.io2.entities.instructer;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger[] loggers = {new dataBaseLogger()};
		
		instructer instructer = new instructer("recep",21);
		instructerManager insMnager = new instructerManager(new hibernateDao(),loggers, null);
		insMnager.add(instructer);
		
		List<category> list1 = new ArrayList<category>();
		category categorys = new category(01,"SOFTWARE");
		categoryManager categoryManagers = new categoryManager(new hibernateDao(),loggers,list1);
		categoryManagers.add(categorys);
		
		List<course> course1 = new ArrayList<course>();
		course courses = new course(01,"java",1000);
		courseManager courseManagers = new courseManager(new hibernateDao(),loggers,course1);
		courseManagers.add(courses);
	}

}
