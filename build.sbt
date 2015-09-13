name := "mmds"

version := "1.0"

scalaVersion := "2.11.7"

//libraryDependencies += "com.twitter" % "algebird-core_2.11" % "0.11.0"


libraryDependencies  ++= Seq(
  "org.scalanlp" %% "breeze" % "0.11.2"
 )

resolvers ++= Seq(
  "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
)
    