package newton


class NewtonSuite extends munit.FunSuite:

  test("compute roots") {
  //assert()
    println(newton.Newton.sqrt(4))
    println(newton.Newton.sqrt(0.001))
    println(newton.Newton.sqrt(0.1e-20))
    println(newton.Newton.sqrt(1.0e20))
    println(newton.Newton.sqrt(1.0e50))
  }

  import scala.concurrent.duration.*
  override val munitTimeout = 1.seconds
