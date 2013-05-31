/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package de.webtech2.croaking.services;

import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresGuest;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.authz.annotation.RequiresUser;

public interface AlphaService {

	@RequiresAuthentication
	String invoke();

	@RequiresAuthentication
	String invokeRequiresAuthentication();
	
	@RequiresUser
	String invokeRequiresUser();
	
	@RequiresGuest
	String invokeRequiresGuest();
	
	@RequiresRoles("user")
	String invokeRequiresRolesUser();
	
	@RequiresRoles("manager")
	String invokeRequiresRolesManager();
	
	@RequiresPermissions("news:view")
	String invokeRequiresPermissionsNewsView();
	
	@RequiresPermissions("news:edit")
	String invokeRequiresPermissionsNewsEdit();
}
