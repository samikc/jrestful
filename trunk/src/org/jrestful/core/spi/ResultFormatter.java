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
package org.jrestful.core.spi;

/**
 * @author samikc
 *
 */
public interface ResultFormatter {

	/***
	 * If an error occurs while processing the request this message will be shown to the user.
	 * @return
	 */
	String error();
	
	/***
	 * If the user hits only the resource and no method can identified for the invocation 
	 * this method is called to process the request output.
	 * @param o The resource object which is created during the processing of the request
	 * @return
	 */
	String resourceMessage(Object o);
	
	/***
	 * Once the processing is over and an object is returned by the method in the resource
	 * this method is called to get the output from the object.
	 * @param o
	 * @return
	 */
	String output(Object o);
	
	/***
	 * Overloaded method for a void return type
	 * @return
	 */
	String output();
	
	/***
	 * If the developer wants he can change the output format to any standard HTTP content type
	 * @return
	 */
	String contentType();
	
	/***
	 * If any header needs to be provided.
	 * 
	 * For XML or HTML output the matching closing tag must be provided in the footer
	 * @return
	 */
	String outputHeader();
	
	/***
	 * If any footer needs to be provided.
	 * @return
	 */
	String outputFooter();
}
