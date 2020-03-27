# Elevens

## Activity 5 Instructions

Each of the folders Buggy1 through Buggy5 contain already compiled, runable code with logic errors, and the source files.
Your job is to run the Tester programs, then correct the runtime problems that you encounter.

To run the code, first move to the proper folder, then run the code normally (no need to compile the tester).

Example for Buggy1:

```
 $ cd Buggy1
 $ java DeckTester
```

You should see:

```
<<<<<<< HEAD
$ git fetch upstream a1
$ git checkout -b a1 upstream/a1
=======
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1
	at java.util.ArrayList.elementData(ArrayList.java:418)
	at java.util.ArrayList.get(ArrayList.java:431)
	at Deck.deal(Deck.java:85)
	at DeckTester.testEmpty(DeckTester.java:99)
	at DeckTester.test1CardDeck(DeckTester.java:28)
	at DeckTester.main(DeckTester.java:12)
>>>>>>> upstream/a5
```

Next, fix the error(s).

Then compile and run as usual:

```
 $ javac DeckTester.java
 $ java DeckTester
```

Continue until the code runs as expected.

## Submitting

Commit all local changes, then (replace # with the current activity number):
```
$ git push origin a#
```

## Switching to the next activity

<<<<<<< HEAD
### Activities 1-5

Change the # to the number of the activity you want to grab.

```
$ git fetch upstream a#
$ git checkout -b a# upstream/a#
```

### Later Activities

The remaining activities have not all been pushed because each activity builds on the next. Sometimes activities have working versions of the problems from the previous activities.

To move to the next activity, show your completed solution to your instructor. He will then push a branch for you to use for the next activity. The branch name will be formatted like this: `<your github username>-a#`. For example, Abe Lincoln would move to activity 6 with this command:
```
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
$ git fetch upstream four_score-a4
$ git checkout -b a4 upstream/four_score-a4
=======
$ git fetch upstream four_score-a6
$ git checkout -b a6 upstream/four_score-a6
>>>>>>> c2521a215f428d7523731602a38497b255616eaf
=======
$ git fetch upstream four_score-a6
$ git checkout -b a6 upstream/four_score-a6
>>>>>>> e85ad34f98e9752124cb4b4503b5f37e666971f7
=======
$ git fetch upstream four_score-a6
$ git checkout -b a6 upstream/four_score-a6
>>>>>>> b9ce2b5449357d79ab7db9cc6163dfec2757e05a
```
=======
```
$ git fetch upstream a#
$ git checkout -b a# upstream/a#
```
>>>>>>> upstream/a5
