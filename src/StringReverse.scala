

object StringReverse {

	def main(args : Array[String]){

		val a = "Abhishek"

				var reverse = ""
				
				

				for (i<- 0 until (a.length)){
					reverse = a.charAt(i) + reverse
				}
		println(reverse)
	}
	
	

}