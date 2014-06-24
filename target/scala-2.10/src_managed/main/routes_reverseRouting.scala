// @SOURCE:/Users/qinchao/play-spring-data-jpa/conf/routes
// @HASH:a0bb5b1d061b108f73fcf0933999f13f4c3f4acf
// @DATE:Mon Jun 23 18:51:19 PDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:12
// @LINE:8
// @LINE:7
package controllers {

// @LINE:12
class ReverseAssets {
    

// @LINE:12
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:7
class ReverseClientProductController {
    

// @LINE:7
def clientProducts(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "clientProducts")
}
                                                
    
}
                          

// @LINE:8
class ReverseApplication {
    

// @LINE:8
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:12
// @LINE:8
// @LINE:7
package controllers.javascript {

// @LINE:12
class ReverseAssets {
    

// @LINE:12
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:7
class ReverseClientProductController {
    

// @LINE:7
def clientProducts : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClientProductController.clientProducts",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientProducts"})
      }
   """
)
                        
    
}
              

// @LINE:8
class ReverseApplication {
    

// @LINE:8
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:12
// @LINE:8
// @LINE:7
package controllers.ref {


// @LINE:12
class ReverseAssets {
    

// @LINE:12
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:7
class ReverseClientProductController {
    

// @LINE:7
def clientProducts(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClientProductController]).clientProducts(), HandlerDef(this, "controllers.ClientProductController", "clientProducts", Seq(), "GET", """ Home page - we use the @controllers syntax here so that the router knows we are referring to a class. In turn it
 will call on the GlobalSettings.getController method to resolve the actual controller instance.""", _prefix + """clientProducts""")
)
                      
    
}
                          

// @LINE:8
class ReverseApplication {
    

// @LINE:8
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          
}
        
    