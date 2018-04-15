# aws-rds-springboot-webapp
A simple Spring-boot WebApp which used amazon rds.


To Deploy this project:

Use amazon Elastic Beanstalk, just make the war file of the project and deploy that war file to the BeanStalk.

NOTE:
1.Make sure your BeanStalk and RDS instance are using same security group.
2.Make the tables in the RDS as mapped in src/main/java/paper/model package. Here is two pojo classes(Driver and Customer). So make these tables with given column name in the databases.
