# REST DataStore Shared Module Sample

This project is an example of sharing code between the server and client applications that use the Jmix REST DataStore for integration.  

**Shared-addon** is a Jmix add-on with JPA entities, a service interface and a role.

**Products** is a server application. It includes the shared add-on in a standard manner without any specific configuration.

**Orders** is a client application. It includes the shared add-on and configures it as follows:

- [build.gradle](orders/build.gradle) excludes the shared entities package from JPA mapping in `jmix.entitiesEnhancing.nonJpaPackages` property. Another option would be to exclude individual classes in `jmix.entitiesEnhancing.nonJpaClasses` property.  
- [SharedEntitiesConfigurer.java](orders/src/main/java/com/company/orders/SharedEntitiesConfigurer.java) sets `products` REST DataStore as a data store for the add-on's entities.
- [SharedServicesConfigurer.java](orders/src/main/java/com/company/orders/SharedServicesConfigurer.java) adds a scanner filter to find the add-on's service interfaces for making client proxies. It also defines the store name for the service interfaces.
