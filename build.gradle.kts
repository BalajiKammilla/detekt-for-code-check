plugins {
    kotlin("jvm") version "1.9.23"
    //    -- Add detekt plugin --
    id("io.gitlab.arturbosch.detekt") version "1.23.6"  //addplugIn
}

/* -- Option-2 --
detekt {
    config = files("detekt.yml") // optional custom rules
    buildUponDefaultConfig = true
}
and run ./gradlew detektGenerateConfig will generate detekt.yml under root
then run ./grdale detek to check the code rules
-- */
group = "org.balu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    /* Option-1 without detekt.yml file
       -- detekt cli to run Detekt locally via Gradle, you need at least the detekt-cli --
       --want formatting rules (detekt-formatting). -- */
    detekt("io.gitlab.arturbosch.detekt:detekt-cli:1.23.8")
    detekt("io.gitlab.arturbosch.detekt:detekt-formatting:1.23.8")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}