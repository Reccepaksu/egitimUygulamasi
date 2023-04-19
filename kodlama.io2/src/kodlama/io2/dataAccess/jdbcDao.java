package kodlama.io2.dataAccess;

import kodlama.io2.entities.category;
import kodlama.io2.entities.course;
import kodlama.io2.entities.instructer;

public class jdbcDao implements categoryDao,instructerDao,courseDao {

	@Override
	public void add(course course) {
		// TODO Auto-generated method stub
		System.out.println("kurs jdbc ile veritabanına eklendi");
	}

	@Override
	public void add(instructer instructer) {
		// TODO Auto-generated method stub
		System.out.println("eğitmen jdbc ile veritabanına eklendi");
	}

	public void add(category category) {
		System.out.println("kategori jdbc ile veritabanına eklendi");
	}

}
