plugins {
  id("org.sonarqube") version "4.0.0.2929"
}
    
repositories {
  jcenter()
}

sonar {
  properties {
    property("sonar.projectKey", "nicename")
    property("sonar.projectName", "nicename")
  }
}
