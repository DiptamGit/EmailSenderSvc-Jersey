/**
 * 
 */
package com.ibm.model;

/**
 * @author DiptamSarkar
 *
 *Model class created for Email request JSON body
 */
public class EmailRequest {
	
	private String toEmail;
	private String fromEmail;
	private String subject;
	private String body;

	public String getToEmail() {
		return toEmail;
	}

	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}

	public String getFromEmail() {
		return fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "EmailRequest [toEmail=" + toEmail + ", fromEmail=" + fromEmail + ", subject=" + subject + ", body="
				+ body + "]";
	}
	

}
