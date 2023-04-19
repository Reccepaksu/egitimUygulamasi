package kodlama.io2.entities;

public class category {

	private int id;
	private String name;
	
	category(){
		
	}
	public category(int id,String name){
		this.name = name;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName () {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
