package controllers

import play.api._
import play.api.mvc._

object Admin extends Controller {

  def index = Action {
    Ok("admin/index")
  }

  def login = Action {
    Ok("admin/login")
  }

}
