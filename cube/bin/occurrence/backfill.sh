mvn -f ../../pom.xml clean assembly:assembly
java -cp ./:../conf:../../target/cube-0.5-SNAPSHOT-jar-with-dependencies.jar:$HADOOP_HOME/lib/hadoop-hdfs-2.0.0-cdh4.2.1.jar org.gbif.metrics.cube.occurrence.backfill.Backfill