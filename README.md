# Insert and Select Arrays using Squery and Postgres

# Create a database

    $ psql (9.3.2)
    Type "help" for help.

    richard=# CREATE DATABASE "squerylarray";
    CREATE DATABASE
    richard=# \q

# Create a table and data

    create table "Row" (
      "xs" bigint[] not null,
      "id" bigint primary key not null
    );

  	insert into "Row" (id, xs) values (1, '{1,2,3}');

(or just uncomment the `DemoSchema.create` and `rows.insert` lines in _main.scala_)

# Run the code

    $ sbt
    > run

Output should be: `List(List(1, 2, 3))`