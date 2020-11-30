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

package org.tensorflow.op.nn;

import java.util.List;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.TInt32;
import org.tensorflow.types.family.TNumber;
import org.tensorflow.types.family.TType;

/**
 * Computes the gradients of depthwise convolution with respect to the filter.
 * 
 * @param <T> data type for {@code output()} output
 */
@Operator(group = "nn")
public final class DepthwiseConv2dNativeBackpropFilter<T extends TNumber> extends RawOp implements Operand<T> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.nn.DepthwiseConv2dNativeBackpropFilter}
   */
  public static class Options {
    
    /**
     * @param explicitPaddings 
     */
    public Options explicitPaddings(List<Long> explicitPaddings) {
      this.explicitPaddings = explicitPaddings;
      return this;
    }
    
    /**
     * @param dataFormat Specify the data format of the input and output data. With the
     * default format "NHWC", the data is stored in the order of:
     *     [batch, height, width, channels].
     * Alternatively, the format could be "NCHW", the data storage order of:
     *     [batch, channels, height, width].
     */
    public Options dataFormat(String dataFormat) {
      this.dataFormat = dataFormat;
      return this;
    }
    
    /**
     * @param dilations 1-D tensor of length 4.  The dilation factor for each dimension of
     * `input`. If set to k > 1, there will be k-1 skipped cells between each filter
     * element on that dimension. The dimension order is determined by the value of
     * `data_format`, see above for details. Dilations in the batch and depth
     * dimensions must be 1.
     */
    public Options dilations(List<Long> dilations) {
      this.dilations = dilations;
      return this;
    }
    
    private List<Long> explicitPaddings;
    private String dataFormat;
    private List<Long> dilations;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new DepthwiseConv2dNativeBackpropFilter operation.
   * 
   * @param scope current scope
   * @param input 4-D with shape based on `data_format`.  For example, if
   * `data_format` is 'NHWC' then `input` is a 4-D `[batch, in_height,
   * in_width, in_channels]` tensor.
   * @param filterSizes An integer vector representing the tensor shape of `filter`,
   * where `filter` is a 4-D
   * `[filter_height, filter_width, in_channels, depthwise_multiplier]` tensor.
   * @param outBackprop 4-D with shape  based on `data_format`.
   * For example, if `data_format` is 'NHWC' then
   * out_backprop shape is `[batch, out_height, out_width, out_channels]`.
   * Gradients w.r.t. the output of the convolution.
   * @param strides The stride of the sliding window for each dimension of the input
   * of the convolution.
   * @param padding The type of padding algorithm to use.
   * @param options carries optional attributes values
   * @return a new instance of DepthwiseConv2dNativeBackpropFilter
   */
  @Endpoint(describeByClass = true)
  public static <T extends TNumber> DepthwiseConv2dNativeBackpropFilter<T> create(Scope scope, Operand<T> input, Operand<TInt32> filterSizes, Operand<T> outBackprop, List<Long> strides, String padding, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("DepthwiseConv2dNativeBackpropFilter", scope.makeOpName("DepthwiseConv2dNativeBackpropFilter"));
    opBuilder.addInput(input.asOutput());
    opBuilder.addInput(filterSizes.asOutput());
    opBuilder.addInput(outBackprop.asOutput());
    opBuilder.setDevice(scope.makeDeviceString());
    opBuilder = scope.applyControlDependencies(opBuilder);
    long[] stridesArray = new long[strides.size()];
    for (int i = 0; i < stridesArray.length; ++i) {
      stridesArray[i] = strides.get(i);
    }
    opBuilder.setAttr("strides", stridesArray);
    opBuilder.setAttr("padding", padding);
    if (options != null) {
      for (Options opts : options) {
        if (opts.explicitPaddings != null) {
          long[] explicitPaddingsArray = new long[opts.explicitPaddings.size()];
          for (int i = 0; i < explicitPaddingsArray.length; ++i) {
            explicitPaddingsArray[i] = opts.explicitPaddings.get(i);
          }
          opBuilder.setAttr("explicit_paddings", explicitPaddingsArray);
        }
        if (opts.dataFormat != null) {
          opBuilder.setAttr("data_format", opts.dataFormat);
        }
        if (opts.dilations != null) {
          long[] dilationsArray = new long[opts.dilations.size()];
          for (int i = 0; i < dilationsArray.length; ++i) {
            dilationsArray[i] = opts.dilations.get(i);
          }
          opBuilder.setAttr("dilations", dilationsArray);
        }
      }
    }
    return new DepthwiseConv2dNativeBackpropFilter<T>(opBuilder.build());
  }
  
  /**
   * @param explicitPaddings 
   */
  public static Options explicitPaddings(List<Long> explicitPaddings) {
    return new Options().explicitPaddings(explicitPaddings);
  }
  
  /**
   * @param dataFormat Specify the data format of the input and output data. With the
   * default format "NHWC", the data is stored in the order of:
   *     [batch, height, width, channels].
   * Alternatively, the format could be "NCHW", the data storage order of:
   *     [batch, channels, height, width].
   */
  public static Options dataFormat(String dataFormat) {
    return new Options().dataFormat(dataFormat);
  }
  
  /**
   * @param dilations 1-D tensor of length 4.  The dilation factor for each dimension of
   * `input`. If set to k > 1, there will be k-1 skipped cells between each filter
   * element on that dimension. The dimension order is determined by the value of
   * `data_format`, see above for details. Dilations in the batch and depth
   * dimensions must be 1.
   */
  public static Options dilations(List<Long> dilations) {
    return new Options().dilations(dilations);
  }
  
  /**
   * 4-D with shape
   * `[filter_height, filter_width, in_channels, out_channels]`.  Gradient w.r.t.
   * the `filter` input of the convolution.
   */
  public Output<T> output() {
    return output;
  }
  
  @Override
  public Output<T> asOutput() {
    return output;
  }
  
  /** The name of this op, as known by TensorFlow core engine */
  public static final String OP_NAME = "DepthwiseConv2dNativeBackpropFilter";
  
  private Output<T> output;
  
  private DepthwiseConv2dNativeBackpropFilter(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
