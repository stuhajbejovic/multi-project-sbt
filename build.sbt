lazy val commonSettings = Seq(
  scalaVersion := "2.12.1",
  version := "0.1"
)

lazy val common = project.in(file("sbt_testing/common")).
settings(commonSettings: _*).
settings(
  name := "common"
)

lazy val hello = project.in(file("sbt_testing/hello")).
dependsOn(common).
settings(commonSettings: _*).
settings(
  name := "Hello"
)
