set projectLocation=D:\Selenium-Project\Abhishek_Project\Workspace\TestNg _Project

cd %projectLocation%

set classpath=%projectLocation%\bin;%projectLocation%\lib\*

java org.testng.TestNG %projectLocation%\testng.xml

pause