require nmrouter-image-minimal.bb

IMAGE_INSTALL_append = " \
    iperf \
    python3 \
    tibluetooth \
    ti-wl18xx-calibrator \
    linux-firmware-wl18xx \
    fct \
    nfs-utils \
    hydra \
    hydra-util \
    u-boot-fw-utils \
    "

inherit extrausers
EXTRA_USERS_PARAMS = "\
     useradd -o -u 0 -g 0 -p '' -s /usr/bin/fct.sh fct; \
     "
