// Generated by jextract

package com.github.tjake.jlama.tensor.operations.cnative;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class NativeSimd  {

    public static final OfByte C_CHAR = JAVA_BYTE;
    public static final OfShort C_SHORT = JAVA_SHORT;
    public static final OfInt C_INT = JAVA_INT;
    public static final OfLong C_LONG = JAVA_LONG;
    public static final OfLong C_LONG_LONG = JAVA_LONG;
    public static final OfFloat C_FLOAT = JAVA_FLOAT;
    public static final OfDouble C_DOUBLE = JAVA_DOUBLE;
    public static final AddressLayout C_POINTER = RuntimeHelper.POINTER;
    /**
     * {@snippet :
     * #define HAS_F16C 2
     * }
     */
    public static int HAS_F16C() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * #define HAS_AVX2 4
     * }
     */
    public static int HAS_AVX2() {
        return (int)4L;
    }
    /**
     * {@snippet :
     * #define IS_M_SERIES_MAC 8
     * }
     */
    public static int IS_M_SERIES_MAC() {
        return (int)8L;
    }
    /**
     * {@snippet :
     * #define Q8_BLOCK_SIZE 32
     * }
     */
    public static int Q8_BLOCK_SIZE() {
        return (int)32L;
    }
    /**
     * {@snippet :
     * #define Q4_BLOCK_SIZE 32
     * }
     */
    public static int Q4_BLOCK_SIZE() {
        return (int)32L;
    }
    public static MethodHandle dot_product_f16$MH() {
        return RuntimeHelper.requireNonNull(constants$0.const$1,"dot_product_f16");
    }
    /**
     * {@snippet :
     * float dot_product_f16(int flags, short* a, int aoffset, short* b, int boffset, int length);
     * }
     */
    public static float dot_product_f16(int flags, MemorySegment a, int aoffset, MemorySegment b, int boffset, int length) {
        var mh$ = dot_product_f16$MH();
        try {
            return (float)mh$.invokeExact(flags, a, aoffset, b, boffset, length);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle dot_product_f16_q8$MH() {
        return RuntimeHelper.requireNonNull(constants$0.const$3,"dot_product_f16_q8");
    }
    /**
     * {@snippet :
     * float dot_product_f16_q8(int flags, short* a, int aoffset, float* bf, char* b, int boffset, int length);
     * }
     */
    public static float dot_product_f16_q8(int flags, MemorySegment a, int aoffset, MemorySegment bf, MemorySegment b, int boffset, int length) {
        var mh$ = dot_product_f16_q8$MH();
        try {
            return (float)mh$.invokeExact(flags, a, aoffset, bf, b, boffset, length);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle dot_product_f16_q4$MH() {
        return RuntimeHelper.requireNonNull(constants$0.const$4,"dot_product_f16_q4");
    }
    /**
     * {@snippet :
     * float dot_product_f16_q4(int flags, short* a, int aoffset, float* bf, char* b, int boffset, int length);
     * }
     */
    public static float dot_product_f16_q4(int flags, MemorySegment a, int aoffset, MemorySegment bf, MemorySegment b, int boffset, int length) {
        var mh$ = dot_product_f16_q4$MH();
        try {
            return (float)mh$.invokeExact(flags, a, aoffset, bf, b, boffset, length);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle dot_product_f32$MH() {
        return RuntimeHelper.requireNonNull(constants$0.const$5,"dot_product_f32");
    }
    /**
     * {@snippet :
     * float dot_product_f32(int flags, float* a, int aoffset, float* b, int boffset, int length);
     * }
     */
    public static float dot_product_f32(int flags, MemorySegment a, int aoffset, MemorySegment b, int boffset, int length) {
        var mh$ = dot_product_f32$MH();
        try {
            return (float)mh$.invokeExact(flags, a, aoffset, b, boffset, length);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle dot_product_f32_chunked$MH() {
        return RuntimeHelper.requireNonNull(constants$1.const$1,"dot_product_f32_chunked");
    }
    /**
     * {@snippet :
     * void dot_product_f32_chunked(int flags, float* r, float* a, int aoffset, float* b, int boffset, int length, int bchunkstart, int bchunksize);
     * }
     */
    public static void dot_product_f32_chunked(int flags, MemorySegment r, MemorySegment a, int aoffset, MemorySegment b, int boffset, int length, int bchunkstart, int bchunksize) {
        var mh$ = dot_product_f32_chunked$MH();
        try {
            mh$.invokeExact(flags, r, a, aoffset, b, boffset, length, bchunkstart, bchunksize);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle dot_product_f32_q8$MH() {
        return RuntimeHelper.requireNonNull(constants$1.const$2,"dot_product_f32_q8");
    }
    /**
     * {@snippet :
     * float dot_product_f32_q8(int flags, float* a, int aoffset, float* bf, char* b, int boffset, int length);
     * }
     */
    public static float dot_product_f32_q8(int flags, MemorySegment a, int aoffset, MemorySegment bf, MemorySegment b, int boffset, int length) {
        var mh$ = dot_product_f32_q8$MH();
        try {
            return (float)mh$.invokeExact(flags, a, aoffset, bf, b, boffset, length);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle dot_product_f32_q8_chunked$MH() {
        return RuntimeHelper.requireNonNull(constants$1.const$4,"dot_product_f32_q8_chunked");
    }
    /**
     * {@snippet :
     * void dot_product_f32_q8_chunked(int flags, float* r, float* a, int aoffset, float* bf, char* b, int boffset, int length, int bchunkstart, int bchunksize);
     * }
     */
    public static void dot_product_f32_q8_chunked(int flags, MemorySegment r, MemorySegment a, int aoffset, MemorySegment bf, MemorySegment b, int boffset, int length, int bchunkstart, int bchunksize) {
        var mh$ = dot_product_f32_q8_chunked$MH();
        try {
            mh$.invokeExact(flags, r, a, aoffset, bf, b, boffset, length, bchunkstart, bchunksize);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle dot_product_f32_q4$MH() {
        return RuntimeHelper.requireNonNull(constants$1.const$5,"dot_product_f32_q4");
    }
    /**
     * {@snippet :
     * float dot_product_f32_q4(int flags, float* a, int aoffset, float* bf, char* b, int boffset, int length);
     * }
     */
    public static float dot_product_f32_q4(int flags, MemorySegment a, int aoffset, MemorySegment bf, MemorySegment b, int boffset, int length) {
        var mh$ = dot_product_f32_q4$MH();
        try {
            return (float)mh$.invokeExact(flags, a, aoffset, bf, b, boffset, length);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle dot_product_f32_q4_chunked$MH() {
        return RuntimeHelper.requireNonNull(constants$2.const$0,"dot_product_f32_q4_chunked");
    }
    /**
     * {@snippet :
     * void dot_product_f32_q4_chunked(int flags, float* r, float* a, int aoffset, float* bf, char* b, int boffset, int length, int bchunkstart, int bchunksize);
     * }
     */
    public static void dot_product_f32_q4_chunked(int flags, MemorySegment r, MemorySegment a, int aoffset, MemorySegment bf, MemorySegment b, int boffset, int length, int bchunkstart, int bchunksize) {
        var mh$ = dot_product_f32_q4_chunked$MH();
        try {
            mh$.invokeExact(flags, r, a, aoffset, bf, b, boffset, length, bchunkstart, bchunksize);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle dot_product_q8$MH() {
        return RuntimeHelper.requireNonNull(constants$2.const$2,"dot_product_q8");
    }
    /**
     * {@snippet :
     * float dot_product_q8(int flags, float* af, char* a, int aoffset, float* bf, char* b, int boffset, int length);
     * }
     */
    public static float dot_product_q8(int flags, MemorySegment af, MemorySegment a, int aoffset, MemorySegment bf, MemorySegment b, int boffset, int length) {
        var mh$ = dot_product_q8$MH();
        try {
            return (float)mh$.invokeExact(flags, af, a, aoffset, bf, b, boffset, length);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle dot_product_q8_q4$MH() {
        return RuntimeHelper.requireNonNull(constants$2.const$3,"dot_product_q8_q4");
    }
    /**
     * {@snippet :
     * float dot_product_q8_q4(int flags, float* af, char* a, int aoffset, float* bf, char* b, int boffset, int length);
     * }
     */
    public static float dot_product_q8_q4(int flags, MemorySegment af, MemorySegment a, int aoffset, MemorySegment bf, MemorySegment b, int boffset, int length) {
        var mh$ = dot_product_q8_q4$MH();
        try {
            return (float)mh$.invokeExact(flags, af, a, aoffset, bf, b, boffset, length);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle dot_product_q8_q4_chunked$MH() {
        return RuntimeHelper.requireNonNull(constants$2.const$5,"dot_product_q8_q4_chunked");
    }
    /**
     * {@snippet :
     * void dot_product_q8_q4_chunked(int flags, float* r, float* af, char* a, int aoffset, float* bf, char* b, int boffset, int length, int bchunkstart, int bchunksize);
     * }
     */
    public static void dot_product_q8_q4_chunked(int flags, MemorySegment r, MemorySegment af, MemorySegment a, int aoffset, MemorySegment bf, MemorySegment b, int boffset, int length, int bchunkstart, int bchunksize) {
        var mh$ = dot_product_q8_q4_chunked$MH();
        try {
            mh$.invokeExact(flags, r, af, a, aoffset, bf, b, boffset, length, bchunkstart, bchunksize);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

