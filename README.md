BrickLink tools
===============

I wrote some tools for myself to ease my work selling LEGO bricks on BrickLink. Maybe this tools can help you with your daily work with
BrickLink, too.

Requirements
------------
- Maven
- PhantomJS

Compile
-------

First you need to compile the sources

    cd bricklink
    mvn compile

Configuration
-------------

Edit the file `bricklink/src/main/resources/bricklink.properties` and enter your BrickLink credentials. Furthermore you have to create your
OAuth API access keys, secrets and tokens and enter them in that configuration file, too. Please read
http://apidev.bricklink.com/redmine/projects/bricklink-api/wiki/Getting_Started to generate your BrickLink OAuth API access keys. You don't
need to register any notification URLs. Notifications are not used yet.

Usage
-----
### Part out a set
Part out a set can be very helpful with very new sets. Sometimes the inventory of these sets did not make their way yet into the BrickStore
database. If you want to part out such a set or if you want to use the BrickLink inventory of a set instead of the BrickStore ones, you can
use the following command to create a part out of a set. The arguments are the set number "71006-1" in this example and the multiplier how
much sets you want to part out.

    cd bricklink
    mvn exec:java -Dexec.mainClass="org.kleini.bricklink.PartOut" -DconfigurationFile=src/main/resources/bricklink.properties -Dexec.args="71006-1 10"

Support
-------

Have a question, or found an issue? Just create a issue: https://github.com/kleini/bricklink/issues

Author
------
Marcus Klein (<himself@kleini.org>)

Copyright and License
---------------------

```text
Copyright 2014 Marcus Klein

Licensed under the GNU General Public License, Version 3.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.gnu.org/licenses/gpl-3.0.html

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
