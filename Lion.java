import java.awt.Color;

public class Lion extends Cat
{
	private Color mane;
	
	public Color getManeColor()
	{
		return mane;
	}
	
	public void setManeColor(Color m)
	{
		mane = m;
	}
	
	public void roar()
	{	
		System.out.println(getName() + " just roared");
	}
}
