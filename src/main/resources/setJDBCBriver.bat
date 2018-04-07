set currentpath=%cd%
set currentpath=%currentpath:\=\\%
echo %currentpath%
mvn install:install-file -Dfile=%currentpath%\\ojdbc7.jar -DgroupId=com.oracle -DartifactId=ojdbc7 -Dversion=12.1.0 -Dpackaging=jar