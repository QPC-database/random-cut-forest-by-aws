/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazon.randomcutforest;

import java.util.List;

import lombok.Data;

import com.amazon.randomcutforest.executor.Sequential;
import com.amazon.randomcutforest.sampler.Weighted;
import com.amazon.randomcutforest.state.sampler.CompactSamplerState;
import com.amazon.randomcutforest.state.store.PointStoreDoubleState;
import com.amazon.randomcutforest.state.tree.CompactRandomCutTreeState;

/**
 * A class that encapsulates most of the data used in a RandomCutForest such
 * that the forest can be serialized and deserialized.
 */
@Data
public class RandomCutForestState {

    private long entriesSeen;

    private double lambda;

    private int numberOfTrees;

    private int sampleSize;

    private int dimensions;

    private int outputAfter;

    private boolean storeSequenceIndexesEnabled;

    private boolean compactEnabled;

    private boolean centerOfMassEnabled;

    private boolean parallelExecutionEnabled;

    private int threadPoolSize;

    public boolean saveTreeData;

    public PointStoreDoubleState pointStoreDoubleState;

    public List<CompactSamplerState> compactSamplerStates;

    public List<List<Sequential<double[]>>> sequentialSamplerData;

    public List<List<Weighted<double[]>>> smallSamplerData;

    public List<CompactRandomCutTreeState> compactRandomCutTreeStates;
}
