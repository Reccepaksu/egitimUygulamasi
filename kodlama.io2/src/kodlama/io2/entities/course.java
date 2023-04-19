package kodlama.io2.entities;

public class course {

	private int id;
	private String name;
	private int price;
	
	course(){
		
	}
	
	public course(int id,String name,int price){
		
		this.price = price;
		this.id = id;
		this.name = name;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;	
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
