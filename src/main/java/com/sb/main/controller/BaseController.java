package com.sb.main.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import com.sb.main.dto.ResponseBodyDTO;
	

@CrossOrigin
public class BaseController {

	private static final Logger log = LogManager.getLogger(BaseController.class);

	/**
	 * prepareResponse method prepares response Entity object with given
	 * response object and status codes.
	 *
	 * @param responseObject
	 *            the response object
	 * @param httpStatus
	 *            the http status
	 * @return ResponseEntity<ResponseBody>
	 */
	public ResponseEntity<ResponseBodyDTO> prepareResponse(Object responseObject, HttpStatus httpStatus) {
		ResponseBodyDTO responseBody = new ResponseBodyDTO();
		responseBody.setData(responseObject);
		return new ResponseEntity<>(responseBody, httpStatus);
	}

	/**
	 * prepareResponse method prepares response Entity object with given
	 * response object and status codes.
	 *
	 * @param responseObject
	 *            the response object
	 * @param httpStatus
	 *            the http status
	 * @param errorMessageList
	 * @param string
	 * @param b
	 * @return ResponseEntity<ResponseBody>
	 */
	public ResponseEntity<ResponseBodyDTO> prepareResponse(Object responseObject, HttpStatus httpStatus, boolean b,
			String string, List<String> errorMessageList) {
		ResponseBodyDTO responseBody = new ResponseBodyDTO();
		responseBody.setData(responseObject);
		responseBody.setErrorMsg(errorMessageList.toString());
		responseBody.setIsSuccess(b);
		return new ResponseEntity<>(responseBody, httpStatus);
	}

	public ResponseEntity<ResponseBodyDTO> prepareResponse(Object responseObject, HttpStatus httpStatus,
			HttpHeaders httpHeaders) {
		ResponseBodyDTO responseBody = new ResponseBodyDTO();
		responseBody.setData(responseObject);
		return new ResponseEntity<>(responseBody, httpHeaders, httpStatus);
	}

	/**
	 * prepareResponse method prepares response Entity object with given
	 * response object and status codes.
	 *
	 * @param responseObject
	 *            the response object
	 * @param httpStatus
	 *            the http status
	 * @param status
	 *            the status
	 * @return the response entity
	 */
	public ResponseEntity<ResponseBodyDTO> prepareResponse(Object responseObject, HttpStatus httpStatus,
			Boolean status) {
		ResponseBodyDTO responseBody = new ResponseBodyDTO();
		responseBody.setIsSuccess(status);
		responseBody.setData(responseObject);
		return new ResponseEntity<>(responseBody, httpStatus);
	}

	/**
	 * prepareResponse method prepares response Entity object with given
	 * response object and status codes.
	 *
	 * @param responseObject
	 *            the response object
	 * @param httpStatus
	 *            the http status
	 * @param status
	 *            the status
	 * @param statusMsg
	 *            the status msg
	 * @return the response entity
	 */
	public ResponseEntity<ResponseBodyDTO> prepareResponse(Object responseObject, HttpStatus httpStatus, Boolean status,
			String statusMsg) {
		ResponseBodyDTO responseBody = new ResponseBodyDTO();
		responseBody.setIsSuccess(status);
		responseBody.setData(responseObject);
		responseBody.setStatusMsg(statusMsg);
		return new ResponseEntity<>(responseBody, httpStatus);
	}

	/**
	 * prepareResponse method prepares response Entity object with given
	 * response object and status codes.
	 *
	 * @param responseObject
	 *            the response object
	 * @param httpStatus
	 *            the http status
	 * @param status
	 *            the status
	 * @param errorCode
	 *            the error code
	 * @param errorMsg
	 *            the error msg
	 * @return the response entity
	 */
	public ResponseEntity<ResponseBodyDTO> prepareResponse(Object responseObject, HttpStatus httpStatus, Boolean status,
			String errorCode, String errorMsg) {
		ResponseBodyDTO responseBody = new ResponseBodyDTO();
		responseBody.setIsSuccess(status);
		responseBody.setData(responseObject);
		responseBody.setErrorCode(errorCode);
		responseBody.setErrorMsg(errorMsg);
		return new ResponseEntity<>(responseBody, httpStatus);
	}

	/**
	 * prepareResponse method prepares response Entity object with given
	 * response object and status codes.
	 *
	 * @param responseObject
	 *            the response object
	 * @param httpStatus
	 *            the http status
	 * @param successMsg
	 *            the success msg
	 * @return ResponseEntity<ResponseBody>
	 */
	public ResponseEntity<ResponseBodyDTO> prepareResponse(Object responseObject, HttpStatus httpStatus,
			String successMsg) {
		log.info(" :: prepareResponse");
		ResponseBodyDTO responseBody = new ResponseBodyDTO();
		responseBody.setData(responseObject);
		responseBody.setStatusMsg(successMsg);
		return new ResponseEntity<>(responseBody, httpStatus);
	}

	/**
	 * Gets the attachment details.
	 *
	 * @param multipartHttpSerReq
	 *            the multipart http ser req
	 * @return the attachment details
	 */
	public List<Object> getAttachmentDetails(MultipartHttpServletRequest multipartHttpSerReq) {
		List<Object> attachmentDetailList = null;
		try {
			String strDTOValue = multipartHttpSerReq.getParameter("file");
			Map<String, MultipartFile> multipartMap = multipartHttpSerReq.getFileMap();
			attachmentDetailList = new ArrayList<>();
			attachmentDetailList.add(strDTOValue);
			attachmentDetailList.add(multipartMap);
		} catch (Exception ex) {
			throw ex;
		}
		return attachmentDetailList;
	}

}

