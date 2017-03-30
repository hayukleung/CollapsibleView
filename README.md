# CollapsibleView
A Collapsible View Base on RecyclerView.

## how

### maven
```
<?xml version="1.0" encoding="UTF-8" ?>
<settings xsi:schemaLocation='http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd'
          xmlns='http://maven.apache.org/SETTINGS/1.0.0' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'>
    
    <profiles>
        <profile>
            <repositories>
                <repository>
                    <snapshots>
                        <enabled>false</enabled>
                    </snapshots>
                    <id>bintray-hayukleung-maven</id>
                    <name>bintray</name>
                    <url>http://dl.bintray.com/hayukleung/maven</url>
                </repository>
            </repositories>
            <pluginRepositories>
                <pluginRepository>
                    <snapshots>
                        <enabled>false</enabled>
                    </snapshots>
                    <id>bintray-hayukleung-maven</id>
                    <name>bintray-plugins</name>
                    <url>http://dl.bintray.com/hayukleung/maven</url>
                </pluginRepository>
            </pluginRepositories>
            <id>bintray</id>
        </profile>
    </profiles>
    <activeProfiles>
        <activeProfile>bintray</activeProfile>
    </activeProfiles>
</settings>
```
```
<dependency>
  <groupId>com.github.hayukleung</groupId>
  <artifactId>collapsible-view</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

### gradle
```
repositories {
    maven {
        url  "http://dl.bintray.com/hayukleung/maven" 
    }
}
```
```
compile 'com.github.hayukleung:collapsible-view:1.0.0'
```

### ivy
```
<dependency org='com.github.hayukleung' name='collapsible-view' rev='1.0.0'>
  <artifact name='collapsible-view' ext='pom' ></artifact>
</dependency>
```
