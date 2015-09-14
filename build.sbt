name := """playblog"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

javaOptions += "-Xms128m -Xmn256m -Xmx512m -XX:UseG1GC -server "

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "mysql" % "mysql-connector-java" % "5.1.36",
  "com.typesafe.play" %% "anorm" % "2.4.0"

)
routesGenerator := InjectedRoutesGenerator
