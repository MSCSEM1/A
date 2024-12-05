
object Q1{
def main(args:Array[String]):Unit={
println("Enter any number :")
val no =scala.io.StdIn.readInt()

if(no > 0)
println(s"The number $no is positive")
else if(no < 0)
println(s"The number $no is negative")
else
println(s"The number $no is zero")

}
}
