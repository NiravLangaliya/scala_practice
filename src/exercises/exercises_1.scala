package exercises

object exercises_1 extends App {
	
	//1 differance between "Hello World" and println("Hello World")
	
	//"Hello World" ---> this is value with string type
	//println("Hello World") ---> this is expression and which has side effect of printing.
	
	
	//2 what would be type for below val
	val someValue = {
		2 < 3
	}
	
	println(someValue)
	
	//3
	val someotherVaule = {
		if (someValue) 2 else 3
		45
	}
	
	println(someotherVaule)
}
