import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object SparkStart {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("Hello").setMaster("local[3]")
    val sc = new SparkContext(conf)

    val textFile = sc.read.textFile("../README.md")
    val firstText = textFile.first()
    val countText = textFile.count()

    println(textFile)
    println(countText)
    println(firstText)

    val linesWithSpark = textFile.filter(line => line.contains("Spark"))
  }
}
