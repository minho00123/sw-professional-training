@echo off
cls
set /p filenumber=Enter your file number:
javac -encoding utf8 Ex%filenumber%.java
java Ex%filenumber%
pause
del *.class