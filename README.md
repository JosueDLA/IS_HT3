# Ingenieria de Software Hoja de Trabajo #3 Parte I
Hoja de trabajo #3 Parte I Ingeniería de Software


 Alumno: Josué Ismael de León Azurdia
 
 Carne: 1290-15-11788

Unit Testing Calculating the Product of an Array
- When Basic Input - Then Basic Output
- When Empty Input - Then Empty Output
- When Single Zero Input - Then Single One Output
- When Single One Input - Then Single One Output
- When Duo Input - Then Duo Output
- When Null Input - Then Null Output
- When Zero Length Input - Then Zero Length Output
- When Multiple Zeros Present Input - Then All Zeros Output
- When Single Zero Present Input - Then Single Value Present Output

## Docker
### Docker Containers
* josuedla/isht3

### Download Docker Image
```sh
> sudo docker pull josuedla/isht3
```

### Run Docker Image 
```sh
> sudo docker run josuedla/isht3
```

### Dockerfiles
#### Estudiantes
```sh
FROM openjdk:8-jre-alpine
ADD IS_HT3-1.0-SNAPSHOT-jar-with-dependencies.jar isht3.jar
CMD ["java", "-jar", "isht3.jar"]
```

## Dependency
```xml
<build>
    <plugins>
        <plugin>
            <artifactId>maven-assembly-plugin</artifactId>
            <version>3.0.0</version>
            <configuration>
                <descriptorRefs>
                    <descriptorRef>jar-with-dependencies</descriptorRef>
                </descriptorRefs>
                <archive>
                    <manifest>
                        <mainClass>gt.edu.umg.ingenieria.sistemas.is_ht3.ProductArrayApplication</mainClass>
                    </manifest>
                </archive>
            </configuration>
            <executions>
                <execution>
                    <id>make-assembly</id>
                    <!-- this is used for inheritance merges -->
                    <phase>package</phase>
                    <!-- bind to the packaging phase -->
                    <goals>
                        <goal>single</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```
