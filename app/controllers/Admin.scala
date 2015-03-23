package controllers

import play.api._
import play.api.mvc._
import anorm._
import play.api.db.DB
import play.api.Play.current


object Admin extends Controller {

  def index = Action {
    Ok("admin/index")
  }

  def login = Action {
    DB.withConnection { implicit c =>
      val result: Boolean = SQL("Select 1").execute()
      Ok("admin/login" + result)
    }
  }

}
