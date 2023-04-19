package kodlama.io2.dataAccess;

import kodlama.io2.entities.category;
import kodlama.io2.entities.course;
import kodlama.io2.entities.instructer;

public class hibernateDao implements categoryDao,instructerDao,courseDao{

	@Override
	public void add(instructer instructer) {
		// TODO Auto-generated method stub
		System.out.println("eğitimci hibernate ile veritabanına eklendi");
	}

	public void add(category category) {
		// TODO Auto-generated method stub
		System.out.println("kategori hibernate ile veritabanına eklendi");
	}

	@Override
	public void add(course course) {
		// TODO Auto-generated method stub
		System.out.println("kurs hibernate ile veritabanına eklendi");
	}

	
}
