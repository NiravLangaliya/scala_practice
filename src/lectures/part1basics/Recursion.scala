package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
	
	def factorial(n: Int): Int = {
		if (n <= 1) 1
		else n * factorial(n - 1)
	}
	
	println(factorial(4))
	
	
	// call stack
	def factorial_type2(n: Int): Int =
		if (n <= 1) 1
		else {
			println("Computing factorial of" + n + " - I frist need factorial of " + (n - 1))
			val result = n * factorial_type2(n - 1)
			println("computed factorial of " + (n))
			result
		}
	
	//factorial_type2(50000)
	
	def factorica_type3(n: Int): BigInt = {
		@tailrec
		def factHelper(x: Int, accumulator: BigInt): BigInt = {
			if (x <= 1) accumulator
			else factHelper(x - 1, x * accumulator)
			// TAil Recursion = use recursion call as then last expression
			
		}
		
		factHelper(n, 1)
	}
	
	println(factorica_type3(50000))
	/*
	factorica_type3(10) = factHelper(10,1)
	= factHelper(9,10*1)
	= factHelper(8,9*10*1)
	 */
	// when you need loops , use tail recurision
	
}
