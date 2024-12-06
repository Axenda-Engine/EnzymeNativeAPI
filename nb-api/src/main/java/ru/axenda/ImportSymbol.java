package ru.axenda;

public @interface ImportSymbol
{
    String library() default "";
    String name() default "";
}
