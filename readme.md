# Playblog

Playblog is an blog webapp written with Scala , using playframework.

# Prequirement

You should have activator installed on your system, you can obtain it from https://www.typesafe.com/activator/download 

JDK7 + requrired, suggest you installed JDK8

MySQL 5.5+ required, for store all data into database

# Install 

You can run
```
git clone https://github.com/netroby/playblog.git
cd playblog
activator compile
```
This file will be packaged with your application, when using `activator dist`.

Then you need to configure mysql server connection information by  vi conf/application.conf 

# Run

activator run



