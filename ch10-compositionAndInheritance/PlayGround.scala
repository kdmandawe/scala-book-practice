object PlayGround extends App {

  val path = "hdfs://ip-172-31-0-44.ec2.internal:8020/tmp/cust100_member_sync"

  val tableName = s"${path.toString.split('/').takeRight(2).mkString("_")}"
    .replaceAll("""\W""", "_")

  println(tableName)


}
