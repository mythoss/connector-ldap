/**
 * Copyright (c) 2019 Evolveum
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.evolveum.polygon.connector.ldap.ad;

import org.apache.directory.api.ldap.model.schema.ObjectClass;

/**
 * @author semancik
 *
 */
public class AdObjectClass extends ObjectClass {
	private static final long serialVersionUID = 1L;
	
	private String defaultObjectCategory;

	public AdObjectClass(String oid) {
		super(oid);
	}

	public String getDefaultObjectCategory() {
		return defaultObjectCategory;
	}

	public void setDefaultObjectCategory(String defaultObjectCategory) {
		this.defaultObjectCategory = defaultObjectCategory;
	}
	
}
