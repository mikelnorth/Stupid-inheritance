package stupid;

public class Dumber extends Dumb
{
	private String derf;
	
	public Dumber()
	{
		super(9);
		derf = "juhdjkmdfjkmdjikm";
	}
	
	public String getDerf()
	{
		return derf;
	}
	
	public int getBlerg()
	{
		return super.getBlerg() + 7;
	}
	
}
