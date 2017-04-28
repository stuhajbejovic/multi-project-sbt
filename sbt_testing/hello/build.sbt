lazy val common = RootProject(file("../common"))

lazy val root = (project in file(".")).dependsOn(common)
  .settings(
    name := "Hello",
    scalaVersion := "2.12.1",
    version := "0.1"
)
