package com.bowling

class processInputs(args: Array[String]) {
  val rolls = args(0)
  val rollList : List[Int] = rolls.split(",").map(_.toInt).toList
}