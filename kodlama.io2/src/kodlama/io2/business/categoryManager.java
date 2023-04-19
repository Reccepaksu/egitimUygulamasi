package kodlama.io2.business;

import java.util.List;

import kodlama.io2.core.logging.Logger;
import kodlama.io2.dataAccess.categoryDao;
import kodlama.io2.entities.category;

public class categoryManager {

	private categoryDao categoryDao;
	private List<category> categories;
	private Logger[] loggers;
	
	public categoryManager(categoryDao categoryDao,Logger[] loggers,List<category> categories) {
		this.categoryDao = categoryDao;
		this.categories = categories;
		this.loggers = loggers;
	}
	
	public void add(category category) {
		for(category categories1 : categories) {
			if(categories1.getName().equals(categories1.getName())) {
				System.out.println("girdiğiniz kadegori ismi kullanılıyor.");
			}
			
		}
		categoryDao.add(category);
		categories.add(category);
		for(Logger loggers : loggers) {
			loggers.log(category.getName());
		}
	}
}

