/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.consent.mgt.core.dao;

import org.wso2.carbon.consent.mgt.core.exception.ConsentManagementException;
import org.wso2.carbon.consent.mgt.core.model.Purpose;

import java.util.List;

public interface PurposeDAO {

    int getPriority();

    Purpose addPurpose(Purpose purpose) throws ConsentManagementException;

    Purpose getPurposeById(int id) throws ConsentManagementException;

    Purpose getPurposeByName(String name, int tenantId) throws ConsentManagementException;

    List<Purpose> listPurposes(int limit, int offset, int tenantId) throws ConsentManagementException;

    int deletePurpose(int id) throws ConsentManagementException;
}