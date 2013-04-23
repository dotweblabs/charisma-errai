Charisma-Errai
=======================

This is Charisma ported to GWT using JBoss Errai. 

Charisma is a free, premium quality, responsive, multiple skin admin template.
See: https://github.com/usmanhalalit/charisma

Try It Out
==========

To try it in dev mode, ensure you have Maven 3 installed, then type the following at a command prompt:

    % mvn gwt:run

To build a .war file that you can deploy to JBoss EAP 6, AS 7 or the OpenShift cloud:

    % mvn clean package -Pjboss7

Then copy target/charisma-errai-0.0.1-SNAPSHOT.war to the appropriate location.

TODO:
=====

* A lot of things like migrating the Javascript methods and data-binding the template with GWT methods.
