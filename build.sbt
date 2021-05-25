name := "Scala Project"
version := "1.0"
scalaVersion := "2.13.6"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.1.1",
  "org.apache.spark" %% "spark-sql" % "2.3.2"
)