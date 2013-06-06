[Unit]
Description=Run the UDP -> TCL lighting daemon
After=syslog.target network.target 
#BindsTo=dev-spidev2.0.device
RequiresMountsFor=/dev/spidev2.0
# Requires=dev-spidev2.0.device
[Service]
Type=simple
ExecStart=/usr/bin/udplights/startUdplights.bash
#ExecStart=/home/root/udplights/tallwide size 32 11 leds 200 port 54321 zone size 22 5 offset 100 flipX zone size 10 10 offset 0 origin 22 1 flipY flipX vertical > /dev/null 
[Install]
WantedBy=multi-user.target
