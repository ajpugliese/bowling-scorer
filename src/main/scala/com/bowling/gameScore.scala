package com.bowling

import scala.annotation.tailrec

class gameScore {
  @tailrec
  final def score(rolls : List[Int], frame : Int = 1, total : Int = 0) : Int = {

    if (frame <= 10) {
      rolls match {
        case List(10, _*) =>
          score(rolls.drop(1), frame + 1, rolls.take(3).sum + total)

        case List(first: Int, second: Int, _*) if first + second == 10 =>
          score(rolls.drop(2), frame + 1, rolls.take(3).sum + total)

        case List(first: Int, second: Int, _*) =>
          score(rolls.drop(2), frame + 1, rolls.take(2).sum + total)
      }
    }
    else total
  }
}
