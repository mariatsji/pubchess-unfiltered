package net.groovygrevling

import com.sleepycat.je.{Environment, EnvironmentConfig}

class Persistence(dir: String) {

  val envConfig : EnvironmentConfig = new EnvironmentConfig()
  envConfig.setAllowCreate(true)
  val myDbEnvironment = new Environment(new java.io.File(dir), envConfig)

}
