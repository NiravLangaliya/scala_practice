package lectures.part1basics

object Functions extends App {
	def aFunction(a: String, b: Int): String = {
		
		a + " " + b
	}
	
	println(aFunction("Hello", 3))
	
	//Parameter less function
	def aParameterlessfunction(): Int = 42
	
	println(aParameterlessfunction())
	println(aParameterlessfunction)
	
	// when ever you needs loop use recursive function
	def aRepatedFunction(a: String, b: Int): String = {
		if (b == 1) a + "\n"
		else " " + a + aRepatedFunction(a, b - 1) + "\n"
	}
	
	println(aRepatedFunction("How are you", 3))
	
	//if you don't define the return type of function then the compiler would figure it out by itself
	// but in case of a recursive function, you haven't to define return type as complier couldn't
	// able to figure it out.
	
}
