/*
 * Copyright 2019 Baidu, Inc.
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
package com.baidubce.services.ros.model.problem;

import java.util.List;

import com.baidubce.model.GenericAccountRequest;
import com.baidubce.services.ros.model.Capacity;
import com.baidubce.services.ros.model.TimeWindow;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Create Scheduler Task Request
 *
 * @author chenbo14
 * @date 2019/05/31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProblemRequest extends GenericAccountRequest {
    private String scenesType;
    private String matrixId;
    private String lbsType;
    private String commitId;
    private String distanceType;
    private List<Depot> depots;
    private List<VehicleModel> vehicleModels;
    private List<ServiceJob> serviceJobs;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Depot {
        private String depotId;
        private TimeWindow depotTimeWindow;
        private List<VehicleGroup> vehicleGroups;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ServiceJob {
        private String serviceJobId;
        private Double serviceStayDuration;
        private Capacity demand;
        private List<String> skills;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class VehicleModel {
        private String vehicleModelId;
        private Capacity capacity;
        private Double perDistanceUnitPrice;
        private Double fixedCost;
        private Double waitingCost;
        private Double averageVelocity;
        private Double maxVelocity;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class VehicleGroup {
        private String vehicleTypeId;
        private String vehicleModelId;
        private Integer vehicleCount;
        private Integer minVisited;
        private Integer maxVisited;
        private Integer maxRunDistance;
        private Integer maxRunTime;
        private List<String> vehicleSkills;
        private Boolean returnToDepot;
    }
}
