package com.courseera

object ExampleClassObject {

  def main(args: Array[String]) {

    var obj = new ExampleClass(10, 20)
    obj.myMethod(30)
    println(obj.x)
    obj.printing(obj.x)
    
    
    val Incre = (y:Int) => obj.x +20
    println(Incre(20))
    
  }

}