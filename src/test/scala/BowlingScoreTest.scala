import com.bowling.gameScore
import org.scalatest.FunSuite

class BowlingScoreTest extends FunSuite {

  test("Perfect 300 Game"){
    val game = new gameScore
    assert(game.score(List(10,10,10,10,10,10,10,10,10,10,10,10)) === 300)
  }

  test("All 0 Game"){
    val game = new gameScore
    assert(game.score(List(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) === 0)
  }

  test("All 1 Game"){
    val game = new gameScore
    assert(game.score(List(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1)) === 20)
  }

  test("3 Strike Start"){
    val game = new gameScore
    assert(game.score(List(10,10,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) === 60)
  }

  test("Spare Strike Start"){
    val game = new gameScore
    assert(game.score(List(5,5,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) === 30)
  }

  test("Spare Start"){
    val game = new gameScore
    assert(game.score(List(5,5,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) === 20)
  }

  test("3 Strikes 10th Frame"){
    val game = new gameScore
    assert(game.score(List(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,10,10,10)) === 30)

  }

  test("Spare & Strike 10th Frame"){
    val game = new gameScore
    assert(game.score(List(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,5,10)) === 20)
  }

  test("Complex Game"){
    val game = new gameScore
    assert(game.score(List(2,8,10,5,3,8,1,6,0,6,3,10,5,0,9,1,3,7,10)) === 123)
  }

}
