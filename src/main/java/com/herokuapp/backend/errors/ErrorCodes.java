package com.herokuapp.backend.errors;

public class ErrorCodes {

    public final static String ERROR_401_UAUTHORIZED = "User is not authorized to perform this operation, please authorise to access this page";
    public final static String ERROR_403_FORBIDEN = "User do not have the necessary permissions to access this page";
    public final static String ERROR_404_NOT_FOUND = "The requested resource could not be found but may be available again in the future.";
    public final static String ERROR_500_INTERNAL_SERVER_ERROR = "The server encountered an internal error or misconfiguration and was unable to complete your request.";
    public final static String ERROR_404_INVALID_URL = "Privided URL is not available, please provide correct URL address.";
    public final static String ERROR_400_METHOD_ARGUMENT_TYPE_MISMATCH = "Bad Request. The request could not be understood by the server due to malformed syntax. " +
            "The client should not repeat the request without modifications.";
    public final static String ERROR_406_NOT_ACCEPTABLE = "Server is unable to send data in the requested format, please provide a correct data format.";
    public final static String ERROR_405_METHOD_NOT_ALLOWED = "The requested resource is valid and exists, but the you have used an unacceptable HTTP method during the request.";


}
