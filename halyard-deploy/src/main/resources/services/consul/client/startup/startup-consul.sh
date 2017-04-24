#!/usr/bin/env bash

CONSUL_JOIN_FILE="/etc/consul.d/join.json"

echo "Configuring consul members for the $1 provider"

members=$(./$1/get-members.sh)

echo '{ "start_join": [' > $CONSUL_JOIN_FILE

echo \"${members[@]// /\",\"}\" >> $CONSUL_JOIN_FILE

echo '] }' >> $CONSUL_JOIN_FILE

service consul restart