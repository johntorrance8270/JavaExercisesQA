
public class Main 
{
	public static void main(String[] args) 
	{
		//String outputMessage = "Hello World!";
		//printStringMessage(outputMessage);
		
		//System.out.println(outputMessage());
		
		//boolean shouldAdd = true;
		//int total = addOrMultiply(1,2, shouldAdd);
		//System.out.println(total);
		
		//iterationExample();
		//arrayExample();
		
		//iterationWithArray();
		secondIterationWithArray();
	}
	
	private static void secondIterationWithArray()
	{
		int numberofIterationValues = 10;
		int[] iterationValues = new int[numberofIterationValues];
		
		for(int i=0; i < numberofIterationValues; i++)
		{
			iterationValues[i] = i + 2;
			System.out.println(iterationValues[i]);
		}
		
		for(int i=0; i < numberofIterationValues; i++)
		{
			iterationValues[i] *= 10;
			System.out.println(iterationValues[i]);
		}
	}
	
	private static void iterationWithArray()
	{
		int[] iterationValues = {4,5,6,8,1,2,0,7,6,10};
		
		for(int i=0; i < 10; i++)
		{
			System.out.println(iterationValues[i]);
		}
	}
	
	private static void arrayExample()
	{
		int[] iterationValues = {4,5,6,8,1,2,0,7,6,10};
		
		boolean shouldAdd = false;
		int total = addOrMultiply(iterationValues[0],iterationValues[9], shouldAdd);
		System.out.println(total);
	}
	
	private static void iterationExample()
	{
		boolean shouldAdd = true;
		for(int i=0; i < 10; i++)
		{
			int total = addOrMultiply(i,2, shouldAdd);
			System.out.println(total);
		}
	}
	
	private static void printStringMessage(String message)
	{
		System.out.println(message);
	}
	
	private static String outputMessage()
	{
		return "Hello World!";
	}
	
	private static int addOrMultiply(int firstNumber, int secondNumber, boolean add)
	{
		if(firstNumber == 0)
		{
			return secondNumber;
		}
		else if (secondNumber == 0)
		{
			return firstNumber;
		}
		else if(add)
		{
			return firstNumber + secondNumber;
		}
		else
		{
			return firstNumber * secondNumber;
		}
	}
}
