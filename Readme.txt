HOW TO SETUP THE MICRO SERVICE

i. Create the service registry with string initializer and add Spring web and Eureka server dependency to it

ii.Open the Entry file and Annotate the class with @EnableEurekaServer then rename the application.property and rename to application.yaml and put required configuration

iii. Create the services with spring initializer and add Spring web, Eureka client and Actuator dependency to it

iv. Open the Entry file and Annotate the class with @EnableDiscoveryClient then rename the application.property and rename to application.yaml and put required configuration

