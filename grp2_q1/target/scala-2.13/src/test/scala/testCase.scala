import org.scalatest.flatspec.AnyFlatSpec

class testCase extends AnyFlatSpec {
  "Knoldus" should "valid" in {
    var password = new code
    var result = password.pass_Valid(password= "Knoldus@123")
    assert(result == true)
  }
}