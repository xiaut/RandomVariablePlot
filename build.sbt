name := "RandomVariablePlot"

version := "0.1"

scalaVersion := "2.13.5"

enablePlugins(ScalaJSPlugin)
scalaJSUseMainModuleInitializer := true
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.1.0"

resolvers += Resolver.jcenterRepo
libraryDependencies += "org.openmole" %%% "scala-js-plotlyjs" % "1.5.1"

resolvers += Resolver.mavenCentral
libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.9.1"
