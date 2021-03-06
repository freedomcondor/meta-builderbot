SUMMARY = "Power-off Driver for the BuilderBot AVR Interface"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = "file://Makefile \
           file://bb-avr-poweroff.c \
           file://COPYING \
          "

S = "${WORKDIR}"

RPROVIDES_${PN} += "kernel-module-bb-avr-poweroff"
