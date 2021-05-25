## Scala And Spark
simple start of scala and spark

## install Scala
- download Coursier  (https://www.scala-lang.org/download/scala3.html)
- follow doc in previous link
- install vs code
- install { Scala (Metals) } in vscode

## install Spark
 - Install Java 8 (java -version)
 - Install Scala (scala -version)
 - Download Apache Spark (https://spark.apache.org/downloads.html)
 - spark-2.4.5-bin-hadoop2.7.tgz
 - extracting the downloaded file
 - download winutils.exe File (https://github.com/cdarlint/winutils/blob/master/hadoop-3.2.1/bin/winutils.exe)
 - create new folders Hadoop and bin on C:
 - Copy the winutils.exe file from the Downloads folder to C:hadoop\bin
 - Configure Environment Variables (uer variable)
 - SPARK_HOME => C:\spark-2.4.5-bin-hadoop2.7
 - path => %SPARK_HOME%\bin
 - HADOOP_HOME => C:\Hadoop
 - path => %HADOOP_HOME%\bin
 - JAVA_HOME => (JDK directory)
 - Launch Spark (C:\spark\bin> spark-shell)
 - http://localhost:4040

## Start Spark Project
- click (import build) in vs code
- or run (sbt package) on terminal with root of project
