SUMMARY = "Apalis-t30 static files"
SECTION = "devel"

#PROVIDES = "apalis-t30"

LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI = "file://${BP}.tar.gz \
file://LICENSE \
"
inherit bin_package

