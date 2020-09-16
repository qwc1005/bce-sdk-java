/*
 * Copyright 2019-2020 Baidu, Inc.
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
package com.baidubce.services.bvw.model.matlib.timeline;

import com.baidubce.services.bos.BosClient;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The model of timeline.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Timeline {

    /**
     * The timeline information
     */
    private BaijiahaoTimeline timeline;
    /**
     * The timeline meta
     */
    private Object meta;

    /**
     * Calculate url for BOS object of timeline.
     *
     * @param bosClient User's BOS client.
     */
    public void generalSignedUrl(BosClient bosClient) {
        if (timeline != null) {
            timeline.generalSignedUrl(bosClient);
        }
    }

}