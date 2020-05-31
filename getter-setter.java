package john.com;

public class GetterSetter {
	private String name; 
	private int age; 
	
	public void setName (String pizza ) {
		this.name = pizza; 
	}
	
	public String getName(){
		return name; 
	}
	
	public static void main(String[] args) {
		GetterSetter gs = new GetterSetter(); 
		
		gs.setName("John");
		System.out.println(gs.getName());
	}
}
