package lectures.part1basics

object Expressions extends App {
	val x = 1 + 5 // expressions
	println(x)
	
	println(2 + 3 * 5)
	// + - * / & | ^ << >> >>> ( right shift with zero extension)
	println(2 | 3)
	
	println(1 == x)
	// == != > >= < <=
	println(1 != x)
	
	var aVariable: Int = 2
	aVariable += 3 // also works iwth -= *= /= .... side effects
	println(aVariable)
	
	// Instructions (do something) vs Expressions ( value).
	
	// IF expression
	val aCondition = true
	val aConditionedValue = if (aCondition) 5 else 3
	println(aConditionedValue)
	
	//imperative coding below example
	//this while loop will work in scala but we
	// should avoid this.
	
	var i: Int = 0
	while (i < 10) {
		println(i)
		i += 1
	}
	//Everything in Scala is expression
	
	i = 0
	val aWhile = while (i < 10) {
		{
			println(i)
			i += 1
		}
	}
	println(aWhile)
	
	val aWeirdValue = (aVariable = 3) //Unit == void
	println(aWeirdValue)
	
	//side effects: println(), whiles, reassigning
	
	//Code blocks
	
	val aNewBlock = {
		val y: Int = 2
		val z: Int = 3
		if (z < 2) "Hello" else "World"
	}
	println(aNewBlock)
	
	var aNewBlock1 = {
		val y: Int = 2
		val z: Int = 3
		if (z < 2) "Hello" else "World"
	}
	println(aNewBlock1)
}
