# Contributing to LPCalc

## Build

Build with Ant from the repo root, or run the prebuilt jar (see the [README](README.md)):

```bash
ant
java -jar LPCalc.v2.0.jar
```

Or open the NetBeans project (`nbproject/`) and run the GUI.

## Where to change what

- Operations: `src/calc/CalcOperations.java`
- GUI: `src/gui/MainGUI.java`
- Event handling: `src/listeners/`

## Pull requests

Create a branch from `master`, keep the change focused, and verify the calculator by hand for the operations you touched (note the cases you tried in the PR).
