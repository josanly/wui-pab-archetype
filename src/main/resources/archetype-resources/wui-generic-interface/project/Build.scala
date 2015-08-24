import sbt._
import Keys._
import play.Project._
import com.typesafe.config._

object ApplicationBuild extends Build {
  val conf = ConfigFactory.parseFile(new File("conf/application.conf")).resolve()
  val appName    = conf.getString("app.name")
  val appVersion = conf.getString("app.version")
  //val appName         = "web-interface"
  //val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
