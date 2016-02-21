package com.courseera

object CaseClassExampleObject {

  def main(args: Array[String]) {

    val x = new CaseCLassExample(10, 10)
    val y = new CaseCLassExample(10, 20)
    val z = new CaseCLassExample(10, 30)
    val r = new CaseCLassExample(10, 40)
    val f = new CaseCLassExample(10, 50)

    x match {
      case CaseCLassExample(10, 10) => println("Value of y is 10")
      case CaseCLassExample(10, 20) => println("Value of y is 20")
      case CaseCLassExample(10, 30) => println("Value of y is 30")

    }

    y match {
      case CaseCLassExample(10, 10) => println("Value of y is 10")
      case CaseCLassExample(10, 20) => println("Value of y is 20")
      case CaseCLassExample(10, 30) => println("Value of y is 30")

    }

    for (i <- List(x, y, z,r,f)) {
      i match {
        case CaseCLassExample(10, 10) => println("==> Value of y is 10")
        case CaseCLassExample(10, 20) => println("==> Value of y is 20")
        case CaseCLassExample(10, 30) => println("==> Value of y is 30")
        case CaseCLassExample(x:Int,y:Int) => println("The vlalue of x is " + x + " And the value of y is " +y)
      } 
    }
  }
}