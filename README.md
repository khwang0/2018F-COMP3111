# Webscraper

## Compile

We configure the project with Gradle. Gradle can be considered as Makefile like tools that streamline the compilation for you. In this project you
are not required to learn how to write Gradle file. If you are interested to know how, please check out [this link](http://www.vogella.com/tutorials/Gradle/article.html).

### Compile with Windows Command Prompt (Recommended)

Goto your folder and type `gradlew build`. It takes some times when you first run it. Under the folder `\build\jar\` there should be a 
jar file (e.g. `webscraper-0.1.0.jar`). Try double click on it (yes, you need a GUI screen to run it). 

### Compile with Mac/Linux terminal (Recommended)

Goto your folder and type `./gradlew build`. It takes some times when you first run it. Under the folder `\build\jar\` there should be 
a jar file (e.g. `webscraper-0.1.0.jar`). Try double click on it (yes, you need a GUI screen to run it). 

### Compile with Eclipse

You are recommended to download the [Eclipse Photon for Windows](http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/photon/RC3/eclipse-dsl-photon-RC3-win32-x86_64.zip). 
This version of eclipse supports Gradle out of the box.  Create a new `project` -> `Gradle Project` and drag everything from the given base code 
to it. Click `Run` -> `Run Configurations...` and double click on `Gradle Project`. In the box `Gradle Tasks` type `execute` and click `run` at the bottom.
Next time, just click the run button in the menu bar and it should run.

## Tasks

### Mandatory Tasks

1. Fill in the tab Summary
	1. A clickable URL in the field Lowest Selling Price and Latest Post.
		1.1 Pop up a windows/browser showing that item.
1. Work on other existing local/international selling/reselling portals (e.g. [carousell](https://hk.carousell.com), [dcfever](https://www.dcfever.com/trading/search.php), [preloveled](https://preloved.co.uk), [taobao](https://www.taobao.com) or any similar webpage. Please noted that we only accept website in English or Chinese)
1. Save and load your search. A search record can be saved into a file (no requirement on the file format). When the program restarts and the saved file is loaded, it will be able to reconstruct the same List of search result `List<Item>` - so that the number of items, the content of the items and the order of the item will be preserved.
1. 


