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

import java.net.URL;
import java.util.Map;

import org.jrestful.core.Constants;

/**
 * This class captures the restful service related information
 * @author samikc@jrestful.org
 *
 */
public class RestServiceContext {
	private String serviceName;
	private String serviceMethod;
	private String serviceQueryString;
	private String jrestfulWebContextPath;
	private Map<String, String> paramsMap;
	
	public RestServiceContext(URL url) {
		this.jrestfulWebContextPath = this.setJrestFulPath(url.getPath());
		this.serviceQueryString = url.getQuery();
		this.setServiceName();
		this.setServiceMethod();
	}
	
	/**
	 * @param path
	 * @return
	 */
	private String setJrestFulPath(String path) {
		// TODO Auto-generated method stub
		int i = path.indexOf(Constants.JRESTFUL_URL_CONTEXT);
		String ret = null;
		if ( i > -1 ) {
			ret = path.substring(i);
		}
		return ret;
	}

	private void setServiceName() {
		String[] splits = this.jrestfulWebContextPath.split("/");
		// We would like to find the context for JRESTFUL and 
		// the next string should be the string for service name
		int i = 0;
		String ret = null;
		for (String s : splits) {
			if (s.equals(Constants.JRESTFUL_URL_CONTEXT)) {
				i++;
				break;
			} else {
				i++;
			}
		}
		
		if (splits.length > i) {
			ret = splits[i];
		}
		this.serviceName = ret;
		
	}
	
	private void setServiceMethod() {
		String ret = null;
		if (this.serviceName != null) {
			String[] splits = this.jrestfulWebContextPath.split("/");
			// We would like to find the service name for JRESTFUL and 
			// the next string should be the string for service method
			int i = 0;
			for (String s : splits) {
				if (s.equals(this.serviceName)) {
					i++;
					break;
				} else {
					i++;
				}
			}
			
			if (splits.length > i) {
				ret = splits[i];
			}
		}
		this.serviceMethod = ret;
	}
	/***
	 * This method returns the service name as represented in the URL.
	 * If no service name is found it returns null
	 * @return The service name (if found else returns null) 
	 */
	public String getServiceName() {
		return this.serviceName;
	}
	/***
	 * This method returns the service method name as represented in the URL.
	 * If no service name is found it returns null
	 * @return The service method name (if found else returns null) 
	 */
	
	public String getServiceMethod() {
		return this.serviceMethod;
	}
	
	/**
	 * This method returns the query string that is passed in the URL
	 * @return
	 */
	public String getServiceQueryString() {
		return this.serviceQueryString;
	}
	
	public String getJrestfulWebContextPath() {
		return this.jrestfulWebContextPath;
	}
}
