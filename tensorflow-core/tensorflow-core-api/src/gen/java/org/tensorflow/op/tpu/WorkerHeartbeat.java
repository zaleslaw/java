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

package org.tensorflow.op.tpu;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.TString;

/**
 * Worker heartbeat op.
 * <p>
 * Heartbeats may be sent periodically to indicate the coordinator is still active,
 * to retrieve the current worker status and to expedite shutdown when necessary.
 */
public final class WorkerHeartbeat extends RawOp implements Operand<TString> {
  
  /**
   * Factory method to create a class wrapping a new WorkerHeartbeat operation.
   * 
   * @param scope current scope
   * @param request A string tensor containing a serialized WorkerHeartbeatRequest
   * @return a new instance of WorkerHeartbeat
   */
  @Endpoint(describeByClass = true)
  public static WorkerHeartbeat create(Scope scope, Operand<TString> request) {
    OperationBuilder opBuilder = scope.env().opBuilder("WorkerHeartbeat", scope.makeOpName("WorkerHeartbeat"));
    opBuilder.addInput(request.asOutput());
    opBuilder.setDevice(scope.makeDeviceString());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new WorkerHeartbeat(opBuilder.build());
  }
  
  /**
   * A string tensor containing a serialized WorkerHeartbeatResponse
   */
  public Output<TString> response() {
    return response;
  }
  
  @Override
  public Output<TString> asOutput() {
    return response;
  }
  
  /** The name of this op, as known by TensorFlow core engine */
  public static final String OP_NAME = "WorkerHeartbeat";
  
  private Output<TString> response;
  
  private WorkerHeartbeat(Operation operation) {
    super(operation);
    int outputIdx = 0;
    response = operation.output(outputIdx++);
  }
}
