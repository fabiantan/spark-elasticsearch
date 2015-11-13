name := "Elasticsearch"

version := "1.0"

scalaVersion := "2.10.5"

libraryDependencies += "org.apache.spark" % "spark-streaming_2.10" % "1.4.1"
libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.4.1"
libraryDependencies += "org.elasticsearch" % "elasticsearch-spark_2.10" % "2.1.2" % "compile"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

// META-INF discarding
mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) =>
   {
    case PathList("META-INF", xs @ _*) => MergeStrategy.discard
    case x => MergeStrategy.first
   }
}
