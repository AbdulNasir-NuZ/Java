package DataTypes;


/*
	 *   In java, every variable and every expression has some type, Each and every datatype is clearly defined,
	 *  every assignment should be checked by complier for type compatibilty,
	 *  beacuse of above reasons we can conclude java langauge is "Strongly Typed" programming language.
 * 
 	* when compaire with c++, java has more object oriented language. But not pure Object Oriented programming language when it compare with java.
 	* serveral OOP's feacture are not supported in java, and it depends on premittive data. so java is not considered as pure object oriented programming langauge.
 	* OOP's feacture not satsified by Java [Like  Operator overloading, Multiple inheritance, etc..] More over we are depending on primittive data type.
 	* which are non object's.
 	* 
 	* Premittive 8 dataTypes:
 	* 
 	*  Numeric data Types :                                                 Non-Numeric data Types:
 	*  - Intergral data Types:   -Floating point dataTypes:                -char              - Boolean  
 	*     byte                      float
 	*     short                     double
 	*     int 
 	*     long 
 	*              
 	*  Except Boolean and char, Remaining data types are consider as Singned Data Types, because represent both +ve and -ve numbers
 	*   
 	*  1) BYTE DATATYPE : 
 	*  
 	*       size : 8 bits.
 	*       
 	*        MAX_VALUE: +127;
 	* 
 	*               msb: The most significate bit access, Sign Bit sign bit = [ 0 -> +ve; 1 -> -ve],
 	*               remaining are 7 bits is "1" , (2^0,2^1, 2^2,.....)=127;
 	*               
 	*               Positive number will represented directly in memory.
 	* 
 	*        MIN_VALUE: -128;
 	*            
 	*            Negative number is represented  in memory in 2's compliment form.
 	*            
 	*        RANGE : -128 to +127.
 	*        
 	*      byte b =10;   valid
 	*      byte b=127;   valid
 	*      byte b=128;   In valid; CE: Possible loss of precision, found : int, required: byte.
 	*      byte b=10.5;   CE: possilbe loss of precision, found: double, required: byte.
 	*      byte b=true;   CE: incompatible types, found: boolean, required: byte.
 	*      byte b='durga'; CE: incompatible types, found: java.lang.string required: byte.
 	*      
 	*        
 	*   
 	*        
 */

public class datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //byte b=10;
	//byte b=127;
    //byte b=128; CE;
	//byte b= 11.2; CE;
	//byte b='durga'; CE;
	//byte b=-128;
	byte b=-1;
	//int b = 2147483647;
	//int b =  2147483648; CE;
    System.out.println(b);
    		
	}
 
}

/*
 *  If you want to handle data in terms of 'Streams'
 *   2 types of streams :
 *      1> Charater streams. 
 *      2> Byte streams. 
 * 
 * Byte is the Best choice, if we want to handle data interms of stream's either from file or from the network, 
 * file supported form or network suported form is bye
 * 
 * SHORT DATA TYPE:
 *     short is most rarrerly used datatype.
 *     
 *     size: 2 bytes (16 bits)
 *     Range: -2^15 to 2^15 -1   => [-32_768 to 32_767]
 *     
 *     
 *     short s = 32_767;
 *     short s = 32_768;  invalid CE: Possible loss of precision, found : int, required: short.
 *     short s = 10.4; invalid CE: Possible loss of precision, found : double, required: short.
 *     short s= true; invalid CE: incompatible type found: boolean, required: short.
 *     
 *     
 *    Short datatype is best sutaible for 16 bit processors like 8085,
 *    but these processors are completly outdated, 
 *    and hence corrosponding datatype is also outdated datatype
 *    
 *    
 * INT DATA TYPE:
 *     
 *     The most commonly used data type is int;
 *      size: 4bytes(32 bits)
 *      range: -2^31 to 2^31 -1 [2147483648 to 2147483647]
 *      
 *       
 *       int x = 2147483647; valid
 *       int x = 2147483648; invalid CE: integer number to large,
 *       int x = 2147483648l; invalid CE : Possible loss of precision, found : long, required: int.
 *       int x = true; invlaid CE: Possible loss of precision, found : boolean, required: int
*/
