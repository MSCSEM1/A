object SumOfPrime {
 def main(args: Array[String]) = 
{

var primesum=0
for(i <- 2 to 100)
{
var sum=0
for(j<-2 to i)
if(i%j==0)
sum=sum+j
if(sum==i)
{
primesum=primesum+i
println("No. is prime no."+i)
}
}
println("sum of prime numbers are "+primesum)
}
}

