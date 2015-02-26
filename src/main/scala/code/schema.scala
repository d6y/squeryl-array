package code

import org.squeryl._
import org.squeryl.dsl._

import SquerylEntrypoint._

object DemoSchema extends Schema {

  case class Row(val id: Long, val xs: Array[Long])

  val rows = table[Row]
  on(rows) { r =>
    declare( r.id is (primaryKey) )
  }
}