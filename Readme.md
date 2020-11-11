# Car Factory Document

### Reference Documentation

#### Rest Exceptin Handling
All exceptions for restfull services in the project are checked in the RestExceptionHandler.class
This class and its auxiliary subclasses are in the util package.

#### Restfull Return Response
BaseResponse.class is written instead of ResponseEntity.class
in this way, the response content is enriched.

#### Example Request and Response
* GetCarType request (http://127.0.0.1:8080/getCarType/hatchback) 
* GetCarType response \
{
  "data": "Hatchback Car has produced",
  "success": true,
  "error": null
}

* GetCarType exception \
{
    "status": "BAD_REQUEST",
    "timestamp": "11-11-2020 02:03:07",
    "message": "Car type not found",
    "debugMessage": null,
    "path": null,
    "errorInfos": null
}