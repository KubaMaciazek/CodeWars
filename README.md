# Overview
Repository contains implementation of a "material" function along with related tests, which are part of CodeWars competition of Sofixit company.

# Project structure

This is a Gradle based Java 11 project. Tests were implemented using JUnit library.

Material function implementation can be found under *src/main/java/org/example/Material.java* directory. Related tests are available under *src/test/java/org/example/MaterialTest.java* directory.

# Algorithym computational complexity

Algorithym computational complexity is O(N). More precisely O(3N), as it first computates prominance from left to right, then, if relevant, computates reversed prominance. Finally, it returns sum of all computated local prominences. 

