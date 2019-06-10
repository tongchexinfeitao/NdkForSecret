
#设置工程支持的Cmake最小版本
cmake_minimum_required(VERSION 3.4.1)

set(CMAKE_LIBRARY_OUTPUT_DIRECTORY PROJECTSOURCEDIR/../jniLibs/{ANDROID_ABI})


#向CMake构建脚本添加源文件，并指定库名称和库类型
add_library( # 指定library名称，Cmake将创建一个名为libHelloJni.so文件
             HelloJni
             # 指定library类型
             SHARED
             # 源文件路径
             src/main/cpp/hello_jni.cpp
            )
# 指定头文件路径
include_directories(src/main/cpp/include/)
# 查找要引用DNK库，并将其路径保存到log-lib变量中
find_library(# 变量，用于保存DNK库(log)的路径
             log-lib
             # NDK库的名称，CMake将会根据名称定位到NDK库的log库
             log
            )
# 将log库关联到原生库
target_link_libraries( # Specifies the target library.
                       HelloJni
 
                       # Links the log library to the target library.
                       ${log-lib} )
