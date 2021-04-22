
## How to execute

1. Clone the project from github.
2. Enter into the project directory in command line using gitbash, cmd or powershell.
3. Run this below maven command: 
> ./mvnw spring-boot:run
4. You can see, App running successfully in 8080 port.

## Test the API 

This API endpoint accepts a GitHub ID and returns Follower GitHub ID’s (up to 5 Followers total) associated with the passed in GitHub ID.  Retrieve data up to 3 levels deep, repeating the process of retrieving Followers (up to 5 Followers total) for each Follower found


### Endpoint URL

1. Open any browser and hit the below url.
2. Replace the {id} placeholder with desired github id.
3. If it is a valid github id and has followers. You can see the response in JSON format.  

>  http://localhost:8080/getFollowersById/{id}

### Method Type: GET

#### Example Request and Response

Request URL: 

> http://localhost:8080/getFollowersById/koushikkothagal

Response Body: 

```
{
   "id": "koushikkothagal",
   "repos": [
   {
   "name": "advanced-jaxrs"
   },
   {
   "name": "agile"
   },
   {
   "name": "angular-loggly-logger"
   }
   ]
}
```






