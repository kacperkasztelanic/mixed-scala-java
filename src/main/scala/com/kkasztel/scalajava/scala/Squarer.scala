package com.kkasztel.scalajava.scala

trait Squarer {

  def square(list: java.util.List[Integer]): java.util.List[Integer]

  def square(n: Int): Int = {
    n * n
  }

  def square2(n: Integer): Integer = {
    n * n
  }
}
