/*
 * Copyright (c) 2014 Baidu.com, Inc. All Rights Reserved
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
package com.baidubce.services.sms.model;

public class QueryQuotaResponse extends SmsResponse {
    /**
     * The max count of sending message a day
     */
    private Integer maxSendPerDay;

    /**
     * The max count of allowed to receive message a day
     */
    private Integer maxReceivePerPhoneNumberDay;

    /**
     * The max count which is send in last 24 hours
     */
    private Integer sentToday;

    public Integer getMaxSendPerDay() {
        return maxSendPerDay;
    }

    public void setMaxSendPerDay(Integer maxSendPerDay) {
        this.maxSendPerDay = maxSendPerDay;
    }

    public Integer getMaxReceivePerPhoneNumberDay() {
        return maxReceivePerPhoneNumberDay;
    }

    public void setMaxReceivePerPhoneNumberDay(Integer maxReceivePerPhoneNumberDay) {
        this.maxReceivePerPhoneNumberDay = maxReceivePerPhoneNumberDay;
    }

    public Integer getSentToday() {
        return sentToday;
    }

    public void setSentToday(Integer sentToday) {
        this.sentToday = sentToday;
    }

    @Override
    public String toString() {
        return "QueryQuotaResponse [maxSendPerDay=" + maxSendPerDay + ", maxReceivePerPhoneNumberDay="
                + maxReceivePerPhoneNumberDay + ", sentToday=" + sentToday + "]";
    }

}
