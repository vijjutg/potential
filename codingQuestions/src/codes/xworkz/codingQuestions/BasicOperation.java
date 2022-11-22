//Your task is to create a function that does four basic mathematical operations. The function should take three arguments - operation(String / char),
//value1 (number), value2 (number). The function should return result of numbers after applying chosen operation.

package codes.xworkz.codingQuestions;

public final class BasicOperation {
	
	public static int operation(char operator,int value1, int value2)
	{
		if(operator=='+')
		{
			return value1+value2;
		}
		if(operator == '-')
		{
			return value1-value2;
		}
		if(operator == '*')
		{
			return value1*value2;
		}
		if (operator == '/')
		{
			return value1/value2;
		}
		return 0;
	}

}
