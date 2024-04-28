# mock-worldline-task1

1.Create Maven Project in Eclipse:
Open Eclipse and select "File" > "New" > "Maven Project".
Choose "Create a simple project" and click "Next".
Enter Group Id: com.example and Artifact Id: ecommerce-search-testing.
Click "Finish" to create the project.

2.Add Dependencies:
Open the pom.xml file and add the following dependencies:
xml
![Screenshot (1639)](https://github.com/shindenikhil659/mock-worldline-task1/assets/95039067/1bf40658-5c1d-4284-9557-76f999e6f772)

3. Create Feature File:
Right-click on the "src/test/resources" folder and select "New" > "File".
Name the file "search.feature" and add the following content


![Screenshot (1641)](https://github.com/shindenikhil659/mock-worldline-task1/assets/95039067/3c8918ca-3941-45a7-8a62-4844ee435a8f)

4.Create Step Definitions:
Right-click on the "src/test/java" folder and create a package named "stepDefinitions".
Inside the "stepDefinitions" package, create a Java class named "SearchSteps" 
Read Data from Excel:
Right-click on the "src/test/resources" folder and create a new folder named "testdata".
Place the Excel file with the test data (e.g., "products.xlsx") inside the "testdata" folder.
Add the Apache POI library for Excel to the project's build path.
Modify Step Definitions to Read from Excel:
Modify the SearchSteps class to read test data from the Excel file:
java
![image](https://github.com/shindenikhil659/mock-worldline-task1/assets/95039067/588e933d-ff1b-4373-93fc-00506644340d)

![image](https://github.com/shindenikhil659/mock-worldline-task1/assets/95039067/91253e04-3e44-45c9-af2a-041b0941874d)

