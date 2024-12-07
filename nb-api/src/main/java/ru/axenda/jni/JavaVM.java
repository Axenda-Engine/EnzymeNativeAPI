package ru.axenda.jni;

import ru.axenda.NativePointer;

public class JavaVM {
    private NativePointer functions; // JNIInvokeInterface

    public void DestroyJavaVM()
    {
        JNIInvokeInterface jii = (JNIInvokeInterface) functions.readObject();
        jii.DestroyJavaVM.invoke(jii, null);
    }
}
