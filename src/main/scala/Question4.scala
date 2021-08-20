object Question4 {


  class Account ( x:String , y: Int , z : Double) {

    val NIC: String = x
    val accountNumber: Int = y
    var balance: Double = z

    def withdraw(amount: Double) = this.balance -= amount

    def deposit(amount: Double) = this.balance += amount

    def transfer(amount: Double, that: Account): Unit = {
      this.balance = this.balance - amount
      that.balance = that.balance + amount
    }


    @Override
    override def toString(): String = "NIC : " + this.NIC + "\n Account Number : " + this.accountNumber + "\n Balance : " + this.balance
  }

  var bank : List[Account] = List( new Account("991445745V" , 1 , -2000) , new Account("987595745V" , 2 , 4000) )

  val find = ( n : Int , b : List[Account]) => b.filter( x => x.accountNumber.equals( n ))

  val overdraft = ( b : List[Account] ) => b.filter( x => x.balance < 0)

  val balance = ( b: List[Account] ) => b.map( x => (x,x.balance) ).reduce( (a , c) => ( c._1 , a._2 + c._2) )

  val interest = ( b : List[Account] ) => b.map( x => {
    x.balance match {
      case a if a >= 0 => x deposit x.balance * 0.05
      case _ => x withdraw Math.abs(x.balance) * 0.01

    }
    x
  })

  def main(args:Array[String]): Unit ={
    println("Bank " + bank )
    println()
    println("Find " + find( 2 , bank) )
    println()
    println("Overdraft " + overdraft( bank ) )
    println()
    println("Balance " + balance( bank )._2 )
    println()

    bank = interest( bank )

    println("Bank " + bank )
    println()
    println("Balance " + balance( bank )._2 )
    println()
  }
}
