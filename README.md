## Maven Archetypes

To use an archetype:

    mvn archetype:generate -DarchetypeCatalog=local \
      -DarchetypeArtifactId=android-app \
      -DarchetypeGroupId=com.twotoasters \
      -DgroupId=org.example \
      -DartifactId=ToasterApp \
      -Dpackage=org.example.toasted

    cd ToasterApp
    mvn clean install
    mvn android:deploy
    mvn android:run

Same for a Scala Android app:

    mvn archetype:generate -DarchetypeCatalog=local \
      -DarchetypeArtifactId=scala-app \
      -DarchetypeGroupId=com.twotoasters \
      -DgroupId=org.example \
      -DartifactId=ToasterScalaApp \
      -Dpackage=org.example.toasted

    cd ToasterScalaApp
    mvn clean install
    mvn android:deploy
    mvn android:run

To update an archetype in your local maven repository:

    cd android-app
    mvn clean install

    cd scala-app
    mvn clean install
