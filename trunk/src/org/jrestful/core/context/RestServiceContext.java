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
	private String path;
	
	public RestServiceContext(URL url) {
		this.path = url.getPath();
		this.serviceQueryString = url.getQuery();
		this.setServiceName();
	}
	
	private void setServiceName() {
		
	}
	
	private void setServiceMethod() {
		
	}
	/***
	 * This method returns the service name as represented in the URL.
	 * If no service name is found it returns null
	 * @return The service name (if found else returns null) 
	 */
	public String getServiceName() {
		String[] splits = this.path.split("/");
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
		return ret;
	}
	
/*	public String getPath() {
		return this.path;
	}
*/
}
