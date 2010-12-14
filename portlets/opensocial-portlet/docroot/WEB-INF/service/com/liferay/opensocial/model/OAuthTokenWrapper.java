/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.opensocial.model;

/**
 * <p>
 * This class is a wrapper for {@link OAuthToken}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       OAuthToken
 * @generated
 */
public class OAuthTokenWrapper implements OAuthToken {
	public OAuthTokenWrapper(OAuthToken oAuthToken) {
		_oAuthToken = oAuthToken;
	}

	/**
	* Gets the primary key of this o auth token.
	*
	* @return the primary key of this o auth token
	*/
	public long getPrimaryKey() {
		return _oAuthToken.getPrimaryKey();
	}

	/**
	* Sets the primary key of this o auth token
	*
	* @param pk the primary key of this o auth token
	*/
	public void setPrimaryKey(long pk) {
		_oAuthToken.setPrimaryKey(pk);
	}

	/**
	* Gets the oauth token id of this o auth token.
	*
	* @return the oauth token id of this o auth token
	*/
	public long getOauthTokenId() {
		return _oAuthToken.getOauthTokenId();
	}

	/**
	* Sets the oauth token id of this o auth token.
	*
	* @param oauthTokenId the oauth token id of this o auth token
	*/
	public void setOauthTokenId(long oauthTokenId) {
		_oAuthToken.setOauthTokenId(oauthTokenId);
	}

	/**
	* Gets the company id of this o auth token.
	*
	* @return the company id of this o auth token
	*/
	public long getCompanyId() {
		return _oAuthToken.getCompanyId();
	}

	/**
	* Sets the company id of this o auth token.
	*
	* @param companyId the company id of this o auth token
	*/
	public void setCompanyId(long companyId) {
		_oAuthToken.setCompanyId(companyId);
	}

	/**
	* Gets the create date of this o auth token.
	*
	* @return the create date of this o auth token
	*/
	public java.util.Date getCreateDate() {
		return _oAuthToken.getCreateDate();
	}

	/**
	* Sets the create date of this o auth token.
	*
	* @param createDate the create date of this o auth token
	*/
	public void setCreateDate(java.util.Date createDate) {
		_oAuthToken.setCreateDate(createDate);
	}

	/**
	* Gets the modified date of this o auth token.
	*
	* @return the modified date of this o auth token
	*/
	public java.util.Date getModifiedDate() {
		return _oAuthToken.getModifiedDate();
	}

	/**
	* Sets the modified date of this o auth token.
	*
	* @param modifiedDate the modified date of this o auth token
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_oAuthToken.setModifiedDate(modifiedDate);
	}

	/**
	* Gets the user id of this o auth token.
	*
	* @return the user id of this o auth token
	*/
	public long getUserId() {
		return _oAuthToken.getUserId();
	}

	/**
	* Sets the user id of this o auth token.
	*
	* @param userId the user id of this o auth token
	*/
	public void setUserId(long userId) {
		_oAuthToken.setUserId(userId);
	}

	/**
	* Gets the user uuid of this o auth token.
	*
	* @return the user uuid of this o auth token
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oAuthToken.getUserUuid();
	}

	/**
	* Sets the user uuid of this o auth token.
	*
	* @param userUuid the user uuid of this o auth token
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_oAuthToken.setUserUuid(userUuid);
	}

	/**
	* Gets the gadget id of this o auth token.
	*
	* @return the gadget id of this o auth token
	*/
	public long getGadgetId() {
		return _oAuthToken.getGadgetId();
	}

	/**
	* Sets the gadget id of this o auth token.
	*
	* @param gadgetId the gadget id of this o auth token
	*/
	public void setGadgetId(long gadgetId) {
		_oAuthToken.setGadgetId(gadgetId);
	}

	/**
	* Gets the module id of this o auth token.
	*
	* @return the module id of this o auth token
	*/
	public long getModuleId() {
		return _oAuthToken.getModuleId();
	}

	/**
	* Sets the module id of this o auth token.
	*
	* @param moduleId the module id of this o auth token
	*/
	public void setModuleId(long moduleId) {
		_oAuthToken.setModuleId(moduleId);
	}

	/**
	* Gets the service name of this o auth token.
	*
	* @return the service name of this o auth token
	*/
	public java.lang.String getServiceName() {
		return _oAuthToken.getServiceName();
	}

	/**
	* Sets the service name of this o auth token.
	*
	* @param serviceName the service name of this o auth token
	*/
	public void setServiceName(java.lang.String serviceName) {
		_oAuthToken.setServiceName(serviceName);
	}

	/**
	* Gets the token name of this o auth token.
	*
	* @return the token name of this o auth token
	*/
	public java.lang.String getTokenName() {
		return _oAuthToken.getTokenName();
	}

	/**
	* Sets the token name of this o auth token.
	*
	* @param tokenName the token name of this o auth token
	*/
	public void setTokenName(java.lang.String tokenName) {
		_oAuthToken.setTokenName(tokenName);
	}

	/**
	* Gets the access token of this o auth token.
	*
	* @return the access token of this o auth token
	*/
	public java.lang.String getAccessToken() {
		return _oAuthToken.getAccessToken();
	}

	/**
	* Sets the access token of this o auth token.
	*
	* @param accessToken the access token of this o auth token
	*/
	public void setAccessToken(java.lang.String accessToken) {
		_oAuthToken.setAccessToken(accessToken);
	}

	/**
	* Gets the token secret of this o auth token.
	*
	* @return the token secret of this o auth token
	*/
	public java.lang.String getTokenSecret() {
		return _oAuthToken.getTokenSecret();
	}

	/**
	* Sets the token secret of this o auth token.
	*
	* @param tokenSecret the token secret of this o auth token
	*/
	public void setTokenSecret(java.lang.String tokenSecret) {
		_oAuthToken.setTokenSecret(tokenSecret);
	}

	/**
	* Gets the session handle of this o auth token.
	*
	* @return the session handle of this o auth token
	*/
	public java.lang.String getSessionHandle() {
		return _oAuthToken.getSessionHandle();
	}

	/**
	* Sets the session handle of this o auth token.
	*
	* @param sessionHandle the session handle of this o auth token
	*/
	public void setSessionHandle(java.lang.String sessionHandle) {
		_oAuthToken.setSessionHandle(sessionHandle);
	}

	/**
	* Gets the token expire millis of this o auth token.
	*
	* @return the token expire millis of this o auth token
	*/
	public long getTokenExpireMillis() {
		return _oAuthToken.getTokenExpireMillis();
	}

	/**
	* Sets the token expire millis of this o auth token.
	*
	* @param tokenExpireMillis the token expire millis of this o auth token
	*/
	public void setTokenExpireMillis(long tokenExpireMillis) {
		_oAuthToken.setTokenExpireMillis(tokenExpireMillis);
	}

	public boolean isNew() {
		return _oAuthToken.isNew();
	}

	public void setNew(boolean n) {
		_oAuthToken.setNew(n);
	}

	public boolean isCachedModel() {
		return _oAuthToken.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_oAuthToken.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _oAuthToken.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_oAuthToken.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _oAuthToken.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _oAuthToken.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_oAuthToken.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return new OAuthTokenWrapper((OAuthToken)_oAuthToken.clone());
	}

	public int compareTo(com.liferay.opensocial.model.OAuthToken oAuthToken) {
		return _oAuthToken.compareTo(oAuthToken);
	}

	public int hashCode() {
		return _oAuthToken.hashCode();
	}

	public com.liferay.opensocial.model.OAuthToken toEscapedModel() {
		return new OAuthTokenWrapper(_oAuthToken.toEscapedModel());
	}

	public java.lang.String toString() {
		return _oAuthToken.toString();
	}

	public java.lang.String toXmlString() {
		return _oAuthToken.toXmlString();
	}

	public OAuthToken getWrappedOAuthToken() {
		return _oAuthToken;
	}

	private OAuthToken _oAuthToken;
}