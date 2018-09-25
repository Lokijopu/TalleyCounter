/**
 * 
 * @author Kevin Guo
 *Period 6
 */
public class TalleyCounterTest {

	public static void main(String[] args) {
		
		int a = 42;
		TalleyCounter recorder = new TalleyCounter(a);
		System.out.println("Our initial tally counter currently has " + a + " clicks.");
		recorder.click();
		System.out.println("Click! Our current tally is now at " + recorder.getCount() + " clicks.");
		recorder.unClick();
		System.out.println("I unclicked, which brings us to " + recorder.getCount() + " clicks.");
		recorder.reset();
		System.out.println("Now I have reset the count, which brings us to " + recorder.getCount() + " clicks.");
		

	}

}
