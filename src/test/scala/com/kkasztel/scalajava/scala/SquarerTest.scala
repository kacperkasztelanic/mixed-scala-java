package com.kkasztel.scalajava.scala

import org.scalatest.flatspec.AnyFlatSpec

class SquarerTest extends AnyFlatSpec {

  it should "return 25 for input 5" in {
    assert(new SquarerImpl().square(5) === 25)
  }
}
