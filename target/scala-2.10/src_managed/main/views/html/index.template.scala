
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

<h3>"""),_display_(Seq[Any](/*3.6*/(message))),format.raw/*3.15*/("""</h3>

<!--"""),_display_(Seq[Any](/*5.6*/main("Welcome to Play 2.1")/*5.33*/ {_display_(Seq[Any](format.raw/*5.35*/("""-->

    <!--"""),_display_(Seq[Any](/*7.10*/play20/*7.16*/.welcome(message))),format.raw/*7.33*/("""-->

<!--""")))})),format.raw/*9.6*/("""-->
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 24 00:17:12 PDT 2014
                    SOURCE: /Users/qinchao/play-spring-data-jpa/app/views/index.scala.html
                    HASH: a8ab998d8a974f5ef89407c62def39bef8ea76d8
                    MATRIX: 774->1|885->18|926->25|956->34|1002->46|1037->73|1076->75|1125->89|1139->95|1177->112|1217->122
                    LINES: 26->1|29->1|31->3|31->3|33->5|33->5|33->5|35->7|35->7|35->7|37->9
                    -- GENERATED --
                */
            