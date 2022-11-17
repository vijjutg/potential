package codes.xworkz.boot;

import codes.xworkz.codingQuestions.BasicOperation;

public class BasicOperationRunner {

	public static void main(String[] args) {
		
		int res = BasicOperation.operation('+',4,7);
        System.out.println(res);
        int res1 = BasicOperation.operation('-',15,18);
        System.out.println(res1);
        int res2 = BasicOperation.operation('*',5,5);
        System.out.println(res2);
        int res3 = BasicOperation.operation('/',49,7);
        System.out.println(res3);
	}

}
