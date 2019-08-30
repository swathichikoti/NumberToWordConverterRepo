import static org.junit.Assert.*;  
import org.junit.Test;

public class NumberToWordConverterTest {
	
	@Test
	public void testFindMax(){
		NumberToWordConverter obj = new NumberToWordConverterImpl();
		assertEquals("One", obj.convertNumber(1)); 
		assertEquals("Twenty One", obj.convertNumber(21));
		assertEquals("One Hundred And Five", obj.convertNumber(105));
		assertEquals("Fifty Six Million Nine Hundred And Forty Five Thousand Seven Hundred And Eighty One", obj.convertNumber(56945781));
	}
	 
}
