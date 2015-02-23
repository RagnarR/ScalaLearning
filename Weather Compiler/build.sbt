name := "Weather Compiler"

version := "1.0"

scalaVersion := "2.11.5"

resolvers ++= Seq(
  "spray repo" at "http://repo.spray.io",
  "spray nightlies repo" at "http://nightlies.spray.io"
)

libraryDependencies ++= Seq(
  "io.spray"            %%  "spray-can"     % "1.3.x" withSources() withJavadoc(),
  "io.spray"            %%  "spray-routing" % "1.3.x" withSources() withJavadoc(),
  "io.spray"            %%  "spray-json"    % "1.3.x",
  "io.spray"            %%  "spray-testkit" % "1.3.x" % "test",
  "com.typesafe.akka"   %%  "akka-actor"    % "2.4-SNAPSHOT",
  "com.typesafe.akka"   %%  "akka-testkit"  % "2.4-SNAPSHOT" % "test"
)
    