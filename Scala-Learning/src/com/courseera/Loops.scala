package com.courseera

object Loops {
  
  def main(args :Array[String]){
    
    //While loop
    var x =1
    
    while(x < 10){
      println("The value of x is " + x)
      x=x+1
    }
    
    //Do while loop
    
    x =1
    do{
      println("The value of x is " + x)
      x= x+1
    }while(x < 10)

    // for loop
      
      for(i <- 0 to 10){
        println("The value of i in for looop is" + i)
        
      }
      
      
  }

}