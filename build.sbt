name := "scalajs-portfolio"

version := "0.1"

scalaVersion := "2.13.3"

enablePlugins(ScalaJSBundlerPlugin)
scalaJSUseMainModuleInitializer := true
npmDependencies in Compile += "snabbdom" -> "0.5.3"
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "1.7.5"

enablePlugins(ScalaJSPlugin)


npmDependencies in Compile ++= Seq(
  "react" -> "16.13.1",
  "react-dom" -> "16.13.1")