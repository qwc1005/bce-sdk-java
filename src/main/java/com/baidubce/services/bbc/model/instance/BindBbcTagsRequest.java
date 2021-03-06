/*
 * Copyright (c) 2019 Baidu.com, Inc. All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.baidubce.services.bbc.model.instance;

import com.baidubce.auth.BceCredentials;
import com.baidubce.model.AbstractBceRequest;
import com.baidubce.services.bcc.model.TagModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

/**
 * Created by fulinhua on 2019-02-18
 */
public class BindBbcTagsRequest extends AbstractBceRequest {
    /**
     * The id of instance.
     */
    @JsonIgnore
    private String instanceId;

    /**
     * The list of tags.
     */
    private List<TagModel> changeTags;

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public List<TagModel> getChangeTags() {
        return changeTags;
    }

    public void setChangeTags(List<TagModel> changeTags) {
        this.changeTags = changeTags;
    }

    /**
     * Configure the list of tags for the request.
     *
     * @param changeTags The list of tags.
     * @return BindBbcTagsRequest with specified list of tags.
     */
    public BindBbcTagsRequest withChangeTags(List<TagModel> changeTags) {
        this.changeTags = changeTags;
        return this;
    }

    /**
     * Configure the instance ID for the request.
     *
     * @param instanceId The id of instance which will be used to bind a list of tags.
     * @return BindBbcTagsRequest with specified instance id.
     */
    public BindBbcTagsRequest withInstanceId(String instanceId) {
        this.setInstanceId(instanceId);
        return this;
    }

    /**
     * Configure request credential for the request.
     *
     * @param credentials a valid instance of BceCredentials.
     * @return BindBbcTagsRequest with credentials.
     */
    @Override
    public BindBbcTagsRequest withRequestCredentials(BceCredentials credentials) {
        this.setRequestCredentials(credentials);
        return this;
    }
}

