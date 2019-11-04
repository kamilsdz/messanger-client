ThisBuild / scalaVersion := "2.13.1"
ThisBuild / organization := "com.example"

lazy val messanger = (project in file("."))
  .settings(
    name := "Messanger",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test,
  )
