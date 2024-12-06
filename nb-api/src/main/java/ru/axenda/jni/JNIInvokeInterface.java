package ru.axenda.jni;

import ru.axenda.NativePointer;

public class JNIInvokeInterface
{
    public NativePointer reserved0;
    public NativePointer reserved1;
    public NativePointer reserved2;

    public NativePointer DestroyJavaVM;
    public NativePointer AttachCurrentThread;
    public NativePointer DetachCurrentThread;
    public NativePointer GetEnv;
    public NativePointer AttachCurrentThreadAsDaemon;
}
