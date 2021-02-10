val graphqlKotlinClientVersion = "3.7.0"

group = "org.example"
version = "1.0-SNAPSHOT"

plugins {
    kotlin("jvm") version "1.3.72"
    id("com.expediagroup.graphql") version "3.7.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.expediagroup:graphql-kotlin-client:$graphqlKotlinClientVersion")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "1.8"
}

val graphqlGenerateClient by tasks.getting(com.expediagroup.graphql.plugin.gradle.tasks.GraphQLGenerateClientTask::class) {
    packageName.set("org.example.generated")
    schemaFile.set(file("${project.projectDir}/src/main/resources/schema.graphqls"))
}

