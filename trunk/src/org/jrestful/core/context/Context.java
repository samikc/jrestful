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
 * This class captures the content for a JRestful service execution.
 * @author samikc@jrestful.org
 *
 */
public class Context {
	private HttpServletRequest request;
	private HttpServletResponse response;
	private RestServiceContext serviceContext;
	private HttpMethod method;
	/**
	 * @param request
	 * @param response
	 * @param serviceContext
	 */
	public Context(HttpServletRequest request, HttpServletResponse response,
			RestServiceContext serviceContext,HttpMethod m) {
		super();
		this.request = request;
		this.response = response;
		this.serviceContext = serviceContext;
		this.method = m;
	}
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
	/**
	 * @return the serviceContext
	 */
	public RestServiceContext getServiceContext() {
		return serviceContext;
	}
}