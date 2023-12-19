#!/bin/zsh
errorcheck(){
	if [ $1 -ne 0 ]; then
		exit $1
	fi
}

CLASSES=../answer/classes
JARFILE=myanswer.jar

if [ ! -d ${CLASSES} ]; then
	mkdir ${CLASSES}
	errorcheck $?
fi

javac -d $CLASSES -encoding UTF-8 ../answer/src/Answer010.java
errorcheck $?
jar cvf myanswer.jar ../answer/classes/*.class
errorcheck $?
