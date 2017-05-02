lazy val commonSettings = Seq(
  scalaVersion := "2.12.1",
  version := "0.1",

  // Example: some dependencies that are common to every project.
  libraryDependencies ++= Seq(

    // ScalaTest dependency.
    "org.scalatest" %% "scalatest" % "3.0.1" % "test",

    // ScalaCheck dependency.
    "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"
  )
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
  name := "Hello",

  // Some dependencies that apply only to the hello project.
  libraryDependencies ++= Seq(

    // The Scala reflection library is required for implementing macros, etc.
    "org.scala-lang" % "scala-reflect" % scalaVersion.value
  )
)
