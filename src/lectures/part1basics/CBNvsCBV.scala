package lectures.part1basics

object CBNvsCBV {

	def callByName (x: Long) : Unit  =
		{
			println("by value" + x)
			println("by value" + x)
		}
	callByName(5)
}
