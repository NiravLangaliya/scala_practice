package exercises

import scala.annotation.tailrec

object Recursion extends App {
	
	// 1. Concatenate a String n times.
	// 2. IsPrime Function tail recursive
	// 3. Fibonacci Function , tail recursive
	
	// 1. Concatenate a String n times.
	@tailrec
	def concatenateTailrec(aString: String, n: Int, accumulator: String): String
	= {
		if (n <= 0) accumulator
		else concatenateTailrec(aString, n - 1: Int, aString + accumulator)
	}
	
	println(concatenateTailrec("Hello ", 5, "How are you"))
	
	
	@tailrec
	def concatenateTailrec1( n: Int,aString : String = ""): String
	= {
		if (n <= 0) aString
		else concatenateTailrec1(n - 1: Int, aString + " Hello")
	}
	
	println(concatenateTailrec1(7))
	
	// 2. IsPrime Function tail recursive
	
	def functionIsPrimt(n: Int): Boolean = {
		@tailrec
		def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
			if (!isStillPrime) false
			else if (t <= 1) true
			else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)
		}
		
		isPrimeTailrec(n / 2, true)
	}
	
	println(functionIsPrimt(629))
	println(functionIsPrimt(1000))
	println(functionIsPrimt(2003))
	
	// 3. Fibonacci Function , tail recursive
	
	def aFibonaccinumber(n: Int): Int = {
		@tailrec
		def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int =
			if (i >= n) last
			else fiboTailrec(i + 1, last + nextToLast, last)
		
		if (n <= 2) 1
		else fiboTailrec(2, 1, 1)
	}
	
	println(aFibonaccinumber(8))
	// 1 1 2 3 5 8 13 21
	
}

