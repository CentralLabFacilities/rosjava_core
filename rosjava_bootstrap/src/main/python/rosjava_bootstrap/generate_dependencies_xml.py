#!/usr/bin/python

# Copyright (C) 2011 Google Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License"); you may not
# use this file except in compliance with the License. You may obtain a copy of
# the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
# WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
# License for the specific language governing permissions and limitations under
# the License.

__author__ = 'damonkohler@google.com (Damon Kohler)'

import os
import sys

import maven
import roslib


def _usage():
    print 'generate_dependencies_xml.py <package-name> [output-path]'
    sys.exit(os.EX_USAGE)


def main(argv):
    if len(argv) < 2:
        _usage()
    package_name = argv[1]
    rospack = roslib.packages.ROSPackages()
    if len(argv) > 2:
        with open(argv[2], 'w') as stream:
            maven.write_ant_maven_dependencies(rospack, package_name, stream)
    else:
        maven.write_ant_maven_dependencies(rospack, package_name)


if __name__ == '__main__':
    main(sys.argv)