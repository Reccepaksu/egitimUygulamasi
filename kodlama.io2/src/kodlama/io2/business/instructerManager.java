package kodlama.io2.business;

import java.util.List;

import kodlama.io2.core.logging.Logger;
import kodlama.io2.dataAccess.instructerDao;

import kodlama.io2.entities.instructer;

public class instructerManager {

	private instructerDao instructerDao;
	private List<instructer> instructer;
	private Logger[] loggers;
	
	public instructerManager(instructerDao instructerDao,Logger[] loggers,List<instructer> instructers){
		this.instructerDao = instructerDao;
		this.instructer = instructers;
		this.loggers = loggers;
	}
	
	public void add(instructer instructer) {
		for (Logger logger : loggers) {
			logger.log(instructer.getAd());
			
		}
		instructerDao.add(instructer);
		
	}
	
	
	
	
}
