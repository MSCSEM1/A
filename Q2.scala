object Q2 {
  def main(args: Array[String]): Unit = {
    val a = 20
    val b = 50
    val c = 50
    val d = 50
    var max1 =0
    var max2 =0
    
    val numbers = List(a, b, c, d)

    for (num <- numbers) {
      if (num > max1) {
        max2 = max1
        max1 = num
      } else if (num > max2 && num < max1) {
        max2 = num
      }
    }

    // Output the second maximum value
    println(s"Second maximum is $max2")
  }
}

