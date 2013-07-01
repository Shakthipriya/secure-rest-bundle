secure-rest-bundle
==================

* Secure RESTful service (OSGI bundle) with basic authentication and authorization
* Uses the default Karaf JAAS realm for users and roles
* Works on Karaf 2.3.1


### Prerequisites
Install CXF on the Karaf console:

    features:chooseurl cxf 2.7.5
    features:install http cxf
