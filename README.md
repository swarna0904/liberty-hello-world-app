# IBM Client Developer Advocacy App Modernization Series

## Simple Hello World app to demo  WebSphere Liberty in Docker

This small Java EE app supports the lab [HTTP Session Replication Lab for the App Modernization Dojo](https://github.com/IBMAppModernization/app-modernization-session-replication-openshift) on OpenShift.


### Building the app

You'll need the following to build the app from source:
- A Java 8 (or later) JDK
- [Maven 3.3 (or later)](https://maven.apache.org/download.cgi)

To build the app from source  run the following command from the top level folder of a clone of this repo :
    ```
    mvn clean package
    ```

This will create the app's *.war* file in the **target** subfolder.

### Running the app

Refer to the [lab instructions](https://github.com/IBMAppModernization/app-modernization-session-replication-openshift) in the accompanying lab exercise to run the app on Docker.
