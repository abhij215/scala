

object PracticeOne extends App {
  
  var x = 6
  
  println(factorial(x))
  
  def factorial(x: Int): Int = {
    if (x==1) {
      return 1
    }
    else{
      x*factorial(x-1)
    }
    
  }
  
  
   val a = Array(125,123,345,112,125)
   
   var b = 0
   for (x <- 0 until (a.length-1)){
        b += a(x)
       }
   
   val average = b/a.length
   
   println("The Average is :" + average)
  
   
   var c = 0

  for(x<- 0 until (a.length-1)){
    if(a(x)>average){
      c += 1
      
    }
  }
   println("numbers greater than average"+" "+ c)
   
   
   
   
   
   
}