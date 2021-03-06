/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidubce.services.eipbp.model;

import com.baidubce.auth.BceCredentials;
import com.baidubce.model.AbstractBceRequest;

/**
 * The request for releasing eipbp.
 */
public class ReleaseEipBpRequest extends AbstractBceRequest {
    /**
     * If the clientToken is not specified by the user, a random String generated by default algorithm will be used.
     * See more detail at
     * <a href = "https://bce.baidu.com/doc/EIP/API.html#.E9.80.9A.E7.94.A8.E8.AF.B4.E6.98.8E">
     *   BCE API doc</a>
     */
    private String clientToken;
    /**
     * eipbp's id to be released
     */
    private String id;

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ReleaseEipBpRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public ReleaseEipBpRequest withId(String id) {
        this.id = id;
        return this;
    }

    public ReleaseEipBpRequest withRequestCredentials(BceCredentials credentials) {
        this.setRequestCredentials(credentials);
        return this;
    }
}
