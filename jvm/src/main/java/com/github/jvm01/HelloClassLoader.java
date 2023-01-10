package com.github.jvm01;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HelloClassLoader extends ClassLoader{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {


        Class<?> clz = new HelloClassLoader().findClass("Hello");
        Object obj = clz.newInstance();
        Method method = clz.getMethod("hello");
        method.invoke(obj);
    }

    public Class<?> findClass(String name) throws ClassNotFoundException {
        InputStream input = getResourceAsStream("Hello.xlass");
        try {
            byte[] bytes = IOUtils.toByteArray(input);
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) (255 - bytes[i]);
            }
            return super.defineClass(name,bytes,0,bytes.length);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
