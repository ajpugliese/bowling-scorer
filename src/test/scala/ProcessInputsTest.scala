import com.bowling.processInputs
import org.scalatest.FunSuite

class ProcessInputsTest extends FunSuite {

  test("Test Input String to List Conversion"){
    val args : Array[String] = Array("0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0")
    val variables = new processInputs(args)
    assert(variables.rollList === List(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0))
  }

}
