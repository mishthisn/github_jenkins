package unix_parse_files;

// Modified comment

import java.util.Scanner;

public class calculator_BASIC {
	
	public static int evaluate(String expression) {
		
		boolean error = false;
		int result = 0;
	
		String[] tokens = expression.split(" ");
		String first_expression = tokens[0];
		String operand = tokens[1];
		String second_expression = tokens[2];
		
		System.err.println(expression);
		
		if (tokens.length != 3) {
			System.out.print(" Invalid expression: String contains\n" + expression.length());
			error = true;
		}
		
		if (error == false) {
			if (operand.equals("+"))
				result = Integer.parseInt(first_expression) + Integer.parseInt(second_expression);
			else if(operand.equals("-"))
				result = Integer.parseInt(first_expression) - Integer.parseInt(second_expression);
			else if(operand.equals("*"))
				result = Integer.parseInt(first_expression) * Integer.parseInt(second_expression);
			else if(operand.equals("/"))
				result = Integer.parseInt(first_expression) / Integer.parseInt(second_expression);
			else 
				error = true;			
		}
		
		if (error == true)
			throw new IllegalArgumentException(expression);
		else {
			return result;
		}
				
	} // main()

	// 3 * 5
	public static void main(String[] args) {
		
		int result = 0;
		
		Scanner sreader = new Scanner(System.in);
		String userStr = sreader.nextLine();
	
		result = calculator_BASIC.evaluate(userStr);
		System.out.println(result);
				
	} // main()
	
}

/*

# E.g 3 + 5
s = input("Enter Expression: ")

# split on space
tokens = s.split(" ")

if len(tokens) != 3:
    print("Incorrect expression, contains {0}".format(len(tokens)))
else:
    error = False

    first_operand = 0
    operator = ''
    second_operand = 0

    try:
        first_operand = int(tokens[0])
        operator = tokens[1]
        second_operand = int(tokens[2])
    except ValueError:
        print("Invalid operands {0} {1}".format(tokens[0], tokens[2]))
        error = True

    if error is False:
        if operator == "+":
            result = first_operand + second_operand
        elif operator == "-":
            result = first_operand - second_operand
        elif operator == "*":
            result = first_operand * second_operand
        elif operator == "/":
            result = first_operand / second_operand
        else:
            print("Invalid operator {0}".format(operator))
            error = True

    if error is False:
        print(result)
*/
