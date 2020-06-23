


lazy val commonSettings = Seq(
  version := "1.0",
  scalaVersion := "2.13.2",
  libraryDependencies +=
    "org.scalatest" %% "scalatest" % "3.0.8" % Test
)

lazy val core = project
  .in(file("."))
  .aggregate(ScalaLab1, ScalaLab2, ScalaLab3, ScalaLab4)
  .settings(commonSettings)

lazy val ScalaLab1 = project
  .settings(commonSettings)

lazy val ScalaLab2 = project
  .settings(commonSettings)

lazy val ScalaLab3 = project
  .settings(commonSettings)

lazy val ScalaLab4 = project
  .settings(commonSettings)