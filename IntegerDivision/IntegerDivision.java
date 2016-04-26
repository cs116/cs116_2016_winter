/* ***************************************************************************
 * filename    : IntegerDivision.java
 * author      : George Corser (gpcorser), cs116, tr
 * description : This program demonstrates the difference between
 *               integer division and real number division
 *                   integer: whole number
 *                   float: real number, 32 bits
 *                   double: real number, 64 bits
 * input       : none 
 * processing  : several print statements
 * output      : Results of division using operands of different data types
 *****************************************************************************/

public class IntegerDivision {

    public static void main(String[] args) {

        // Integer Division
		// in "normal math" (1 / 7) is 0.14285714285, but in java
		// (1 / 7) is zero because both 1 and 7 are integers
		// and integer division ignores fractions, only uses the integer,
		// the number before the decimal point, 0
		// see: http://mathworld.wolfram.com/IntegerDivision.html
		
		System.out.println("integer division : " + (1 / 7));

		// Float Division
		// (1.0f / 7) is 0.14285714285 because 1.0f is a float
		// and the output of an operation (like division)
		// will have the same precision as the highest
		// precision operand in the operation, in this case, float
		
		System.out.println("float division   : " + (1.0f / 7));
		
		// Double Division
		// (1.0 / 7) is 0.14285714285 because 1.0 is a double
		// and the output of an opeation (like division)
		// will have the same precision as the highest
		// precision operand in the operation
		// note: (1.0d / 7) is treated the same as (1.0 / 7)
		
		System.out.println("double division  : " + (1.0 / 7));
		
		// Typecasting
		// to force the output of an operation to have
		// a different precision, use typecasting, as below
		
		System.out.println("int typecasting  : " + (int)((1.0 / 7)));
		
	}
}