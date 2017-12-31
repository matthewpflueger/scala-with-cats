package com.github.matthewpflueger.scalawithcats

import cats.instances.string._
import cats.syntax.semigroup._

object Main {

  def main(args: Array[String]): Unit = {
    println("Hello " |+| "Cats!")
  }
}
