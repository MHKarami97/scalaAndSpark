object SparkStart {
  def main(args: Array[String]): Unit = {

    val textFile = spark.read.textFile("../README.md")
    val firstText = textFile.first()
    val countText = textFile.count()

    println(textFile)
    println(countText)
    println(firstText)
    
    val linesWithSpark = textFile.filter(line => line.contains("Spark"))
  }
}
