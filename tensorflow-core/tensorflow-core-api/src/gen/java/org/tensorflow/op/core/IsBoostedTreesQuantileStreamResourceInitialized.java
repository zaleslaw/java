/* Copyright 2018 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.core;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Checks whether a quantile stream has been initialized.
 * <p>
 * An Op that checks if quantile stream resource is initialized.
 */
public final class IsBoostedTreesQuantileStreamResourceInitialized extends PrimitiveOp implements Operand<Boolean> {
  
  /**
   * Factory method to create a class wrapping a new IsBoostedTreesQuantileStreamResourceInitialized operation.
   * 
   * @param scope current scope
   * @param quantileStreamResourceHandle resource; The reference to quantile stream resource handle.
   * @return a new instance of IsBoostedTreesQuantileStreamResourceInitialized
   */
  public static IsBoostedTreesQuantileStreamResourceInitialized create(Scope scope, Operand<?> quantileStreamResourceHandle) {
    OperationBuilder opBuilder = scope.env().opBuilder("IsBoostedTreesQuantileStreamResourceInitialized", scope.makeOpName("IsBoostedTreesQuantileStreamResourceInitialized"));
    opBuilder.addInput(quantileStreamResourceHandle.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new IsBoostedTreesQuantileStreamResourceInitialized(opBuilder.build());
  }
  
  /**
   * bool; True if the resource is initialized, False otherwise.
   */
  public Output<Boolean> isInitialized() {
    return isInitialized;
  }
  
  @Override
  public Output<Boolean> asOutput() {
    return isInitialized;
  }
  
  private Output<Boolean> isInitialized;
  
  private IsBoostedTreesQuantileStreamResourceInitialized(Operation operation) {
    super(operation);
    int outputIdx = 0;
    isInitialized = operation.output(outputIdx++);
  }
}