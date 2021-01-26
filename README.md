BrickLink tools
===============

I wrote some tools for myself to ease my work selling LEGO bricks on BrickLink. Maybe this tools can help you with your daily work with
BrickLink, too.

Build status
------------
[![CircleCI](https://circleci.com/gh/kleini/bricklink.svg?style=shield)](https://circleci.com/gh/kleini/bricklink)

Requirements
------------
- Gradle
- PhantomJS, Firefox
- Chrome 88 for headless mode
- ChromeDriver 88 for headless mode

Compile
-------

First you need to compile the sources

    gradle assemble

Configuration
-------------

Edit the file `bricklink/src/main/resources/configuration.properties` and enter your BrickLink credentials. Furthermore you have to create your
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

    gradle partout 71006-1 10

OnlineFrankierung
-

DHL Privatekunden API WSDL import.

OneClickForApp
-

WSDL import of internet stamp creation of DP DHL.

Dataobjects
-

DP DHL product information webservice.


Support
-------

Have a question, or found an issue? Just create a issue: https://github.com/kleini/bricklink/issues

