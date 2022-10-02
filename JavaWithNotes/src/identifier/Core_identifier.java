package identifier;

/*
 *  Identifier : Name in java program is know as identifier, it can be name of class, variable, methods..
 *  
 *  rules of identifier:
 *  
 *  1. it can consists of alphabets both case, i.e upper case and lower case
 *   digits from 0 to 9 
 *   $ symbol.
 *   underscore ( _ )
 *   
 *   2. As java is case sensitive language; ever declaration differs with same words.
 *     Number=10 , number =11, NUMBER =9
 *     
 *   3.  We can have n number of words as naming convention but its not the good practice of naming identifier;
 *   
 *   4. Identifier should not start with digits ( i.e 45x = 1)  [x45 =1 is valid]
 *   
 *   5. All pre-defined java class name and interface , we can use as identifier's no issue , but read ability of code is down and creating confusions. worst way of coding.
 */




public class Core_identifier {
	public static void main(String[] args) {
		int String = 888;
		System.out.println(String);
		int Runnable = 444;
		System.out.println(Runnable);
	}
	/* its Valid, 
	 * even though it is valid, but it is not a good programming practice, because it reduces read ability and creates confusion's
	 */
}

/*  
 *  which of following are valid java identifier's:
 *  total_number  valid
 *  total#    invalid
 *  123total  invalid
 *  total123  valid
 *  ca$h      valid
 *  _$_$_$_$   valid
 *  all@hands  invalid
 *  Integer    valid
 *  java2share  valid
 *  Int        valid
 *  int      invalid
*/ 


