package net.groovygrevling

/** embedded server */
object Server {
  def main(args: Array[String]) {

    unfiltered.jetty.Server.anylocal.context("/assets") {
      _.resources(new java.net.URL(getClass().getResource("/www/css"), "."))
    }.plan(new PubchessApp(new Persistence("/home/sjur/pubchessdb"))).run({ svr =>
      unfiltered.util.Browser.open(svr.portBindings.head.url)
    })
  }
}
