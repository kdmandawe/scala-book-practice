
object Playground extends App {

  implicit class BaseTreeToAst(val str: String)
    extends AnyVal {
    def asASTNodeOpt: Option[String] = {
      Option(str) match {
        case Some(x) => Some(x)
        case None => None
      }
    }
  }

  val nullStr: String = null
  println(nullStr.asASTNodeOpt)
}
