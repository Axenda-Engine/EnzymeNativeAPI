package ru.axenda.jni;

public class JNI
{
    public static final boolean TRUE = true;
    public static final boolean FALSE = false;
    
    public static final int VERSION_1_1 = 0x00010001;
    public static final int VERSION_1_2 = 0x00010002;
    public static final int VERSION_1_4 = 0x00010004;
    public static final int VERSION_1_6 = 0x00010006;
    
    public static final int OK          = 0;     // no error
    public static final int ERR         = -1;    // generic error
    public static final int EDETACHED   = -2;    // thread detached from the VM
    public static final int EVERSION    = -3;    // JNI version error
    
    public static final int COMMIT      = 1;     // copy content, do not free buffer
    public static final int ABORT       = 2;     // free buffer w/o copying back
}