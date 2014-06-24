// @SOURCE:/Users/qinchao/play-spring-data-jpa/conf/routes
// @HASH:a0bb5b1d061b108f73fcf0933999f13f4c3f4acf
// @DATE:Mon Jun 23 18:51:19 PDT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:7
private[this] lazy val controllers_ClientProductController_clientProducts0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("clientProducts"))))
        

// @LINE:8
private[this] lazy val controllers_Application_index1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:12
private[this] lazy val controllers_Assets_at2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """clientProducts""","""@controllers.ClientProductController@.clientProducts"""),("""GET""", prefix,"""@controllers.Application@.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:7
case controllers_ClientProductController_clientProducts0(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClientProductController]).clientProducts, HandlerDef(this, "controllers.ClientProductController", "clientProducts", Nil,"GET", """ Home page - we use the @controllers syntax here so that the router knows we are referring to a class. In turn it
 will call on the GlobalSettings.getController method to resolve the actual controller instance.""", Routes.prefix + """clientProducts"""))
   }
}
        

// @LINE:8
case controllers_Application_index1(params) => {
   call { 
        invokeHandler(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:12
case controllers_Assets_at2(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     