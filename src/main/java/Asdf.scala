import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD.rddToPairRDDFunctions

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

//this works!!!

object Asdf {
  def main(args: Array[String]) = {

    println("oh wowowowwwww")

    println("hello")
    val spark = SparkSession.builder.master("local[2]").appName("SUnderstandingSparkSession").getOrCreate()

    val df = spark.read.json("people.json")
    df.show()

//    org.apache.log4j.Logger.getLogger("org").setLevel(org.apache.log4j.Level.OFF)

    //    
    //    
    //    
    //    //Start the Spark context
    //    val conf = new SparkConf()
    //      .setAppName("WordCount")
    //      .setMaster("local")
    //    val sc = new SparkContext(conf)
    //
    //    //Read some example file to a test RDD
    //    val test = sc.textFile("filename.txt")
    //
    //    test.flatMap { line => //for each line
    //      line.split(" ") //split the line in word by word.
    //    }
    //      .map { word => //for each word
    //        (word, 1) //Return a key/value tuple, with the word as key and 1 as value
    //      }
    //      .reduceByKey(_ + _) //Sum all of the value with same key
    //      .saveAsTextFile("output4.txt") //Save to a text file
    //
    //    //Stop the Spark context
    //    sc.stop
  }
}