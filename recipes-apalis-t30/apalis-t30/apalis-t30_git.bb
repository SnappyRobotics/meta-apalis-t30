PROVIDES = "apalis-t30"
RPROVIDES_${PN} += "${PN}"
do_install() {
    rsync -a --exclude=.svn ${JTQ_SRC}/files/* ${D}
}
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"
