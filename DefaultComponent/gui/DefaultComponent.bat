echo off

set RHAP_JARS_DIR=C:/Program Files/IBM/Rational/Rhapsody/8.0/Share\LangJava\lib
set FRAMEWORK_NONE_JARS=C:/Program Files/IBM/Rational/Rhapsody/8.0/Share\LangJava\lib\oxf.jar;C:/Program Files/IBM/Rational/Rhapsody/8.0/Share\LangJava\lib\anim.jar;C:/Program Files/IBM/Rational/Rhapsody/8.0/Share\LangJava\lib\animcom.jar;C:/Program Files/IBM/Rational/Rhapsody/8.0/Share\LangJava\lib\oxfInstMock.jar;
set FRAMEWORK_ANIM_JARS=C:/Program Files/IBM/Rational/Rhapsody/8.0/Share\LangJava\lib\oxf.jar;C:/Program Files/IBM/Rational/Rhapsody/8.0/Share\LangJava\lib\anim.jar;C:/Program Files/IBM/Rational/Rhapsody/8.0/Share\LangJava\lib\animcom.jar;C:/Program Files/IBM/Rational/Rhapsody/8.0/Share\LangJava\lib\oxfInst.jar;
set SOURCEPATH=%SOURCEPATH%
set CLASSPATH=%CLASSPATH%;.
set PATH=%RHAP_JARS_DIR%;%PATH%;
set INSTRUMENTATION=Animation   

set BUILDSET=Debug

if %INSTRUMENTATION%==Animation goto anim

:noanim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_NONE_JARS%
goto setEnv_end

:anim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_ANIM_JARS%

:setEnv_end

if "%1" == "" goto compile
if "%1" == "build" goto compile
if "%1" == "clean" goto clean
if "%1" == "rebuild" goto clean
if "%1" == "run" goto run

:clean
echo cleaning class files
if exist Default\OdbiornikIRDA.class del Default\OdbiornikIRDA.class
if exist Default\odbiorDanych.class del Default\odbiorDanych.class
if exist Default\Pilot.class del Default\Pilot.class
if exist Default\przycisk_plus.class del Default\przycisk_plus.class
if exist Default\temperatureNotify.class del Default\temperatureNotify.class
if exist Default\Grzalka.class del Default\Grzalka.class
if exist MainDefaultComponent.class del MainDefaultComponent.class
if exist Default\pobierzDane.class del Default\pobierzDane.class
if exist Default\reset.class del Default\reset.class
if exist Default\Wentyl.class del Default\Wentyl.class
if exist Default\wentylNotify.class del Default\wentylNotify.class
if exist Default\Wiatrak.class del Default\Wiatrak.class
if exist Default\awaria.class del Default\awaria.class
if exist Default\CzujnikTemp.class del Default\CzujnikTemp.class
if exist Default\Kompresor.class del Default\Kompresor.class
if exist Default\przycisk_nacisniety.class del Default\przycisk_nacisniety.class
if exist Default\Default_pkgClass.class del Default\Default_pkgClass.class
if exist Default\Pomieszczenie.class del Default\Pomieszczenie.class
if exist Default\przycisk_minus.class del Default\przycisk_minus.class
if exist Default\Klimatyzator.class del Default\Klimatyzator.class

if "%1" == "clean" goto end

:compile   
if %BUILDSET%==Debug goto compile_debug
echo compiling JAVA source files
javac  @files.lst
goto end

:compile_debug
echo compiling JAVA source files
javac -g  @files.lst
goto end

:run

java %2

:end


