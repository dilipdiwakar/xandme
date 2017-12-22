I developed this application as a SpringBoot Application (Maven project), since it is a standalone server with embedded tomcat,
we don't have to deploy it in any server, just run it as plain "GoogleapiApplication.java" java application.

i did not make it as a command line argumnet, i made it as url based.
Once the server is started , hit the below url where it accepts 3 parameter in the url.

http://localhost:8080/api/python/5/Price

Base Url : http://localhost:8080/api
            the first parameter is a search string
            the second parameter is a max result need to be displayed.
            the third paramter is the sort by fields based on Price ,PublishedDate,MaturityRating,RatingCount,PageCount,AverageRating/

different ways to access the url.

http://localhost:8080/api/python
http://localhost:8080/api/python/5
http://localhost:8080/api/python/5/Price
http://localhost:8080/api/python/5/PublishedDate
http://localhost:8080/api/python/5/MaturityRating
http://localhost:8080/api/python/5/RatingCount
http://localhost:8080/api/python/5/PageCount


