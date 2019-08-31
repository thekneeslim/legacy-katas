#Introduction

Through the course of a programmer's career, we will definitely touch code which is not written by us. The legibility of this code base varies between environments, however, in order to maintain and introduce new functionality, refactoring will definitely be required.

The problem therefore lies in how we can go about making the legacy code more legible and extensible, whilst not compromising on old functionlities?

This repository therefore holds legacy katas to practice systematic, disciplined refactoring.

## Recommended Approach

Base tests have been set to ensure that the functionality remains the same. When going about refactoring, try to adhere to the following rules:-

1) No big bang changes. Each refactoring (i.e. extraction/creation of methods, classes, etc) should be done systematically
2) After each bite size change, run the tests to make sure everything still passes
3) Leverage on your IDE to refactor (if you use Intellij, `cmd + shift + a` will be your best friend) 

