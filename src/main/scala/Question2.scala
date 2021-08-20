object Question2 {
  class Rational(x:Int,y:Int){
    def numer:Int = x
    def denom:Int = y

    def +(r:Rational):Rational={
      new Rational(this.numer*r.denom+r.numer*this.denom,this.denom*r.denom)
    }
    def neg:Rational = {
      new Rational(-this.numer,this.denom)
    }
    def sub(r:Rational):Rational = {
      new Rational(this.numer*r.denom-r.numer*this.denom,this.denom*r.denom)
    }

    override def toString: String = {
      super.toString
      numer+"/"+denom
    }
  }
  def main(args:Array[String]): Unit ={
    val x = new Rational(1,2)
    val y = new Rational(1,2)
    val z = new Rational(1,2)

    println(x+y.neg+z.neg)
    println(x.sub(y).sub(z))
    val a = x.sub(y).sub(z)
//    println(a.sub(z))
    println(a)

  }
}
