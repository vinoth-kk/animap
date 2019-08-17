# animap

This sample application does a POST call with a collection in request body and PATCHES a end point with the updated values

**Below steps should be followed to execute the Maven project once it is up and running:**  
- Import the Postman collection supplied by the customer (Agersens.postman_collection.json)
- In the Request Body, clear the location latitude and longitude values such that it will be auto computed by the Postman collection script.  
ex:  
        "location": {  
            "lat": {{lat_0}},  
            "lng": {{lng_0}}  
        }  
- Run the post URL **http://localhost:8504/animap/animals**
- This will update the FireBase endpoint via a patch call and the output with the updated Animal and co-ordinates details will be shown in JSON format on success.
- We have implemented circuit breaker pattern in case the external Firebase url is not reachable for some reasons. In this case, empty response will be returned.
- Activities will be logged to a file locally in the same location where project resides.

