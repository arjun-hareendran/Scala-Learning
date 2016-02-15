package com.courseera

object StringExample {

  def main(args: Array[String]) = {

    var i = "Arjun Hareendran"
    println(i)

    println("The value at 4th position is " + i.charAt(3))
    println("Does it start with A ==> " + i.startsWith("A"))
    println("Does it start with A ==> " + i.startsWith("B"))
    println("Does it ends with n ==>" + i.endsWith("n"))
    println("Does it ends with n ==>" + i.endsWith("N"))

    println("Index of H is " + i.indexOf("H"))
    println("SubsString ==>" + i.substring(0, 5))
    println("Concatenating Name and Age ==> " + i.concat("--28"))
    println("Checking if Arjun Hareendran Contains Arjun ==> " + i.contains("Arjun"))
    println("Repalcing H with h  " + i.replace("H", "h"))

    println("Upper Case is " + i.toUpperCase())
    println("Lower Case is " + i.toLowerCase())

    println("Is the String empty" + i.isEmpty())
    i = " Arjun Hareendran "
    println("Trimming ==>" + i.trim() + "<==")

  }

}