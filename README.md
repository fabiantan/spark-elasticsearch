# spark-elasticsearch projects 

Install sbt in your EMR Cluster before starting

spark-elasticsearch (vanilla ES approach)
spark-elasticsearch-managed-aws (AWS ES approach)

```
git clone 

#### Non-assembly approach
sbt clean package

**copy compiled jar over to EMR cluster.
**download required JAR dependencies to CLASSPATH on EMR Master node .eg /usr/share/aws/emr/lib/elasticsearch-spark_2.10-2.1.2.jar
**Use verbose to view worker and driver Classpath 
** Add --jars to copy local client file to distributed HDFS cache

spark-submit --master=yarn-client --verbose --jars /usr/share/aws/emr/lib/elasticsearch-spark_2.10-2.1.2.jar --class org.apache.spark.examples.streaming.Elasticsearch elasticsearch_2.10-1.0.jar
```
```

#### assembly approach
sbt clean assembly

**copy compiled jar over to EMR cluster.
**Use verbose to view worker and driver Classpath

spark-submit --master=yarn-client  --verbose --class org.apache.spark.examples.streaming.Elasticsearch Elasticsearch-assembly-1.0.jar
```


