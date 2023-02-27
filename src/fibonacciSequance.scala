import scala.io.StdIn.readInt

object fibonacciSequance {
  
  def fiboSeries(x: Int): Int={
    if(x==0 || x==1) return x

					return fiboSeries(x-1) + fiboSeries(x-2)
  }

	/*def fibonacciSeries(x: Int): Int = {
			if(x==0 || x==1) return x

					return fibonacciSeries(x-1) + fibonacciSeries(x-2)


	}*/

	def main (args : Array[String]){
		var a = readInt()
    print(fiboSeries(a))
		
		
		
				/*for(i<-0 to a){
					print(fibonacciSeries(i)+ ",")
				}*/





	}


}