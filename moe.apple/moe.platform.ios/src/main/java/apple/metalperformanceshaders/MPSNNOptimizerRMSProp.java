package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @class      MPSNNOptimizerRMSProp
 * @discussion The MPSNNOptimizerRMSProp performs an RMSProp Update
 *             RMSProp is also known as root mean square propagation.
 * 
 *             s[t]     = decay * s[t-1] + (1 - decay) * (g ^ 2)
 *             variable = variable - learningRate * g / (sqrt(s[t]) + epsilon)
 * 
 *             where,
 *               g    is gradient of error wrt variable
 *               s[t] is weighted sum of squares of gradients
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNOptimizerRMSProp extends MPSNNOptimizer {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNOptimizerRMSProp(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNOptimizerRMSProp alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * @property   decay
     * @abstract   The decay at which we update sumOfSquares
     * @discussion Default value is 0.9
     */
    @Generated
    @Selector("decay")
    public native double decay();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * @abstract   Encode an MPSNNOptimizerRMSProp object to a command buffer to perform out of place update
     * 
     * @param      commandBuffer                              A valid MTLCommandBuffer to receive the encoded kernel.
     * @param      batchNormalizationGradientState            A valid MPSCNNBatchNormalizationState object which specifies the input state with gradients for this update.
     * @param      batchNormalizationSourceState              A valid MPSCNNBatchNormalizationState object which specifies the input state with original gamma/beta for this update.
     * @param      inputSumOfSquaresVectors                   An array MPSVector object which specifies the gradient sumOfSquares vectors which will
     *                                                        be updated and overwritten. The index 0 corresponds to gamma, index 1 corresponds to beta, array can be of
     *                                                        size 1 in which case beta won't be updated
     * @param      resultState                                A valid MPSCNNNormalizationGammaAndBetaState object which specifies the resultValues state which will
     *                                                        be updated and overwritten.
     * 
     * 
     * @discussion The following operations would be applied
     * 
     * 
     *             s[t]     = decay * s[t-1] + (1 - decay) * (g ^ 2)
     *             variable = variable - learningRate * g / (sqrt(s[t]) + epsilon)
     * 
     *             where,
     *               g    is gradient of error wrt variable
     *               s[t] is weighted sum of squares of gradients
     */
    @Generated
    @Selector("encodeToCommandBuffer:batchNormalizationGradientState:batchNormalizationSourceState:inputSumOfSquaresVectors:resultState:")
    public native void encodeToCommandBufferBatchNormalizationGradientStateBatchNormalizationSourceStateInputSumOfSquaresVectorsResultState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNBatchNormalizationState batchNormalizationGradientState,
            MPSCNNBatchNormalizationState batchNormalizationSourceState,
            NSArray<? extends MPSVector> inputSumOfSquaresVectors, MPSCNNNormalizationGammaAndBetaState resultState);

    /**
     * @abstract   Encode an MPSNNOptimizerRMSProp object to a command buffer to perform out of place update
     * 
     * @param      commandBuffer                              A valid MTLCommandBuffer to receive the encoded kernel.
     * @param      batchNormalizationState                    A valid MPSCNNBatchNormalizationState object which specifies the input state with gradients and original gamma/beta for this update.
     * @param      inputSumOfSquaresVectors                   An array MPSVector object which specifies the gradient sumOfSquares vectors which will
     *                                                        be updated and overwritten. The index 0 corresponds to gamma, index 1 corresponds to beta, array can be of
     *                                                        size 1 in which case beta won't be updated
     * @param      resultState                                A valid MPSCNNNormalizationGammaAndBetaState object which specifies the resultValues state which will
     *                                                        be updated and overwritten.
     * 
     * 
     * @discussion The following operations would be applied
     * 
     * 
     *             s[t]     = decay * s[t-1] + (1 - decay) * (g ^ 2)
     *             variable = variable - learningRate * g / (sqrt(s[t]) + epsilon)
     * 
     *             where,
     *               g    is gradient of error wrt variable
     *               s[t] is weighted sum of squares of gradients
     */
    @Generated
    @Selector("encodeToCommandBuffer:batchNormalizationState:inputSumOfSquaresVectors:resultState:")
    public native void encodeToCommandBufferBatchNormalizationStateInputSumOfSquaresVectorsResultState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNBatchNormalizationState batchNormalizationState,
            NSArray<? extends MPSVector> inputSumOfSquaresVectors, MPSCNNNormalizationGammaAndBetaState resultState);

    /**
     * @abstract   Encode an MPSNNOptimizerRMSProp object to a command buffer to perform out of place update
     * 
     * @param      commandBuffer              A valid MTLCommandBuffer to receive the encoded kernel.
     * @param      convolutionGradientState   A valid MPSCNNConvolutionGradientState object which specifies the input state with gradients for this update.
     * @param      convolutionSourceState     A valid MPSCNNConvolutionWeightsAndBiasesState object which specifies the input state with values to be updated.
     * @param      inputSumOfSquaresVectors   An array MPSVector object which specifies the gradient sumOfSquares vectors which will
     *                                        be updated and overwritten. The index 0 corresponds to weights, index 1 corresponds to biases, array can be of
     *                                        size 1 in which case biases won't be updated
     * @param      resultState                A valid MPSCNNConvolutionWeightsAndBiasesState object which specifies the resultValues state which will
     *                                        be updated and overwritten.
     * 
     * 
     * @discussion The following operations would be applied
     * 
     * 
     *             s[t]     = decay * s[t-1] + (1 - decay) * (g ^ 2)
     *             variable = variable - learningRate * g / (sqrt(s[t]) + epsilon)
     * 
     *             where,
     *               g    is gradient of error wrt variable
     *               s[t] is weighted sum of squares of gradients
     */
    @Generated
    @Selector("encodeToCommandBuffer:convolutionGradientState:convolutionSourceState:inputSumOfSquaresVectors:resultState:")
    public native void encodeToCommandBufferConvolutionGradientStateConvolutionSourceStateInputSumOfSquaresVectorsResultState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNConvolutionGradientState convolutionGradientState,
            MPSCNNConvolutionWeightsAndBiasesState convolutionSourceState,
            NSArray<? extends MPSVector> inputSumOfSquaresVectors, MPSCNNConvolutionWeightsAndBiasesState resultState);

    @Generated
    @Selector("encodeToCommandBuffer:inputGradientMatrix:inputValuesMatrix:inputSumOfSquaresMatrix:resultValuesMatrix:")
    public native void encodeToCommandBufferInputGradientMatrixInputValuesMatrixInputSumOfSquaresMatrixResultValuesMatrix(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSMatrix inputGradientMatrix,
            MPSMatrix inputValuesMatrix, MPSMatrix inputSumOfSquaresMatrix, MPSMatrix resultValuesMatrix);

    /**
     * @abstract   Encode an MPSNNOptimizerRMSProp object to a command buffer to perform out of place update
     * 
     * @param      commandBuffer              A valid MTLCommandBuffer to receive the encoded kernel.
     * @param      inputGradientVector        A valid MPSVector object which specifies the input vector of gradients for this update.
     * @param      inputValuesVector          A valid MPSVector object which specifies the input vector of values to be updated.
     * @param      inputSumOfSquaresVector    A valid MPSVector object which specifies the gradient velocity vector which will
     *                                        be updated and overwritten.
     * @param      resultValuesVector         A valid MPSVector object which specifies the resultValues vector which will
     *                                        be updated and overwritten.
     * 
     * 
     * @discussion The following operations would be applied
     * 
     * 
     *             s[t]     = decay * s[t-1] + (1 - decay) * (g ^ 2)
     *             variable = variable - learningRate * g / (sqrt(s[t]) + epsilon)
     * 
     *             where,
     *               g    is gradient of error wrt variable
     *               s[t] is weighted sum of squares of gradients
     */
    @Generated
    @Selector("encodeToCommandBuffer:inputGradientVector:inputValuesVector:inputSumOfSquaresVector:resultValuesVector:")
    public native void encodeToCommandBufferInputGradientVectorInputValuesVectorInputSumOfSquaresVectorResultValuesVector(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSVector inputGradientVector,
            MPSVector inputValuesVector, MPSVector inputSumOfSquaresVector, MPSVector resultValuesVector);

    /**
     * @property   epsilon
     * @abstract   The epsilon at which we update values
     * @discussion This value is usually used to ensure to avoid divide by 0, default value is 1e-8
     */
    @Generated
    @Selector("epsilon")
    public native float epsilon();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNNOptimizerRMSProp init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNNOptimizerRMSProp initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNNOptimizerRMSProp initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSNNOptimizerRMSProp initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * @abstract   Full initialization for the rmsProp update
     * 
     * @param      device                     The device on which the kernel will execute.
     * @param      decay                      The decay to update sumOfSquares
     * @param      epsilon                    The epsilon which will be applied
     * @param      optimizerDescriptor        The optimizerDescriptor which will have a bunch of properties to be applied
     * 
     * 
     * @return     A valid MPSNNOptimizerRMSProp object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:decay:epsilon:optimizerDescriptor:")
    public native MPSNNOptimizerRMSProp initWithDeviceDecayEpsilonOptimizerDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, double decay, float epsilon,
            MPSNNOptimizerDescriptor optimizerDescriptor);

    /**
     * @abstract   Convenience initialization for the RMSProp update
     * 
     * @param      device                     The device on which the kernel will execute.
     * @param      learningRate               The learningRate which will be applied
     * 
     * @return     A valid MPSNNOptimizerRMSProp object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:learningRate:")
    public native MPSNNOptimizerRMSProp initWithDeviceLearningRate(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            float learningRate);

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}