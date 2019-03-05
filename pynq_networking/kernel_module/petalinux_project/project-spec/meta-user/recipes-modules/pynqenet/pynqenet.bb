SUMMARY = "Recipe for  build an external pynqenet Linux kernel module"
SECTION = "PETALINUX/modules"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = "file://Makefile \
           file://pynqenet.c \
	   file://module_param_hex.h \
	   file://pynqenet.h \
	   file://xlnx_dma.h \
	   file://xlnx_irq.h \
	   file://COPYING \
          "

S = "${WORKDIR}"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.
