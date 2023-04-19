package kodlama.io2.core.logging;

import kodlama.io2.entities.category;
import kodlama.io2.entities.course;
import kodlama.io2.entities.instructer;

public class dataBaseLogger implements Logger {

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println(data +" veritabanına loglandı.");
	}

}
