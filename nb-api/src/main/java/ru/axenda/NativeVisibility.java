package ru.axenda;

public @interface NativeVisibility 
{
    /**
     * Defines the visibility level of the native method
     */

    Visibility visibility() default Visibility.PUBLIC;
    
    /**
     * Defines the name of the native method
     */

    String name() default "";
    
    /**
     * Enum defining possible visibility levels
     */

    enum Visibility
    {
        HIDDEN,
        PUBLIC
    }
}