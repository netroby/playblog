package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  val name = "JH"
  val age = 18
  def index = Action {
    Ok("Nice working.Your new application is ready. I am ready " + name + " I am " + age + " Years old")
  }
  def account = Action  {
    Ok("This is account")
  }

}
