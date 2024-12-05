object Fibonacci {
  def main(args: Array[String]): Unit = {
	print("Enter the number till you want to print the fibonacci series :")
	var limit=scala.io.StdIn.readInt()
	Fibonacci(limit)
  }

def Fibonacci(limit:Int)={
	var no1:Int=0
	var no2:Int=1
	print(s" $no1 \n $no2 \n")
	var sum:Int =no1+no2
	while(sum<=limit)	
	{
		println(" "+sum)

		no1=no2
		no2=sum
		sum=no1+no2
	}
	print(s"Fibonacci Series upto $limit:")

}
}

