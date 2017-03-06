
lazy val root = (project in file("."))
  .settings(
      name := "GridTilesDemo",
      version := "1.0-SNAPSHOT",
      autoScalaLibrary := false,
      sourcesInBase := false,
      crossPaths := false,

      javacOptions ++= Seq("-source", "1.8"),
      libraryDependencies ++= Seq(
          "eu.hansolo" % "tilesfx" % "1.3.8",
          "com.airhacks" % "afterburner.fx" % "1.7.0"
      )
  )
