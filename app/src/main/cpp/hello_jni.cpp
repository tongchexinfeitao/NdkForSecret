

#include <jni.h>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_ndkforsecret_JniUtil_getMyName(JNIEnv *env, jclass type) {
    return env->NewStringUTF("123456789");
}

extern "C"
JNIEXPORT jint JNICALL
Java_com_example_ndkforsecret_JniUtil_add(JNIEnv *env, jclass type, jint first, jint second) {

    // TODO
    return first + second;
}