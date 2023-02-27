
object Palindrome { 
  	    def main(args : Array[String]){
  	      // Word to check
		      val a = "alpha"
		      // assigning a null value to store the reversed string
				  var reverse = ""
				    // reversing the string
				    for (i<- 0 until (a.length)){
					      reverse = a.charAt(i) + reverse
				    }
		      println(reverse)
		      // checking the string if its palindrome or not
	    	  if(a.equals(reverse))
		        println(a+ " "+ "is a palindrome")
		      else
		        println(a+ " "+ "is not a palindrome")
	       }	
}