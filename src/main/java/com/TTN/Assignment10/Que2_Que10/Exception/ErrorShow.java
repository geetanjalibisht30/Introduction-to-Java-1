package com.TTN.Assignment10.Que2_Que10.Exception;

// TO VALIDATION ERROR SHOW  USING SECIFIC DETAILS


public class ErrorShow {

    private String message;
    private String details;

    public ErrorShow( String message, String details) {
        super();

        this.message = message;
        this.details = details;
    }


    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}




