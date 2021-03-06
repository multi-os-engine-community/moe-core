/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAudioConverterPrimeMethod
 * 
 * values for the primeMethod property. See further discussion under AVAudioConverterPrimeInfo.
 */
@Generated
public final class AVAudioConverterPrimeMethod {
    /**
     * Primes with leading + trailing input frames.
     */
    @Generated @NInt public static final long Pre = 0x0000000000000000L;
    /**
     * Only primes with trailing (zero latency). Leading frames are assumed to be silence.
     */
    @Generated @NInt public static final long Normal = 0x0000000000000001L;
    /**
     * Acts in "latency" mode. Both leading and trailing frames assumed to be silence.
     */
    @Generated @NInt public static final long None = 0x0000000000000002L;

    @Generated
    private AVAudioConverterPrimeMethod() {
    }
}
