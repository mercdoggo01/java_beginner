package demo;

public class Nurse implements Staff {

	private String position;
	
	// constructor
	public Nurse(String position)
	{
		this.position = position;
	}
	
	// getter
	public String getPosition()
	{
		return position;
	}
	
	// method
	public void assist()
	{
		System.out.println("Nurse is assisting");
	}
	
	
}
