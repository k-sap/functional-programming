package newton

import newton.Newton.sqrtIter

object Newton:
  def sqrt(x: Double) =
    def sqrtIter(guess: Double): Double =
      if isGoodEnough(guess) then guess
      else sqrtIter(improve(guess), x)

    def isGoodEnough(guess: Double, eps: Double=0.0001): Boolean =
      val guessSquare = guess * guess
      guessSquare / x < 1 + eps & guessSquare / x > 1 - eps

    def improve(guess: Double) = (guess + x / guess) / 2

    sqrtIter(1.0)
