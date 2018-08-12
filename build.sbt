name := """customer"""
organization := "com.dheeraj"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava).disablePlugins(PlayFilters)

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  guice,
  "com.dheeraj" % "dbProvider" % "0.0.1-SNAPSHOT",
  "org.mongodb" % "mongodb-driver" % "3.6.3",
  "org.mongodb.morphia" % "morphia" % "1.3.2",
  "com.dheeraj" % "security" % "0.0.1-SNAPSHOT",
  "com.dheeraj" % "utility" % "0.0.1-SNAPSHOT"
)

resolvers += Resolver.mavenLocal
