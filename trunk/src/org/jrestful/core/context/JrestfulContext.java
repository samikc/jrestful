/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.jrestful.core.context;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author samikc
 *
 */
public class JrestfulContext {
	private String serviceResourceAliasName;
	private String serviceMethodAliasName;
	private String className;
	private String methodName;
	private HttpServletRequest request;
	/**
	 * @return the request
	 */
	public HttpServletRequest getRequest() {
		return request;
	}
	/**
	 * @return the response
	 */
	public HttpServletResponse getResponse() {
		return response;
	}
	private HttpServletResponse response;
	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	/**
	 * @return the methodName
	 */
	public String getMethodName() {
		return methodName;
	}
	/**
	 * @param methodName the methodName to set
	 */
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	/**
	 * @return the serviceResourceAliasName
	 */
	public String getServiceResourceAliasName() {
		return serviceResourceAliasName;
	}
	/**
	 * @return the serviceMethodAliasName
	 */
	public String getServiceMethodAliasName() {
		return serviceMethodAliasName;
	}
	/**
	 * @param serviceResourceAliasName
	 * @param serviceMethodAliasName
	 */
	public JrestfulContext(String serviceResourceAliasName,
			String serviceMethodAliasName,HttpServletRequest req,HttpServletResponse res) {
		super();
		this.serviceResourceAliasName = serviceResourceAliasName;
		this.serviceMethodAliasName = serviceMethodAliasName;
		this.request = req;
		this.response = res;
	}
	
	
}
