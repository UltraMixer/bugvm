/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.metal;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @StronglyLinked/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLCommandBufferError/*</name>*/ 
    extends /*<extends>*/NSError/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    protected MTLCommandBufferError(SkipInit skipInit) {
        super(skipInit);
    }
    
    /*<ptr>*/public static class MTLCommandBufferErrorPtr extends Ptr<MTLCommandBufferError, MTLCommandBufferErrorPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(MTLCommandBufferError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    @Override
    public MTLCommandBufferErrorCode getErrorCode() {
        MTLCommandBufferErrorCode code = null;
        try {
            code = MTLCommandBufferErrorCode.valueOf(getCode());
        } catch (IllegalArgumentException e) {
            // ignore
        }
        return code;
    }
    /*<methods>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalValue(symbol="MTLCommandBufferErrorDomain", optional=true)
    public static native String getClassDomain();
    /*</methods>*/
}
