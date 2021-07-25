package recfun

object RecFun extends RecFunInterface:

  def main(args: Array[String]): Unit =
    println("Pascal's Triangle")
    for row <- 0 to 10 do
      for col <- 0 to row do
        print(s"${pascal(col, row)} ")
      println()

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    def pascalStep(c: Int, r: Int): Int =
      if r == 0 then
        1
      else if c == 0 | c == r then
        1
      else
        pascalStep(c - 1, r - 1) + pascalStep(c, r - 1)
    pascalStep(c, r)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean =
    def balanceStep(chars: List[Char], balance: Int): Boolean =
      if chars.isEmpty | balance < 0 then
        balance == 0
      else
        val currBalance =
          if chars.head == '(' then
            1
          else if chars.head == ')' then
            -1
          else
            0
        balanceStep(chars.tail, balance + currBalance)
    balanceStep(chars, 0)



  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int =
    def change(money: Int, coins: List[Int], sum: Int): Int =
      val coin = coins.head
      var curr_sum = sum
      if money >= coin then
        curr_sum = countChangeStep(money - coin, coins, sum)
      countChangeStep(money, coins.tail, curr_sum)

    def countChangeStep(money: Int, coins: List[Int], sum: Int): Int =
      if money == 0 then
        sum + 1
      else if coins.isEmpty then
        sum
      else
        change(money, coins, sum)

    countChangeStep(money, coins, 0)





