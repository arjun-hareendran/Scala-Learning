package com.courseera

class ExampleClass(i: Int, j: Int) {

  var x = i
  var y = j

  def myMethod(inp: Int) = {
    x = x + inp
  }

  def printing(r: Int): Int = {
    println(r)
    x
  }

}