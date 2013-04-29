## Android Archetypes

To use an archetype:

    mvn archetype:generate -DarchetypeCatalog=local \
      -DarchetypeArtifactId=toaster-app \
      -DarchetypeGroupId=com.twotoasters \
      -DgroupId=org.example \
      -DartifactId=ToasterApp \
      -Dpackage=org.example.toasted

    cd ToasterApp
    mvn install
    mvn android:deploy
    mnv android:run

To update an archetype:

    cd toaster-app
    mvn install
