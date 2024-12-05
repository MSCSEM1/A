object Rotation 
{
	def areRotations(str1: String, str2: String): Boolean = 
	{
		if (str1.length != str2.length) 
		{
      			false
		}
		else 
		{
			val concatenated = str1 + str1
			concatenated.contains(str2)
		}
	}

	def main(args: Array[String]): Unit = 
	{
		println("Enter String1:")
		val str1 = scala.io.StdIn.readLine()
		println("Enter String2:")
		val str2 = scala.io.StdIn.readLine()

		if (areRotations(str1, str2)) 
		{
			println(s"$str1 and $str2 are rotations of each other.")
		} 
		else 
		{
			println(s"$str1 and $str2 are not rotations of each other.")
		}
	}
}
