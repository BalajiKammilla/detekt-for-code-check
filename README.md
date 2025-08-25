# DETEKT-FOR-CODE-ANALYSIS
Detekt is used only for Kotlin Projects

### How to Configure Detekt
Detekt can be configure using two ways

- by Adding *PlugIn* and *Detekt CLI* and *Detekt Formating* rules configurations in **build.gradle.kts**
```
  plugins {
    kotlin("jvm") version "1.9.23"
    id("io.gitlab.arturbosch.detekt") version "1.23.6" 
}
dependencies {
    detekt("io.gitlab.arturbosch.detekt:detekt-cli:1.23.8")
    detekt("io.gitlab.arturbosch.detekt:detekt-formatting:1.23.8")
}
 ```
- Then Run **./gradlew detek** this will check the code to align the rule set code implementation.

  
- by Adding *PlugIn* and Detekt confiration for *Detekt.yml* path which will Generate **Detekt.yml** file
```
plugins {
    kotlin("jvm") version "1.9.23"
    id("io.gitlab.arturbosch.detekt") version "1.23.6" 
}
detekt {
    config = files("/detekt.yml") // optional custom rules
    buildUponDefaultConfig = true
}
```
- Run **./gradlew detekGenerateConfig** will generate a Detek.yml file
- Then Run **./gradlew detek** this will check the code to align the rule set code implementation.

