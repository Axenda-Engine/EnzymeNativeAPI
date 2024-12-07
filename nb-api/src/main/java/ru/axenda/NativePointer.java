package ru.axenda;

public class NativePointer {
    private long address;

    public NativePointer(long address) {
        this.address = address;
    }

    public NativePointer(Object obj) {
        genNativePtrFromObj(obj);
    }

    @NativeImplementation("__instance->address = (int64_t) obj;")
    private native void genNativePtrFromObj(Object obj);

    protected void throwNotImplemented() {
        throw new UnsupportedOperationException("This method is not implemented by currently running Java Virtual Machine");
    }

    // Basic Operations
    public NativePointer add(long offset) {
        return new NativePointer(this.address + offset);
    }

    public NativePointer sub(long offset) {
        return new NativePointer(this.address - offset);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof NativePointer)) return false;
        NativePointer other = (NativePointer) obj;
        return this.address == other.address;
    }

    @Override
    public String toString() {
        return "0x" + Long.toHexString(address);
    }

    @ForceArgumentPointer(arg = 1, dimensions = 1)
    @NativeImplementationInternal(id = "ru.axenda.NativePointer.InvokeImpl")
    public native void invoke(Object retval, Object[] args);

    // Memory Reading
    @NativeImplementation("return *(uint8_t*) __instance->address;")
    public native short readU8();

    @NativeImplementation("return *(int8_t*) __instance->address;")
    public native byte readS8();

    @NativeImplementation("return *(uint16_t*) __instance->address;")
    public native int readU16();

    @NativeImplementation("return *(int16_t*) __instance->address;")
    public native short readS16();

    @NativeImplementation("return (int64_t) (*(uint32_t*) __instance->address);")
    public native long readU32();

    @NativeImplementation("return *(int32_t*) __instance->address;")
    public native int readS32();

    @NativeImplementation("return *(uint64_t*) __instance->address;")
    public native long readU64();

    @NativeImplementation("return *(int64_t*) __instance->address;")
    public native long readS64();

    @NativeImplementation("return *(float*) __instance->address;")
    public native float readFloat();

    @NativeImplementation("return *(double*) __instance->address;")
    public native double readDouble();

    @NativeImplementation("""
        int64_t ptr = (int64_t) (*(void **) __instance->address);
        NativePointer *nptr = (NativePointer *) JRuntime_AllocObject(sizeof(NativePointer));
        nptr->address = ptr;

        return nptr;
    """)
    public native NativePointer readPointer();

    // Use JRuntime_NewString function
    public String readCString() {
        throwNotImplemented();
        return null;
    }

    public String readUtf8String() {
        throwNotImplemented();
        return null;
    }

    public String readUtf16String() {
        throwNotImplemented();
        return null;
    }

    // Use JRuntime_NewByteArray(ptr, len), which returns byte[]
    public byte[] readByteArray(int length) {
        throwNotImplemented();
        return null;
    }

    @ForceReturnType(val = "void *")
    @NativeImplementation("return *(void **) __instance->address;")
    public Object readObject() {
        throwNotImplemented();
        return null;
    }

    // Memory Writing
    public void writeU8(short value) {
        throwNotImplemented();
    }

    public void writeS8(byte value) {
        throwNotImplemented();
    }

    public void writeU16(int value) {
        throwNotImplemented();
    }

    public void writeS16(short value) {
        throwNotImplemented();
    }

    public void writeU32(long value) {
        throwNotImplemented();
    }

    public void writeS32(int value) {
        throwNotImplemented();
    }

    public void writeU64(long value) {
        throwNotImplemented();
    }

    public void writeS64(long value) {
        throwNotImplemented();
    }

    public void writeFloat(float value) {
        throwNotImplemented();
    }

    public void writeDouble(double value) {
        throwNotImplemented();
    }

    public void writePointer(NativePointer value) {
        throwNotImplemented();
    }

    public void writeUtf8String(String value) {
        throwNotImplemented();
    }

    public void writeUtf16String(String value) {
        throwNotImplemented();
    }

    public void writeByteArray(byte[] bytes) {
        throwNotImplemented();
    }

    public void writeObject(Object obj) {
        throwNotImplemented();
    }

    // Memory Protection
    public void protect(String protection) {
        throwNotImplemented();
    }

    // Pointer Arithmetic
    public NativePointer and(NativePointer other) {
        throwNotImplemented();
        return null;
    }

    public NativePointer or(NativePointer other) {
        throwNotImplemented();
        return null;
    }

    public NativePointer xor(NativePointer other) {
        throwNotImplemented();
        return null;
    }

    public NativePointer shr(int n) {
        throwNotImplemented();
        return null;
    }

    public NativePointer shl(int n) {
        throwNotImplemented();
        return null;
    }

    // Utility Methods
    public boolean isNull() {
        throwNotImplemented();
        return false;
    }

    public int compare(NativePointer other) {
        throwNotImplemented();
        return 0;
    }

    public int toInt32() {
        throwNotImplemented();
        return 0;
    }

    public boolean isAligned(int alignment) {
        throwNotImplemented();
        return false;
    }
}