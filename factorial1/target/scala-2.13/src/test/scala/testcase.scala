import org.scalatest.flatspec.AnyFlatSpec

class testcase extends AnyFlatSpec{
  val fact = new factorial
  val num = fact.fact(5)
  assert(num == 120)
}