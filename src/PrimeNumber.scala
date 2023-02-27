import scala.io.StdIn.readInt
import scala.collection.mutable

object PrimeNumber extends App {

	val inputNumber = readInt()


			for (i <- 2 to inputNumber){

				if(isPrime(i) && isPrime(i+2)){
					print(i, i+2)
				}

			}

	def isPrime(n: Int): Boolean = ! ((2 until n-1) exists (n % _ == 0))

}