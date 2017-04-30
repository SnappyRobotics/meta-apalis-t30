SUMMARY = "Apalis-t30 static files"
SECTION = "devel"

#PROVIDES = "apalis-t30"

LICENSE = "CLOSED"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI = "file://${BP}.tar.gz"

inherit bin_package

