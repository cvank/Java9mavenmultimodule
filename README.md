This is a simple Java 9 and multi maven module application.

It shows the creatrion of parent and child maven modules and how java 9 modules work along with maven modules.

Four child modules are created.

* apigateway
* domain
* service
* repository

All these are child maven modules of parent maven module * java9mavenmultimodule

from the pom files, you can observe that 

* apigateway depends on * service 
and
* service depends on * repository

* repository depends on * domain

Now, implementing the above with Java 9 modularization requires few extra steps to be done compared to a non-modularized Java application.

* Under each maven child module, create a java module by first creating a **moduel-info.java** (module descriptor.) under source root folder (src/main/java)
* create packages under source folder (src/main/java ) as usual.
* in **moduel-info.java** specify the dependencies and the packages that are exposed to other  modules.

Check out the source code for clear insight.
