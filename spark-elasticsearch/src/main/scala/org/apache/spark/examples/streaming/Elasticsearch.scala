package org.apache.spark.examples.streaming
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import org.elasticsearch.spark._

object Elasticsearch {
     def main(args: Array[String]) {

    //val cl = ClassLoader.getSystemClassLoader
    //cl.asInstanceOf[java.net.URLClassLoader].getURLs.foreach(println)


    val conf = new SparkConf().setAppName("UniqueUserCount")
    conf.set("es.index.auto.create", "true")
    conf.set("es.nodes","54.66.140.211:9200") 
    conf.set("es.nodes.client.only","false") 
    conf.set("es.nodes.data.only","false") 
    conf.set("es.nodes.discovery", "false")
    val sc = new SparkContext(conf)
    val numbers = Map("one" -> 1, "two" -> 2, "three" -> 3)
    val airports = Map("arrival" -> "Otopeni", "SFO" -> "San Fran")

    sc.makeRDD(Seq(numbers, airports)).saveToEs("spark/docs")
  }

}




