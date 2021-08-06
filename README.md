# README


## Installing Maven
```bash
sudo apt update
sudo apt install maven

```
### Verify the Installation
```bash
mvn -version
```

### Setup the Environment Variable
 We open the command terminal and edit the .bashrc file using the below command.
```bash
nano ~/.bashrc 
```
Add maven-specific lines to the file.

```bash
export M2_HOME=/usr/local/apache-maven/apache-maven-3.3.9
export M2=$M2_HOME/bin
export MAVEN_OPTS=-Xms256m -Xmx512m
export PATH=$M2:$PATH 
```

## Clone the Github Repository

Use the clone command to clone the repository.
```bash
git clone https://github.com/DipayanP007/Assignment-Maven.git
```

## Executing the code

### Change the working directory to the cloned directory
```bash
cd ../Assignment-Maven
```
#### Change directory to cal-api module
```bash
cd cal-api/
```

##### Run the following commands

```bash
mvn clean compile
mvn package
mvn install
```
#### Change directory to cal-impl module
```bash
cd cal-impl/
```

##### Run the following commands to execute the JAVA program

```bash
mvn clean compile
mvn exec:java
```
