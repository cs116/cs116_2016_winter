To create and use jar file
1. make sure manifest file has carriage return after last line!
2. jar cfm HelloWorld.jar HelloWorldManifest.txt HelloWorld.class
3. java -jar HelloWorld.jar

From: http://docs.oracle.com/javase/6/docs/technotes/guides/jar/jarGuide.html
What is JAR?
JAR stands for Java ARchive. It's a file format based on the popular 
ZIP file format and is used for aggregating many files into one. 
Although JAR can be used as a general archiving tool, the primary motivation 
for its development was so that Java applets and their requisite components 
.class files, images and sounds) can be downloaded to a browser in a single 
HTTP transaction, rather than opening a new connection for each piece. 
This greatly improves the speed with which an applet can be loaded onto 
a web page and begin functioning. The JAR format also supports compression, 
which reduces the size of the file and improves download time still further. 
Additionally, individual entries in a JAR file may be digitally signed by 
the applet author to authenticate their origin.

