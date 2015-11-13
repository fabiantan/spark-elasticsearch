name := "Elasticsearch"

version := "1.0"

scalaVersion := "2.10.5"

libraryDependencies += "org.apache.spark" % "spark-streaming_2.10" % "1.5.1"
libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.5.1"
libraryDependencies += "org.elasticsearch" % "elasticsearch-spark_2.10" % "2.2.0-beta1" % "compile"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

