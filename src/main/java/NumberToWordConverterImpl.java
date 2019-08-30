public class NumberToWordConverterImpl implements NumberToWordConverter
{
	
	public static final String[] units = { 
			"" , "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" 
			};
	
	public static final String[] tens = { 
			"", "", "Twenty", "Thirty", "Forty", "Fifty",
			"Sixty", "Seventy", "Eighty", "Ninety"
			}; 
	
	public String convertNumber(int n){
		String returnText = "";
		try {
			if(n > 999999999) {
				returnText = "Please enter a number which is less than 999,999,999";
			} else if(n == 0) {
				returnText = "Zero";
			} else if(n < 0) {
				returnText = "Please enter a valid number";
			} else {
				returnText = convert(n);
			}
		}catch(Exception e) {
			returnText = "Something went wrong please, enter a valid number or try again after sometime";
		}
		return returnText;
	}
	
	public static String convert(int n) throws Exception{
		if(n < 0)
			return "Minus " + convert(-n);
		
		if(n < 20)
			return units[n];
		
		if(n < 100)
			return tens[n/10] + (n%10 != 0 ? " " : "") + units[n%10];
		
		if(n < 1000)
			return units[n/100] + " Hundred" + (n%100 != 0 ? " And " : "") + convert(n%100);
		
		if(n < 1000000)
			return convert(n/1000) + " Thousand" + (n%1000 != 0 ? " " : "") + convert(n%1000);
		
		if(n < 1000000000)
			return convert(n/1000000) + " Million" + (n%1000000 != 0 ? " " : "") + convert(n%1000000);
		
		return convert(n/1000000000) + " Billion" + convert(n%1000000000);
	}
	
}
