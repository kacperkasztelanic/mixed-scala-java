package com.kkasztel.scalajava.scala

import scala.annotation.tailrec
import scala.collection.JavaConverters._

class SquarerImpl extends Squarer {

  override def square(list: java.util.List[Integer]): java.util.List[Integer] = {
    @tailrec
    def square(l: List[Int], acc: List[Int]): List[Int] = {
      l match {
        case Nil => acc
        case h :: t => square(t, h * h :: acc)
      }
    }

    square(list.asScala.toList.asInstanceOf[List[Int]], Nil).reverse.asInstanceOf[List[java.lang.Integer]].asJava
  }
}
