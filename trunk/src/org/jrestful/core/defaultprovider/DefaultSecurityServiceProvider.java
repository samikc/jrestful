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
package org.jrestful.core.defaultprovider;

import org.jrestful.core.context.JrestfulContext;
import org.jrestful.core.spi.SecurityService;

/**
 * @author samikc
 *
 */
public class DefaultSecurityServiceProvider implements SecurityService {

	/* (non-Javadoc)
	 * @see org.jrestful.core.spi.SecurityService#hasPermission(org.jrestful.core.context.JrestfulContext)
	 */
	@Override
	public Boolean hasPermission(JrestfulContext context) {
		// The default behavior is to deny the service if security manager is enabled 
		return false;
	}

}
