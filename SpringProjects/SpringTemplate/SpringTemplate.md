# Setting up a Spring app
- Create project folder


- File -> New Spring Starter Project
  - Name: ____
  - Java Version: 8
  - Packaging: War
  - Group: com.company.projectName
  - Artifact: projectName
  - Description: ____
  - Package: same as group
  
# folder construction
- Create src/main/webapp if it is not already made upon project creation
- Create src/main/webapp/WEB-INF
- Edit src/main/resources/applications.properties with
```xml
spring.mvc.view.prefix=/WEB-INF/
```

# pom.xml file
  - add the following dependencies
```xml
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
</dependency>

<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
    <scope>provided</scope>
</dependency>

<!-- for bootstrap -->
<dependency>
    <groupId>org.webjars</groupId>
    <artifactId>webjars-locator</artifactId>
    <version>0.30</version>
</dependency>

<!-- BOOTSTRAP DEPENDENCIES -->
<dependency>
    <groupId>org.webjars</groupId>
    <artifactId>bootstrap</artifactId>
    <version>5.0.1</version>
</dependency>
<dependency>
    <groupId>org.webjars</groupId>
    <artifactId>jquery</artifactId>
    <version>3.6.0</version>
</dependency>
```
# ___.jsp file
- add following to top of code to use c:out
```html
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!-- for bootstrap -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
```

# connecting css and js to jsp file
```html
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>
```