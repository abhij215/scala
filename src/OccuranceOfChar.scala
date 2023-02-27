

object OccuranceOfChar {

	def main(args: Array[String]){

		val a = "yellowyellow"
				val b = 'l'
				var count = 0
				for(i<-0 until (a.length)){
					if (a.charAt(i)==(b)){
						count += 1
					}
					
				}
		    println(count)
	}

}