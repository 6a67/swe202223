bin = bin
src = aufgabe/src
pkg = $(src)/de/uos/inf/swe/
# sources are the java files inside the src folder
sources = $(shell find $(src) -name '*.java')
# classes have the same name as the source files but with .class extension and are in the bin directory
classes = $(patsubst $(src)/%.java, $(bin)/%.class, $(sources))

libbin = lib/bin
lang3 = $(libbin)/commons-lang3-3.12.0.jar
classpath = $(lang3):$(bin)

out_jar = aufgabe.jar


jar: $(out_jar)

$(out_jar): $(classes) manifest
	jar cfm $@ manifest.mf -C $(bin) .


manifest:
	echo "Manifest-Version: 1.0" > manifest.mf
	echo "Main-Class: de.uos.inf.swe.Main" >> manifest.mf
	echo "Class-Path: $(subst :, ,$(classpath))" >> manifest.mf


# wildcard rule for compiling all java files from the src folder to the bin folder
$(bin)/%.class: $(src)/%.java
	javac -d $(bin) $< -cp $(classpath) -implicit:none

run: jar
	java -jar $(out_jar)

clean:
	rm -rf $(bin)
	rm -f $(out_jar)
	rm -f manifest.mf
	rm -rf doc

doc: $(sources)
	javadoc -d doc -sourcepath $(src) $(pkg)*.java -cp $(classpath)

