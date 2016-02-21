package com.courseera

object CaseExample {

  def main(args: Array[String]) {

    println(matchVal(1))
    println(matchVal(2))
  }
  def matchVal(i: Int): String = i match {
    case 1 => "One"
    case 2 => "two"
    case _ => "Default value"
  }
}