name := """play-blog-me"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.4"

javaOptions += "-Xmx32m"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)
