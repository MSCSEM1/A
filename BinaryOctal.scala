object BinaryOctal {
  def binaryCon(n: Int): Unit = {
    var num = n
    val sb = new StringBuilder

    if (num == 0) {
      sb.append(0)
    } else {
      while (num > 0) {
        sb.insert(0, num % 2)
        num /= 2
      }
    }

    println("\nBinary equivalent: " + sb.toString())
  }
  def octalCon(n: Int): Unit = {
    var num = n
    val sb = new StringBuilder

    if (num == 0) {
      sb.append(0)
    } else {
      while (num > 0) {
        sb.insert(0, num % 8)
        num /= 8
      }
    }

    println("\nOctal equivalent: " + sb.toString())
  }
  def main(args: Array[String]): Unit = {
    println("Enter number:")
    val n = scala.io.StdIn.readInt()

    octalCon(n)
    binaryCon(n)
  }
}

