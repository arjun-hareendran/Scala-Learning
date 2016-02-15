package com.courseera

object CollectionExample {

  def main(args: Array[String]) = {

    //Creating a list

    var a: List[Int] = List(10, 20, 30, 40)
    for (i <- 0 to a.length - 1) {
      println(a(i))
    }

    //empty list
    var b = List()
    println("Is this list empty  " + b.isEmpty);

    //Two dimensional List
    var c = List(
      List(0, 1, 2),
      List(3, 4, 5))

    for (i <- 0 to c.length - 1) {
      for (j <- 0 to 2)
        println(c(i)(j))
    }

    //Another way
    println("Another way of printing is ")

    var d: List[List[Int]] = List(
      List(0, 1, 2),
      List(3, 4, 5))

    for (i <- 0 to d.length - 1) {
      for (j <- 0 to 2)
        println(d(i)(j))
    }

    // List constructors

    val e = Nil
    println("E list is " + e)

    var f = 10 :: 20 :: 30 :: 40 :: Nil
    println("F list is " + f)

    var g = 10 :: (20 :: (30 :: (40 :: Nil)))
    println("G list is " + g)

    println("Head of the number is " + g.head)
    println("Tail of the number is " + g.tail)
    println("The last number is " + g.last)

    //End of List and Begin Map
    println("=============================MAP=======================")

    var h = Map()
    println("Map h " + h)

    var i = Map[String, Int](
      "One" -> 1,
      "Two" -> 2)
    println("Map h " + i)
    println("The keys present are" + i.keys)
    println("The Values present are" + i.values)

    i.foreach(s => println("Key is == > " + s._1 + " and the value is " + s._2))

    println("Another way")
    var j: Map[String, Int] = Map("One" -> 1)
    j.foreach(s => println("Key is == > " + s._1 + " and the value is " + s._2))

    //End of Map and Begin set
    println("=============================Set=======================")

    var k = Set[String]()
    println("The K set is " + k)

    var l = Set[Int](1, 2, 3, 4, 5, 6, 6)
    println("The values are" + l)

    var m: Set[Int] = Set(1, 2, 3, 4, 5, 6)
    println("The list is " + m)
    println("the head element is " + m.head)
    println("The tail elements are " + m.tail)
    println("The last elements are " + m.last)

    //End of Map and Begin set
    println("=============================Tupple=======================")

    var n = (1, "Arjun", 30.45)
    println("To Access the element use ._")
    println("The value one is " + n._1)
    println("The value two is " + n._2)

    //Check how to iterate over tupple

    println("Iterating !!")
    val o = Iterator(n)

    while (o.hasNext) {
      println(o.next())
    }

    val p = Iterator("Arjun", "Amith", "Jimmy")

    while (p.hasNext) {
      println(p.next())
    }

    //Fix this piece of code
    println("Using Iterator")

    var q = (("Arjun", "Hareendran"), ("Amith"), ("Jimmy", "G"))

    q.productIterator.map(_.asInstanceOf[Any]).foreach { x => println(x) }

    println("Testing 1")
    q.productIterator.foreach { x =>
      x match {
        case (a, b) => println(a + " " + b)
        case (a) => println(a + "--")
        case _ => println(x)
      }
    }

    println("Testing 2")
    var r = (("Arjun", "Hareendran"), ("Amith"), ("Jimmy", "G", "P"), ("a", "b", "c", "d"))
    r.productIterator.foreach { x =>
      x match {
        case (a, b) => println(a + " " + b)
        case (a, b, c) => println(a + " " + b + "==>" + c)
        case (a) => println(a)
      }
    }

    //End 
  }
}