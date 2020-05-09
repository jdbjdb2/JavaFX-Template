# javaFX-Template
![GitHub](https://img.shields.io/github/license/jdbjdb2/javaFX-Template)
![Language](https://img.shields.io/badge/Language-Java-red)
![Libraries](https://img.shields.io/badge/Libraries-JavaFX-blue)
![IDE Tested](https://img.shields.io/badge/IDE's%20tested-Eclipse%2FIntelliJ%20IDEA%20Community%2FNetBeans%2FCompiled%20in%20terminal-blueviolet)
---
### Requirements:
  - JavaFX installed or relevant JavaFX modules
  
### How to use:
  - Open files as project using IDE
  - Change generic package name for project's package
  - Rename references to project files (e.g. rename *Main.fxml* to *Menu.fxml* if necessary)
  - Update *fx:controller* reference to project controller (found in [*Main.fxml*](Main.fxml)
  - Add JavaFX library or relevant modules to the project libraries
  - In VM options include:
      ```bash
      --module-path <insert path to javafx lib> --add-modules javafx.fxml,javafx.controls
       ```
  - Now add nodes to fxml and handle GUI interactions with [*Controller.java*](Controller.java)
  - Some styles can be edited using either
      + [*application.css*](application.css) and the classes or ids given to node in the fxml 
      
        or
      
      + Using JavaFX styling on a per-node basis
---      
### Scene Builder
[Scene Builder](https://github.com/gluonhq/scenebuilder) can be used to simplify the adding of nodes to the fxml file.
To use, just *open the file with an external tool* then navigate to *SceneBuilder.exe*. 

After that, add/edit/delete nodes as required and save the changes in Scene Builder before compiling the program again.

       Note, sometimes you must re-open the fxml file in the ide for the changes to take place (I found this with Eclipse IDE)
