<<<<<<< HEAD
JC = javac
.SUFFIXES: .java .class
.java.class:
        $(JC) $(JFLAGS) $*.java

CLASSES = \
        Car.java \
        Lane.java \
        Light.java \
        Simulation.java\
        TrafficSystem.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
=======
JC = javac
.SUFFIXES: .java .class
.java.class:
        $(JC) $(JFLAGS) $*.java

CLASSES = \
        Car.java \
        Lane.java \
        Light.java \
        Simulation.java\
        TrafficSystem.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
>>>>>>> origin/master
        $(RM) *.class