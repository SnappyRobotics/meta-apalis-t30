PROVIDES = "apalis-t30"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

FILES_${PN} = ""

#ALLOW_EMPTY_${PN} = "1"
 
S = "${THISDIR}/files"

do_install() {
    rsync -a --exclude=.svn ${THISDIR}/files/* ${D}
}

