/**
 * 
 * @author Kevin Guo
 * Period 6
 */
public class TalleyCounter {
	
	private int count; // fields

	
	public TalleyCounter() // constructor
	{
		count = 0;
	}
	
	public TalleyCounter(int a) // same name
	{
		count = a;
	}

	
	public void click() //method
	{
		count++; //count = count + 1 also suffices
				 //count+=1
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void reset()
	{
		count = 0;
	} 
	
	public void unClick()
	{
		count--;
	}
	
	



}
