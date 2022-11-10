
# formatter-tool
A small tool for formatting text

## Description
This java application takes program arguments as alignment and output width respectively and reads text from standard in 
and produces the formatted output to the console.
Alignments supported are left, right and center as of now.
Output width is integer from 1 to 2^31-1.

##### This project when build produces jar and jar file can be run as below.
 **java -jar build/libs/formatter.jar left 10**

## Areas to improve
* More alignments can be added easily by extending AbstractAlignment class
* This service can be used as library or can be converted as spring boot restful webservice to perform format operation


