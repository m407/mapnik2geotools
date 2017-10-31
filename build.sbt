import sbt.Keys._
import sbt._
import sbtassembly.AssemblyPlugin.autoImport._

name := "mn2gt"

version := "0.2"

organization := "org.opengeo"

scalaVersion := "2.12.4"

fork in run := false

mainClass in (Compile, run) := Some("me.winslow.d.mn2gt.GUI")

mainClass in assembly := Some("me.winslow.d.mn2gt.GUI")


libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library" % scalaVersion.value,
  "org.scala-lang.modules" %% "scala-swing" % "2.0.1",
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.6",
  "org.scala-lang.modules" %% "scala-xml" % "1.0.6",
  "commons-httpclient" % "commons-httpclient" % "3.1"
)
