package lectures.part1basics

import scala.reflect.internal.util.TriState.True

object ValuesVariablesTypes extends App{
  //val are immutable, val act same as constance or final in Java

 val x : Int = 42
  println(x)
  //type of val is optional as complier can infer type of val from checking value assinged to it.
  val y = 50
  val z : String = "Hello World"
  println(y,z)

  val aString : String = "Hello";
  println(aString)

  val aBoolean : Boolean = false
  println (aBoolean)

  val aChar : Char = 'a'
  println(aChar)
  //2 bytes
  val aShort : Short = 4612
  val aLong : Long = 543523434213213243L
  println (aShort,aLong)
  val aFloat : Float = 2.0f
  val aDouble : Double = 3.14
  println(aFloat,aDouble)

  //--------------
  //variables are mutable and it can be reassigned
  var aVariable : Int = 4
  aVariable = 60
  println(aVariable)
  //prefer vals over vars
  // all vals and vars have types
  //compiler automatically infers types when omitted
}
