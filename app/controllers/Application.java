package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.Events;
import views.html.UserHome;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

    /**
     * Returns the index login page.
     * @return The login page.
     */
    public static Result index() { return ok(Index.render("This should be the login page.")); }

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result userHome() {
    return ok(UserHome.render("Welcome to the home page."));
  }

  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result events() {
    return ok(Events.render("Welcome to the events page."));

  }

}
