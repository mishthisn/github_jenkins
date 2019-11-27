package unix_parse_files;

// Added comment

import java.util.Scanner;

public class calculator_BASIC {
	
	private static final boolean True = false;
	private static final boolean False = false;

	// 3 * 5
	public static void main(String[] args) {
		
		boolean error = False;
		int result = 0;
		
		Scanner sreader = new Scanner(System.in);
		String userStr = sreader.nextLine();
	
		String[] tokens = userStr.split(" ");
		String first_expression = tokens[0];
		String operand = tokens[1];
		String second_expression = tokens[2];
		
		System.err.println(userStr);
		
		if (tokens.length != 3) {
			System.out.print(" Invalid expression: String contains\n" + userStr.length());
			error = True;
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
				error = True;			
		}
		
		if (error == False)
			System.out.print(result);
				
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
