import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {
  play.Project.playJavaSettings
  val core = Project("wui-generic-core", file("wui-generic-core"))
  .settings(
    version := Pom.version(baseDirectory.value),
    libraryDependencies ++= Pom.dependencies(baseDirectory.value))


  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean
  )

  val root = play.Project("wui-generic-interface", appDependencies, path = file("wui-generic-interface"))
    .dependsOn(core)
    .settings(
      version := Pom.version(baseDirectory.value),
      libraryDependencies ++= Pom.dependencies(baseDirectory.value).filterNot(d => d.name == core.id))

  override def rootProject = Some(root)

}
