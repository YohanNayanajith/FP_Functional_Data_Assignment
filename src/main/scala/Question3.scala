object Question3 {
  class Account(m:Double){
    var money:Double = m

    def transfer(a:Account):Unit = {
      a.money = this.money+a.money
      this.money = 0
    }

    override def toString: String = {
      super.toString
      "Account Balance = "+money
    }
  }

  def main(args:Array[String]): Unit ={
    val x = new Account(2000)
    val y = new Account(5000)

    println("X "+x.toString)
    println("Y "+y.toString)
    x.transfer(y)
    println("X "+x.toString)
    println("Y "+y.toString)
  }
}
