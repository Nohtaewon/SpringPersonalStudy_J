# SpringPersonalStudy_J
### 설정
1. JavaConfiguration
    1. xml 파일 삭제 > pom.xml 에 다음과 같은 내용 plugins 내에 추가, spring version 도 변경
    ```
     <groupId>org.apache.maven.plugins</groupId>
     <artifactId>maven-war-plugin</artifactId>
     <version>3.2.0</version>
     <configuration>
         <failOnMissingWebXml>false</failOnMissingWebXml>
     </configuration>
    ```   
    2. java 설정을 이용하는 경우 어노테이션을 이용해서 해당 클래스의 인스턴스를 이용해 설정파일을 대신한다.
    3. web.xml을 대신하는 클래스 작성
        - WebConfig 클래스 생성
        - AbstractAnnotaionConfigDispatcherServletInitializer 라는 이름의 추상클래스를 상속
