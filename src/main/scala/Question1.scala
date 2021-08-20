object Question1 {
  class Rational(x:Int,y:Int){
    def numer: Int = x
    def denom: Int = y

    def add(r:Rational): Rational ={
      new Rational(this.numer*r.denom+r.numer*this.denom,this.denom*r.denom);
    }

    def neg:Rational ={
      new Rational(-this.numer,this.denom)
    }

    override def toString: String = {
      super.toString
      numer+"/"+denom
    }
  }
  def main(args:Array[String]): Unit ={
    val x = new Rational(1,3)
    val y = new Rational(5,7)

    val a = x.add(y)
    println("Rational Number:"+a)
//    println(a.toString)
    println(x.neg)
  }
}
