package net.groovygrevling

import unfiltered.directives.Directive
import unfiltered.directives.Directives._
import unfiltered.request.GET
import unfiltered.response.{ResponseString, Ok}

class PubchessApp(db: Persistence) extends unfiltered.filter.Plan {

  def intent = Directive.Intent {
    case GET(r) =>
      success(Ok ~> ResponseString("Awesome!"))
  }

}
