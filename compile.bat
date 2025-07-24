@echo off
REM Compile all Java files in src folder into out folder

if not exist out (
    mkdir out
)

javac -d out src\*.java

echo Compilation complete. Class files are in the 'out' directory.
pause
