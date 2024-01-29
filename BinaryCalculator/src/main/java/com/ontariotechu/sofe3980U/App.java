package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		Binary binary1=new Binary("00010001000");
        System.out.println( "First binary number is "+binary1.getValue());
		Binary binary2=new Binary("111000");
        System.out.println( "Second binary number is "+binary2.getValue());
		Binary sum= Binary.add(binary1,binary2);
		System.out.println( "Their summation is "+sum.getValue());

		Binary ord = Binary.or(binary1,binary2);
		System.out.println( "Or'ing results in: "+ord.getValue());
		Binary andd = Binary.and(binary1,binary2);
		System.out.println( "And'ing results in: "+andd.getValue());
		Binary multi = Binary.multiplyBinary(binary1,binary2);
		System.out.println( "Multiplying results in: "+multi.getValue());
		Binary test = new Binary("000000");
		System.out.println("The value is: " + test.getValue());

		Binary binary11=new Binary("100100100001010011100");
		Binary binary22=new Binary("001010011010101010010");
		Binary binary3=Binary.and(binary11,binary22);
		System.out.println("The m,ulti value is: " + binary3.getValue());
    }
}
