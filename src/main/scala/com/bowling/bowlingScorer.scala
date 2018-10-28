package com.bowling

object bowlingScorer extends App {
  val variables = new processInputs(args)
  val game = new gameScore
  val score = game.score(variables.rollList)
  println(s"Score for game (${variables.rolls}):$score")
}
