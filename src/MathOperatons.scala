

object MathOperatons {

	def main (args: Array[String]){
		// factorial of a number using iterative
		    var a = 5
				var factorial = 1

				  def factorialOfNumber(y: Int)={
						  for(i<-1 to a){
							  factorial *= i
						  }
						  println(factorial)
	      	}
		      factorialOfNumber(a)


		//factorial of a number using recursion
		      def rfact(y: Int): Int={
				    if (y==0)
				  	  1
				    else
					    y*rfact(y-1)
				  }

          println(rfact(5))   


		// odd or even
		    val s1 = 8

		        if (s1%2==0) 
		        	println("even")
		    	  else
			        println("odd")
		

		//leap year or not

		val year = 2034





	}


}