/*
 * Copyright 2015 Baidu, Inc.
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

package com.baidubce.services.media.model;

public class Area {
    /**
     * x from left
     **/
    private Integer x = null;

    /**
     * y from top
     **/
    private Integer y = null;

    /**
     * area width
     **/
    private Integer width = null;

    /**
     * area height
     **/
    private Integer height = null;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Area withX(Integer x) {
        this.x = x;
        return this;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Area withY(Integer y) {
        this.y = y;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Area withWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Area withHeight(Integer height) {
        this.height = height;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Area {\n");

        sb.append("    x: ").append(x).append("\n");
        sb.append("    y: ").append(y).append("\n");
        sb.append("    width: ").append(width).append("\n");
        sb.append("    height: ").append(height).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
