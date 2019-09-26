package com.sb.main.dto;

import java.util.Map;

public class ResponseBodyDTO {

	protected Boolean isSuccess = Boolean.TRUE;
	protected String statusMsg;
	protected String errorCode;
	protected String errorMsg;
	protected Object data;
	protected Map<Integer, String> msgParams;

	public ResponseBodyDTO() {
		super();
	}

	public ResponseBodyDTO(Boolean isSuccess, String statusMsg, String errorCode, String errorMsg, Object data) {
		this(isSuccess, statusMsg, errorCode, errorMsg, data, null);
	}

	public ResponseBodyDTO(Boolean isSuccess, String statusMsg, String errorCode, String errorMsg, Object data,
			Map<Integer, String> msgParams) {
		super();
		this.isSuccess = isSuccess;
		this.statusMsg = statusMsg;
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.data = data;
		this.msgParams = msgParams;
	}

	public Boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getStatusMsg() {
		return statusMsg;
	}

	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Map<Integer, String> getMsgParams() {
		return msgParams;
	}

	public void setMsgParams(Map<Integer, String> msgParams) {
		this.msgParams = msgParams;
	}

	@Override
	public String toString() {
		return "ResponseBody [isSuccess=" + isSuccess + ", statusMsg=" + statusMsg + ", errorCode=" + errorCode
				+ ", errorMsg=" + errorMsg + ", data=" + data + ", msgParams=" + msgParams + "]";
	}

}
