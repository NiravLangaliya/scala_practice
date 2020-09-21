package exercises

object Functions extends  App{
	/*
	1. A greeting function ( name , age )
	==>"Hi my name is $name and I am $age years old"
	
	2. Factorial Funcation 1 * 2 * 3 * ... * n
	
	3. A fibonacci Funtoin
	f(1) = 1
	f(2) = 1
	f(n) = f(n-1) + f(n-2)
	
	4. tests if a number is prime
	*/
	
	//1.
	def greetingfunction(name: String, age: Int): String =
		"Hi my name is " + name + " and I am " + age + " years old"
		
	println(greetingfunction("Haru",1))
	//2. ( 4 * 3 * 2 * 1 = 24 )
	def factorial(n : Int) : Int =
		if (n <= 0 ) 1
		else n * factorial(n-1)
	println(factorial(4))
	
	//3.
	
	def fibonacci(n: Int) : Int = {
		if (n <=2 ) 1
		else fibonacci(n-1) + fibonacci(n-2)
		//1 1 2 3 5 8 13 21 ...
	}
	
	println(fibonacci(8))
	println("-----")
	def isPrime(n : Int) : Boolean =
		{
			def isPrimeUnitll(t:Int) : Boolean = {
				println(n,t)
				if (t <=1) true
				else n % t != 0 && isPrimeUnitll(t-1)
			}
			
			isPrimeUnitll(n/2)
		}
		
	println(isPrime(37))
	println(isPrime(36))
}
