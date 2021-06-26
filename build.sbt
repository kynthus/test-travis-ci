name := "test-travis-ci"

version := "0.1"

scalaVersion := "2.10.2"

crossScalaVersions += "2.10.2"
crossScalaVersions += "2.11.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test
