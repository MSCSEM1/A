object perfectNo{
def main(args:Array[String])={
for(j<-1 to 10)
{
	var n1=scala.util.Random
	var n=n1.nextInt(28)
	var sum=0
	for(i<-1 to n-1)
	{
		if(n%i==0)
		{
			sum=sum+i
		}
	}
	if(sum==n)
		println(s"$n is perfect no.")
	else
		println(s"$n is not perfect no.")
	}
}
}

