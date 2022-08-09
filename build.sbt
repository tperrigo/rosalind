organization := "tperrigo"
name := "rosalind"
description := "A very special project generated with zio-start. Good luck!"
version := "0.1.0"
scalaVersion := "2.13.8"

val zioVersion = "2.0.0"

lazy val core = 
  project
    .in(file("modules/core"))
    .settings(
      name := "rosalind",
      libraryDependencies ++= Seq(
        "dev.zio" %% "zio" % zioVersion,
        "dev.zio" %% "zio-streams" % zioVersion,
        "dev.zio" %% "zio-test" % zioVersion % Test,
        "dev.zio" %% "zio-test-sbt" % zioVersion % Test,
        "dev.zio" %% "zio-logging" % "2.0.0",
        "dev.zio" %% "zio-prelude" % "1.0.0-RC15"
      ),
      testFrameworks := List(new TestFramework("zio.test.sbt.ZTestFramework"))
    )