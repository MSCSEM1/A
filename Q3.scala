object Q3{
def main(args:Array[String]):Unit={
println("Enter any number :")
val no=scala.io.StdIn.readInt()
var fact=1
var i=1
while(i<=no)
{
fact*=i
i+=1
}
println(s"Factorial of number $no is :$fact")

}
}
