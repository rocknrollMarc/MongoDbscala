name := "MongoDbscala"

scalaVersion := "2.10.3"

organization := "Scala in Action"

libraryDependencies += "org.specs2" %% "specs2" % "1.13" % "test"

// append options Scala compiler
scalacOptions ++= Seq("-deprecation", "-unchecked")

