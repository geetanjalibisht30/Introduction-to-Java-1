package com.TTN.Assignment10.Que2_Que10.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class EmpNotFoundException extends RuntimeException
{
    public EmpNotFoundException (String message)
    {
        super(message);
    }
}
