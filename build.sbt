name := "squeryl-array"

version := "1.0.0"

scalaVersion := "2.11.5"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-unchecked", // Enable additional warnings where generated code depends on assumptions
  "-feature",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-Xlint", // Enable recommended additional warnings.
  "-Xfatal-warnings",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture"
  )

resolvers ++= Seq(
  "Java.net Maven2 Repository"     at "http://download.java.net/maven/2/",
  "Sonatype scala-tools repo"      at "https://oss.sonatype.org/content/groups/scala-tools/",
  "Sonatype scala-tools releases"  at "https://oss.sonatype.org/content/repositories/releases",
  "Sonatype scala-tools snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
)

{
  libraryDependencies ++= Seq(
    "org.squeryl"               %% "squeryl"           % "0.9.6-RC3",
    "org.postgresql"            %  "postgresql"        % "9.3-1100-jdbc41",
    "org.scalaz"                %% "scalaz-core"       % "7.1.0"
)}

libraryDependencies ++= Seq(
    "org.specs2"     %% "specs2"        % "2.4.15" % "test",
    "org.scalacheck" %% "scalacheck"    % "1.12.1" % "test",
    "org.typelevel"  %% "scalaz-specs2" % "0.3.0"  % "test",
    "com.h2database" %  "h2"            % "1.3.170" % "test"
)
