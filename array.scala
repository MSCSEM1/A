object array 
{  
	def main(args:Array[String])  
	{   
        	var days = Array("Sunday", "Monday", "Tuesday",  
                    "Wednesday", "Thursday", "Friday", 
                    "Saturday")
		println("Enter the String:")
		val str=scala.io.StdIn.readLine()
		for(st<-days)
		{
			if(st.contains(str)==true)
			{
				println(st)
			}
		}
	}
} 
