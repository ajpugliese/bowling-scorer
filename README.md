# Bowling Scorer

A Scala application to score a bowling game using functional programming techniques.

Tail recursion is used to iterate through 10 bowling frames inputed as a List of integers. Each integer represents a roll in the game.
Inside the recursion, pattern matching with guarding is used to determine if a frame is either a strike, spare, or 2 roles.

If the frame is a strike that frame plus the next two rolls are summed for the frame score and the roll for the strike is dropped from the list.

If the frame is a spare the two rolls for that frame  plus the next roll are summed for the frame score and the rolls for the spare are dropped from the list.

If the frame is neither a strike or a spare the two rolls for that frame are summed for the frame score and the rolls for the frame are dropped from the list.

The recursive method accumulates the scores for each frame and outputs the value when ten frames have been iterated through.

This code repository is at https://github.com/ajpugliese/bowling-scorer

## Getting Started

The following are required to get a copy of the project up and running on your local machine for development and testing purposes.

### Required Files / Packages

IntelliJ IDEA 2018.1.6 or greater

Scala Jetbrains plugin

SBT 1.2.6

ScalaTest 3.0.5

## Deploying an executable jar file

* From SBT shell

```
assembly
```


## Running the application

* From SBT shell

```
run 10,10,10,10,10,10,10,10,10,10,10,10
```

* From OS command line (jar is located in bowling-scorer/target/scala-2.12 directory)

```
java -jar bowling-scorer-assembly-0.1.jar 10,10,10,10,10,10,10,10,10,10,10,10
```


* Application output

```
Score for game (10,10,10,10,10,10,10,10,10,10,10,10):300
```

## Running Tests

* From SBT shell

```
test
```
