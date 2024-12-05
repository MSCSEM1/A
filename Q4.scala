object Q4{
def main(args :Array[String]):Unit={

println("Enter first number :")
val n1=scala.io.StdIn.readInt()

println("Enter second number :")
val n2=scala.io.StdIn.readInt()

var sum=0
var count =0
var i=n1
for (i<-n1 to n2)
{
sum=sum+i
count+=1
}
val avg=sum.toDouble/count

println(s"Average of numbers between $n1 to $n2 is :$avg")
}
}

