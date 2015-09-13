@rem ##########################################################################
@rem
@rem  Setup script for Windows
@rem
@rem ##########################################################################

@rem check for existing JAVA_HOME
if defined JAVA_HOME goto runSetup

@rem try locating 64 bit jdk 1.8.0_60
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_60
if exist "%JAVA_HOME%" goto runSetup

@rem try locating 32 bit jdk 1.8.0_60
set JAVA_HOME=C:\Program Files (x86)\Java\jdk1.8.0_60
if exist "%JAVA_HOME%" goto runSetup

@rem bail
echo .
echo ERROR: JAVA_HOME is not set and could not be guessed.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:runSetup

@rem setup gradlew
gradlew setupDecompWorkspace
gradlew eclipse

goto mainEnd

:fail
exit /b 1

:mainEnd
