# LPCalc

Java LPCalc app: a desktop calculator built with a Swing GUI.

## Structure

- `src/calc/CalcOperations.java` - calculator operations
- `src/gui/MainGUI.java` - the main window and entry UI, with icons under `src/gui/`
- `src/listeners/` - UI event listeners

## Build and run

The project ships with an Ant build file (`build.xml`), a NetBeans project (`nbproject/`), and a prebuilt `LPCalc.v2.0.jar`:

```bash
ant
java -jar LPCalc.v2.0.jar
```

Or open the project in NetBeans and run the main GUI class. Build output is written under `build/` and `dist/`.

## License

GNU General Public License v2.0. See [LICENSE](LICENSE).
