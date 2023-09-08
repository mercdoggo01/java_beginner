package demo;

public class Doctor implements Staff {

	private String qualification;
	
	// getter
	public String getQualification()
	{
		return qualification;
	}
	
	// setter
	public void setQualification(String qualification)
	{
		this.qualification = qualification;
	}
	
	// method
	public void assist()
	{
		System.out.println("Doctor is assisting");
	}
	
}
