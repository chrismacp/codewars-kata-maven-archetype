# codewars kata-maven-archetype

Build a kata template quickly using a maven archetype

## Get started

1. Checkout
    $ git clone git@github.com:chrismacp/codewars-kata-maven-archetype.git

2. Install

    $ cd codewars-kata-maven-archetype
    $ mvn install

3. Generate
Switch out of archetype directory and generate.

Note:
If you don't do this you get the confusing error "org.apache.maven.archetype.exception.InvalidPackaging: Unable to add module to the current project as it is not of packaging type 'pom'" 

    $ cd ..
    $ mvn archetype:generate -DarchetypeCatalog=local

4. Get cracking

