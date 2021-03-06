package apple.metal.protocol;

import apple.metal.MTLAccelerationStructureDescriptor;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLAccelerationStructureCommandEncoder")
public interface MTLAccelerationStructureCommandEncoder extends MTLCommandEncoder {
    /**
     * Encode an acceleration structure build into the command buffer. All bottom-level acceleration
     * structure builds must have completed before a top-level acceleration structure build may begin. Note
     * that this requires the use of fences and multiple acceleration structure encoders if the acceleration
     * structures are allocated from heaps. The resulting acceleration structure will not retain any
     * references to the input vertex buffer, instance buffer, etc.
     * 
     * The acceleration structure build will not be completed until the command buffer has been committed
     * and finished executing. However, it is safe to encode ray tracing work against the acceleration
     * structure as long as the command buffers are scheduled and synchronized such that the command buffer
     * will have completed by the time the ray tracing starts.
     * 
     * The acceleration structure and scratch buffer must be at least the size returned by the
     * [MTLDevice accelerationStructureSizesWithDescriptor:] query.
     * 
     * @param accelerationStructure Acceleration structure storage to build into
     * @param descriptor            Object describing the acceleration structure to build
     * @param scratchBuffer         Scratch buffer to use while building the acceleration structure. The
     *                              contents may be overwritten and are undefined after the build has
     *                              started/completed.
     * @param scratchBufferOffset   Offset into the scratch buffer
     */
    @Generated
    @Selector("buildAccelerationStructure:descriptor:scratchBuffer:scratchBufferOffset:")
    void buildAccelerationStructureDescriptorScratchBufferScratchBufferOffset(
            @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure accelerationStructure,
            MTLAccelerationStructureDescriptor descriptor, @Mapped(ObjCObjectMapper.class) MTLBuffer scratchBuffer,
            @NUInt long scratchBufferOffset);

    /**
     * Copy an acceleration structure. The source and destination acceleration structures must not
     * overlap in memory. If this is a top level acceleration structure, references to bottom level
     * acceleration structures will be preserved.
     * 
     * The destination acceleration structure must be at least as large as the source acceleration structure,
     * unless the source acceleration structure has been compacted, in which case the destination acceleration
     * structure must be at least as large as the compacted size of the source acceleration structure.
     * 
     * @param sourceAccelerationStructure      Acceleration structure to copy from
     * @param destinationAccelerationStructure Acceleration structure to copy to
     */
    @Generated
    @Selector("copyAccelerationStructure:toAccelerationStructure:")
    void copyAccelerationStructureToAccelerationStructure(
            @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure sourceAccelerationStructure,
            @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure destinationAccelerationStructure);

    /**
     * Copy and compact an acceleration structure. The source and destination acceleration structures
     * must not overlap in memory. If this is a top level acceleration structure, references to bottom level
     * acceleration structures will be preserved.
     * 
     * The destination acceleration structure must be at least as large as the compacted size of the source
     * acceleration structure, which is computed by the writeCompactedAccelerationStructureSize method.
     * 
     * @param sourceAccelerationStructure      Acceleration structure to copy and compact
     * @param destinationAccelerationStructure Acceleration structure to copy to
     */
    @Generated
    @Selector("copyAndCompactAccelerationStructure:toAccelerationStructure:")
    void copyAndCompactAccelerationStructureToAccelerationStructure(
            @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure sourceAccelerationStructure,
            @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure destinationAccelerationStructure);

    /**
     * Encode an acceleration structure refit into the command buffer. Refitting can be used to
     * update the acceleration structure when geometry changes and is much faster than rebuilding from
     * scratch. However, the quality of the acceleration structure and the subsequent ray tracing
     * performance will degrade depending on how much the geometry changes.
     * 
     * Refitting can not be used after certain changes, such as adding or removing geometry. Acceleration
     * structures can be refit in place by specifying the same source and destination acceleration structures
     * or by providing a nil destination acceleration structure. If the source and destination acceleration
     * structures are not the same, they must not overlap in memory.
     * 
     * The destination acceleration structure must be at least as large as the source acceleration structure,
     * unless the source acceleration structure has been compacted, in which case the destination acceleration
     * structure must be at least as large as the compacted size of the source acceleration structure.
     * 
     * The scratch buffer must be at least the size returned by the accelerationStructureSizesWithDescriptor
     * method of the MTLDevice.
     * 
     * @param descriptor                       Object describing the acceleration structure to build
     * @param sourceAccelerationStructure      Acceleration structure to copy from
     * @param destinationAccelerationStructure Acceleration structure to copy to
     * @param scratchBuffer                    Scratch buffer to use while refitting the acceleration
     *                                         structure. The contents may be overwritten and are undefined
     *                                         after the refit has started/completed.
     * @param scratchBufferOffset              Offset into the scratch buffer.
     */
    @Generated
    @Selector("refitAccelerationStructure:descriptor:destination:scratchBuffer:scratchBufferOffset:")
    void refitAccelerationStructureDescriptorDestinationScratchBufferScratchBufferOffset(
            @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure sourceAccelerationStructure,
            MTLAccelerationStructureDescriptor descriptor,
            @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure destinationAccelerationStructure,
            @Mapped(ObjCObjectMapper.class) MTLBuffer scratchBuffer, @NUInt long scratchBufferOffset);

    /**
     * sampleCountersInBuffer:atSampleIndex:withBarrier:
     * 
     * Sample hardware counters at this point in the compute encoder and
     * store the counter sample into the sample buffer at the specified index.
     * 
     * @param sampleBuffer The sample buffer to sample into
     * @param sampleIndex The index into the counter buffer to write the sample
     * @param barrier Insert a barrier before taking the sample.  Passing
     * YES will ensure that all work encoded before this operation in the encoder is
     * complete but does not isolate the work with respect to other encoders.  Passing
     * NO will allow the sample to be taken concurrently with other operations in this
     * encoder.
     * In general, passing YES will lead to more repeatable counter results but
     * may negatively impact performance.  Passing NO will generally be higher performance
     * but counter results may not be repeatable.
     */
    @Generated
    @Selector("sampleCountersInBuffer:atSampleIndex:withBarrier:")
    void sampleCountersInBufferAtSampleIndexWithBarrier(
            @Mapped(ObjCObjectMapper.class) MTLCounterSampleBuffer sampleBuffer, @NUInt long sampleIndex,
            boolean barrier);

    /**
     * updateFence:
     * 
     * Update the fence to capture all GPU work so far enqueued by this encoder.
     * 
     * The fence is updated at kernel submission to maintain global order and prevent deadlock.
     * Drivers may delay fence updates until the end of the encoder. Drivers may also wait on fences at the beginning of an encoder. It is therefore illegal to wait on a fence after it has been updated in the same encoder.
     */
    @Generated
    @Selector("updateFence:")
    void updateFence(@Mapped(ObjCObjectMapper.class) MTLFence fence);

    /**
     * useHeap:
     * 
     * Declare that the resources allocated from a heap may be accessed as readonly by the render pass through an argument buffer
     * 
     * For tracked MTLHeaps, this method protects against data hazards. This method must be called before encoding any dispatch commands which may access the resources allocated from the heap through an argument buffer. This method may cause all of the color attachments allocated from the heap to become decompressed. Therefore, it is recommended that the useResource:usage: or useResources:count:usage: methods be used for color attachments instead, with a minimal (i.e. read-only) usage.
     * [@warning] Prior to iOS 13, macOS 10.15, this method does not protect against data hazards. If you are deploying to older versions of macOS or iOS, use fences to ensure data hazards are resolved.
     */
    @Generated
    @Selector("useHeap:")
    void useHeap(@Mapped(ObjCObjectMapper.class) MTLHeap heap);

    /**
     * useHeaps:count:
     * 
     * Declare that the resources allocated from an array of heaps may be accessed as readonly by the render pass through an argument buffer
     * 
     * For tracked MTLHeaps, this method protects against data hazards. This method must be called before encoding any dispatch commands which may access the resources allocated from the heaps through an argument buffer. This method may cause all of the color attachments allocated from the heaps to become decompressed. Therefore, it is recommended that the useResource:usage: or useResources:count:usage: methods be used for color attachments instead, with a minimal (i.e. read-only) usage.
     * [@warning] Prior to iOS 13, macOS 10.15, this method does not protect against data hazards. If you are deploying to older versions of macOS or iOS, use fences to ensure data hazards are resolved.
     */
    @Generated
    @Selector("useHeaps:count:")
    void useHeapsCount(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> heaps, @NUInt long count);

    /**
     * useResource:usage:
     * 
     * Declare that a resource may be accessed by the command encoder through an argument buffer
     * 
     * For tracked MTLResources, this method protects against data hazards. This method must be called before encoding any dispatch commands which may access the resource through an argument buffer.
     * [@warning] Prior to iOS 13, macOS 10.15, this method does not protect against data hazards. If you are deploying to older versions of macOS or iOS, use fences to ensure data hazards are resolved.
     */
    @Generated
    @Selector("useResource:usage:")
    void useResourceUsage(@Mapped(ObjCObjectMapper.class) MTLResource resource, @NUInt long usage);

    /**
     * useResources:count:usage:
     * 
     * Declare that an array of resources may be accessed through an argument buffer by the command encoder
     * 
     * For tracked MTL Resources, this method protects against data hazards. This method must be called before encoding any dispatch commands which may access the resources through an argument buffer.
     * [@warning] Prior to iOS 13, macOS 10.15, this method does not protect against data hazards. If you are deploying to older versions of macOS or iOS, use fences to ensure data hazards are resolved.
     */
    @Generated
    @Selector("useResources:count:usage:")
    void useResourcesCountUsage(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> resources, @NUInt long count,
            @NUInt long usage);

    /**
     * waitForFence:
     * 
     * Prevent further GPU work until the fence is reached.
     * 
     * The fence is evaluated at kernel submision to maintain global order and prevent deadlock.
     * Drivers may delay fence updates until the end of the encoder. Drivers may also wait on fences at the beginning of an encoder. It is therefore illegal to wait on a fence after it has been updated in the same encoder.
     */
    @Generated
    @Selector("waitForFence:")
    void waitForFence(@Mapped(ObjCObjectMapper.class) MTLFence fence);

    /**
     * Compute the compacted size for an acceleration structure and write it into a buffer.
     * 
     * This size is potentially smaller than the source acceleration structure. To perform compaction,
     * read this size from the buffer once the command buffer has completed and use it to allocate a
     * smaller acceleration structure. Then create another encoder and call the
     * copyAndCompactAccelerationStructure method.
     * 
     * @param accelerationStructure Source acceleration structure
     * @param buffer                Destination size buffer. The compacted size will be written as a 32 bit
     *                              unsigned integer representing the compacted size in bytes.
     * @param offset                Offset into the size buffer
     */
    @Generated
    @Selector("writeCompactedAccelerationStructureSize:toBuffer:offset:")
    void writeCompactedAccelerationStructureSizeToBufferOffset(
            @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure accelerationStructure,
            @Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset);
}