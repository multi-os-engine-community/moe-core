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
 * @class      MPSMatrixSolveTriangular
 * 
 * @dependency This depends on Metal.framework.
 * 
 * @abstract   A kernel for computing the solution of a linear system of
 *             equations using a triangular coefficient matrix.
 * 
 * @discussion A MPSMatrixSolveTriangular finds the solution matrix to the
 *             triangular system:
 * 
 *                 op(A) * X = alpha * B    or    X * op(A) = alpha * B
 * 
 *             Where A is either upper or lower triangular and op(A) is A**T
 *             or A.  B is the array of right hand sides for which the
 *             equations are to be solved.  X is the resulting matrix of
 *             solutions.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixSolveTriangular extends MPSMatrixBinaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixSolveTriangular(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixSolveTriangular alloc();

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

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * @abstract   Encode a MPSMatrixSolveTriangular kernel into a command Buffer.
     * 
     * @param      commandBuffer       A valid MTLCommandBuffer to receive the
     *                                 encoded filter
     * 
     * @param      sourceMatrix        A valid MPSMatrix containing the source
     *                                 matrix.
     * 
     * @param      rightHandSideMatrix A valid MPSMatrix containing the right hand
     *                                 side values.
     * 
     * @param      solutionMatrix      A valid MPSMatrix to contain the result.
     * 
     * @discussion This function encodes the MPSMatrixSolveTriangular object to a
     *             valid command buffer.
     * 
     *             rightHandSideMatrix and solutionMatrix must be large enough to
     *             hold at least order * numberOfRightHandSides values starting at
     *             secondarySourceMatrixOrigin and resultMatrixOrigin respectively.
     * 
     *             sourceMatrix must be at least size order x order starting at
     *             primarySourceMatrixOrigin.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceMatrix:rightHandSideMatrix:solutionMatrix:")
    public native void encodeToCommandBufferSourceMatrixRightHandSideMatrixSolutionMatrix(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSMatrix sourceMatrix,
            MPSMatrix rightHandSideMatrix, MPSMatrix solutionMatrix);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSMatrixSolveTriangular init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSMatrixSolveTriangular initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixSolveTriangular initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixSolveTriangular initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * @abstract   Initialize an MPSMatrixSolveTriangular object on a device
     * 
     * @param      device          The device on which the kernel will execute.
     * 
     * @param      right           A boolean value which indicates if the
     *                             coefficient matrix is multiplied on the left
     *                             or right side of the solution.  NO indicates
     *                             the multiplication is on the left.
     * 
     * @param      upper           A boolean value which indicates if the source
     *                             is lower or upper triangular.  NO indicates
     *                             that the coefficient matrix is lower triangular.
     * 
     * @param      transpose       A boolean value which indicates if the source
     *                             matrix should be used in transposed form.  NO
     *                             indicates that the coefficient matrix is to be
     *                             used normally.
     * 
     * @param      unit            A boolean value which indicates if the source
     *                             matrix is unit triangular.
     * 
     * @param      order           The order of the source matrix and, if
     *                             right == NO, the number of rows in the solution
     *                             and right hand side matrices.  If right == YES
     *                             the number of columns in the solution and right
     *                             hand side matrices.
     * 
     * @param      numberOfRightHandSides  If right == NO, the number of columns in the
     *                                     solution and right hand side matrices.  The
     *                                     number of rows otherwise.
     * 
     * @param      alpha           A double precision value used to scale the right
     *                             hand sides.
     * 
     * @discussion This function initializes a MPSMatrixSolveTriangular object.  It
     *             may allocate device side memory.
     * 
     * @return     A valid MPSMatrixSolveTriangular object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:right:upper:transpose:unit:order:numberOfRightHandSides:alpha:")
    public native MPSMatrixSolveTriangular initWithDeviceRightUpperTransposeUnitOrderNumberOfRightHandSidesAlpha(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, boolean right, boolean upper, boolean transpose,
            boolean unit, @NUInt long order, @NUInt long numberOfRightHandSides, double alpha);

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