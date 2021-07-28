package com.unicomer.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Response {

	private static GeneralResponse generalResponse;

	public static ResponseEntity<?> getResponseDenied(String message) {
		return new ResponseEntity<>(new GeneralResponse(null, CommonConstants.HTTP_CODE_UNAUTHORIZER, message),
				HttpStatus.UNAUTHORIZED);
	}

	public static ResponseEntity<?> getResponseServerError(String message) {

		return new ResponseEntity<>(
				new GeneralResponse(null, CommonConstants.HTTP_CODE_ERROR_INTERNAL_SERVICE, message),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

	public static ResponseEntity<?> getResponseSuccess(Object obj, String message) {

		return new ResponseEntity<>(new GeneralResponse(obj, CommonConstants.HTTP_CODE_SUCCES, message), HttpStatus.OK);
	}

	public static ResponseEntity<?> getResponseNoContent(Object obj, String message) {

		return new ResponseEntity<>(new GeneralResponse(obj, CommonConstants.HTTP_CODE_NO_CONTENT, message),
				HttpStatus.NO_CONTENT);
	}

	public static ResponseEntity<?> getResponseBadRequest(Object obj, String message) {

		return new ResponseEntity<>(new GeneralResponse(obj, CommonConstants.HTTP_CODE_BAD_REQUEST, message),
				HttpStatus.BAD_REQUEST);
	}

	// General Response for a manual validator
	public static ResponseEntity<?> getGeneralResponseCustomValidate(int status, String message) {
		return new ResponseEntity<>(new GeneralResponse(null, status, message), HttpStatus.CONFLICT);
	}

	public static Boolean authRest(String username) {
		return username == null ? true : false;
	}

	public static GeneralResponse getGeneralResponse() {
		return generalResponse;
	}

	public static void setGeneralResponse(GeneralResponse generalResponse) {
		Response.generalResponse = generalResponse;
	}
}
