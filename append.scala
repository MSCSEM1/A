object append{
  	def test(str1:String,str2:String):String={
    		if(str1.length==str2.length)
      			return str1 + str2
    		if(str1.length > str2.length){
      			var diff=str1.length-str2.length
      			str1.substring(diff,str1.length)+str2
    		} 
		else{
      			var diff=str2.length - str1.length
      			str1 + str2.substring(diff,str2.length)
    		}
  	}
  	def main(args: Array[String]):Unit={
		println("Enter String1:")
    		var str1=scala.io.StdIn.readLine()
		println("Enter String2:")
    		var str2=scala.io.StdIn.readLine()
    		println("Given Strings: "+str1+" and "+str2)
    		println("Result:  " + test(str1, str2))
  }
} 
