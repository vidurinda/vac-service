# Getting started with gRPC
 
 This sample rop for getting start with gRPC, in here you can get an idea about,
 
 -- Creating a gradle project to write proto files<br>
 -- Create new proto and write simple grpc service<br>
 -- publish the artifact to the local maven repository.<br>
 
 # Dependancies
 following dependencies are require to crete the proto files, generate the java code and write & execute the grpc services.
 
    implementation 'io.grpc:grpc-netty-shaded:1.39.0'
    implementation 'io.grpc:grpc-protobuf:1.39.0'
    implementation 'io.grpc:grpc-stub:1.39.0'
    
 * use the version availbe at the moment

You can creare a seperate project to manage only the proto files and publish the artifact as well as you can use the same project to implement your grpc service.
I am using this project to manage the protos and publish the artifact and use a different project to implement the grpc service.

# Artifact details
<pre>
  libArtifactGroup=com.ices.vac
  libArtifactId=vac-service
  libArtifactVersion=0.0.101
</pre>
all the details for artifact is there in the gradle.properties file

# Publish the artifact to the local maven 

<pre>
publishing {
    publications {
        mavenJava(MavenPublication) {
            from components.java
            artifactId = "${libArtifactId}"
        }
    }
}
</pre>

run the command <i>./gradlew clean build publishToMavenLocal</i> to publish to your local maven repository.

# Next 

use the following sample repository to learn the intergration of gRPC with Spring Boot.

https://github.com/vidurinda/medi-service
