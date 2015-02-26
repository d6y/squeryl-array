package code

import java.sql.DriverManager

import org.squeryl.{Session, SessionFactory}
import org.squeryl.adapters.PostgreSqlAdapter

import SquerylEntrypoint._


object Main extends App {

  Class.forName("org.postgresql.Driver")

  SessionFactory.concreteFactory = Some( ()=>
    Session.create(DriverManager.getConnection("jdbc:postgresql:squerylarray"),new PostgreSqlAdapter))

  inTransaction {
    import DemoSchema._

    DemoSchema.printDdl

    //DemoSchema.create
    //rows.insert( new Row(id=1, xs=Array(1L,2L,3L)) )

    val query = from(rows)(r => select(r))
    println(query.toList.map(_.xs.toList))
  }

}