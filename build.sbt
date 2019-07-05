name := "node2vec-spark"

version := "0.1"

scalaVersion := "2.11.7"

libraryDependencies += "com.github.scopt" %% "scopt" % "3.3.0" exclude("org.scala-lang", "scala-library")
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.3.0" % "provided"
//libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.0" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.3.0" % "provided"