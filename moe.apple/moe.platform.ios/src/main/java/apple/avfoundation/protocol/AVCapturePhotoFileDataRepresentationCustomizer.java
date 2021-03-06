package apple.avfoundation.protocol;

import apple.avfoundation.AVCapturePhoto;
import apple.avfoundation.AVDepthData;
import apple.avfoundation.AVPortraitEffectsMatte;
import apple.avfoundation.AVSemanticSegmentationMatte;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSDictionary;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] AVCapturePhotoFileDataRepresentationCustomizer
 * 
 *    A set of delegate callbacks to be implemented by a client who calls AVCapturePhoto's -fileDataRepresentationWithCustomizer:.
 * 
 *    AVCapturePhoto is a wrapper representing a file-containerized photo in memory. If you simply wish to flatten the photo to an NSData to be written to a file, you may call -[AVCapturePhoto fileDataRepresentation]. For more complex flattening operations in which you wish to replace or strip metadata, you should call -[AVCapturePhoto fileDataRepresentationWithCustomizer:] instead, providing a delegate for customized stripping / replacing behavior. This delegate's methods are called synchronously before the flattening process commences.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVCapturePhotoFileDataRepresentationCustomizer")
public interface AVCapturePhotoFileDataRepresentationCustomizer {
    /**
     * replacementDepthDataForPhoto:
     * 
     *    A callback in which you may provide replacement depth data, or strip the existing depth data from the flattened file data representation.
     * 
     *    This callback is optional. If your delegate does not implement this callback, the existing depth data in the in-memory AVCapturePhoto container will be written to the file data representation.
     * 
     * @param photo
     *    The calling instance of AVCapturePhoto.
     * @return
     *    An instance of AVDepthData. To preserve the existing depth data, return photo.depthData. To strip the existing one, return nil. To replace, provide a replacement AVDepthData instance.
     */
    @Generated
    @IsOptional
    @Selector("replacementDepthDataForPhoto:")
    default AVDepthData replacementDepthDataForPhoto(AVCapturePhoto photo) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * replacementEmbeddedThumbnailPixelBufferWithPhotoFormat:forPhoto:
     * 
     *    A callback in which you may provide a replacement embedded thumbnail image with compression settings, or strip the existing embedded thumbnail image from the flattened file data representation.
     * 
     *    This callback is optional. If your delegate does not implement this callback, the existing embedded thumbnail photo in the in-memory AVCapturePhoto container will be written to the file data representation.
     * 
     * @param replacementEmbeddedThumbnailPhotoFormatOut
     *    On output, a pointer to a dictionary of keys and values from <AVFoundation/AVVideoSettings.h> If you pass a non-nil dictionary, AVVideoCodecKey is required, with AVVideoWidthKey and AVVideoHeightKey being optional. To preserve the existing embedded thumbnail photo to the flattened data, set *replacementEmbeddedThumbnailPhotoFormatOut to photo.embeddedThumbnailPhotoFormat and return nil. To strip the existing embedded thumbnail, set *replacementEmbeddedThumbnailPhotoFormatOut to nil and return nil. To replace the existing embedded thumbnail photo, pass a replacement photo format dictionary and return a non-nil replacement pixel buffer.
     * @param photo
     *    The calling instance of AVCapturePhoto.
     * @return
     *    A pixel buffer containing a source image to be encoded to the file as the replacement thumbnail image. To preserve the existing embedded thumbnail photo to the flattened data, set *replacementEmbeddedThumbnailPhotoFormatOut to photo.embeddedThumbnailPhotoFormat and return nil. To strip the existing embedded thumbnail, set *replacementEmbeddedThumbnailPhotoFormatOut to nil and return nil. To replace the existing embedded thumbnail photo, pass a replacement photo format dictionary and return a non-nil replacement pixel buffer.
     */
    @Generated
    @IsOptional
    @Selector("replacementEmbeddedThumbnailPixelBufferWithPhotoFormat:forPhoto:")
    default CVBufferRef replacementEmbeddedThumbnailPixelBufferWithPhotoFormatForPhoto(
            @ReferenceInfo(type = NSDictionary.class) Ptr<NSDictionary<String, ?>> replacementEmbeddedThumbnailPhotoFormatOut,
            AVCapturePhoto photo) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * replacementMetadataForPhoto:
     * 
     *    A callback in which you may provide replacement metadata, or direct the AVCapturePhoto to strip existing metadata from the flattened file data representation.
     * 
     *    This callback is optional. If your delegate does not implement this callback, the existing metadata in the in-memory AVCapturePhoto container will be written to the file data representation.
     * 
     * @param photo
     *    The calling instance of AVCapturePhoto.
     * @return
     *    A dictionary of keys and values from <ImageIO/CGImageProperties.h>. To preserve existing metadata, return photo.metadata. To strip existing metadata, return nil. To replace metadata, pass a replacement dictionary.
     */
    @Generated
    @IsOptional
    @Selector("replacementMetadataForPhoto:")
    default NSDictionary<String, ?> replacementMetadataForPhoto(AVCapturePhoto photo) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * replacementPortraitEffectsMatteForPhoto:
     * 
     *    A callback in which you may provide a replacement portrait effects matte, or strip the existing portrait effects matte from the flattened file data representation.
     * 
     *    This callback is optional. If your delegate does not implement this callback, the existing portrait effects matte in the in-memory AVCapturePhoto container will be written to the file data representation.
     * 
     * @param photo
     *    The calling instance of AVCapturePhoto.
     * @return
     *    An instance of AVPortraitEffectsMatte. To preserve the existing portrait effects matte, return photo.portraitEffectsMatte. To strip the existing one, return nil. To replace, provide a replacement AVPortraitEffectsMatte instance.
     */
    @Generated
    @IsOptional
    @Selector("replacementPortraitEffectsMatteForPhoto:")
    default AVPortraitEffectsMatte replacementPortraitEffectsMatteForPhoto(AVCapturePhoto photo) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * replacementSemanticSegmentationMatteOfType:forPhoto:
     * 
     *    A callback in which you may provide a replacement semantic segmentation matte of the indicated type, or strip the existing one from the flattened file data representation.
     * 
     *    This callback is optional. If your delegate does not implement this callback, the existing semantic segmentation matte of the specified type in the in-memory AVCapturePhoto container will be written to the file data representation.
     * 
     * @param semanticSegmentationMatteType
     *    The type of semantic segmentation matte to be replaced or stripped.
     * @param photo
     *    The calling instance of AVCapturePhoto.
     * @return
     *    An instance of AVSemanticSegmentationMatte. To preserve the existing matte, return [photo semanticSegmentationMatteForType:semanticSegmentationMatteType]. To strip the existing one, return nil. To replace, provide a replacement AVPortraitEffectsMatte instance.
     */
    @Generated
    @IsOptional
    @Selector("replacementSemanticSegmentationMatteOfType:forPhoto:")
    default AVSemanticSegmentationMatte replacementSemanticSegmentationMatteOfTypeForPhoto(
            String semanticSegmentationMatteType, AVCapturePhoto photo) {
        throw new java.lang.UnsupportedOperationException();
    }
}