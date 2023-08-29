##############################################################################
# CMake
##############################################################################

cmake_minimum_required(VERSION 2.8.3)
project(rosjava_core)

##############################################################################
# Catkin
##############################################################################

find_package(catkin REQUIRED 
    rosjava_build_tools
    geometry_msgs
    nav_msgs
    rosgraph_msgs
    sensor_msgs
    tf2_msgs
)

catkin_rosjava_setup(publish publishToMavenLocal)

# make sure messages get built first if genjava is enabled
add_dependencies(gradle-${PROJECT_NAME} ${catkin_EXPORTED_TARGETS})

catkin_package()

##############################################################################
# Installation
##############################################################################

