package kodlama.io2.business;

import java.util.List;

import kodlama.io2.core.logging.Logger;
import kodlama.io2.dataAccess.courseDao;

import kodlama.io2.entities.course;

public class courseManager {

	private courseDao courseDao;
	private List<course> coursies;
	private Logger[] loggers;
	
	public courseManager(courseDao courseDao,Logger[] loggers,List<course> coursies){
		this.courseDao = courseDao;
		this.coursies = coursies;
		this.loggers = loggers;
	}
	public void add(course course) {
		for(course cours : coursies) {
			if(cours.getName().equals(course)) {
				System.out.println("seçtiğiniz kurs ismi sistemde mevcuttur.");
			}
		}
	courseDao.add(course);
	coursies.add(course);
	for(Logger loggers : loggers) {
		loggers.log(course.getName());
	}
	}
}
