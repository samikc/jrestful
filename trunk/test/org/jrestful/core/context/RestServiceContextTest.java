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

import java.net.MalformedURLException;
import java.net.URL;

import junit.framework.TestCase;

/**
 * @author samikc
 *
 */
public class RestServiceContextTest extends TestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * Test method for {@link org.jrestful.core.context.RestServiceContext#getServiceName()}.
	 */
	public void testGetServiceName() {
		URL url1 = null;
		URL url2 = null;
		URL url3 = null;
		URL url4 = null;
		URL url5 = null;
		try {
			url1 = new URL("http://localhost/some/service/hello?msg=hello");
			url2 = new URL("http://localhost/some/service/bolo?msg=hello");
			url3 = new URL("http://localhost/some/other/service/bolo?msg=hello");
			url4 = new URL("http://localhost/some/other/service?msg=hello");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RestServiceContext rs1 = new RestServiceContext(url1);
		RestServiceContext rs2 = new RestServiceContext(url2);
		RestServiceContext rs3 = new RestServiceContext(url3);
		RestServiceContext rs4 = new RestServiceContext(url4);
		
		//assertTrue("Expected : [\"/some/service/hello\"] but got : ["+rs1.getPath()+"]",rs1.getPath().equals("/some/service/hello"));
		assertTrue(rs1.getServiceName().equals("hello"));
		assertTrue(rs2.getServiceName().equals("bolo"));
		assertTrue(rs3.getServiceName().equals("bolo"));
		assertNull(rs4.getServiceName());
		try {
			RestServiceContext rs5 = new RestServiceContext(url5);
			rs5.getServiceName();
			fail("Should have been a null pointer exception");
		} catch (NullPointerException e) {
			assertTrue("Caught the null pointer exception",true);
		}
	}

}
