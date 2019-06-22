object TypesMonoculture extends App {

//  def title(text: String, anchor: String, style: String): String =
//    s"<a id='$anchor'><h1 class='$style'>$text</h1></a>"


//  println(title("chap:vcls", "bold", "Value Classes"))


  class Anchor(val value: String) extends AnyVal
  class Style(val value: String) extends AnyVal
  class Text(val value: String) extends AnyVal
  class Html(val value: String) extends AnyVal

  def title(text: Text, anchor: Anchor, style: Style): Html =
    new Html(
      s"<a id='${anchor.value}'><h1 class='${style.value}'>${text.value}</h1></a>"
    )

  println(title(new Text("Value Classes"), new Anchor("chap:vcls"), new Style("bold")).value)
}
