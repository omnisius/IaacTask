#!/usr/bin/env bash

apt-get update
apt-get install -y maven
sudo apt-get install -y software-properties-common python-software-properties
echo oracle-java7-installer shared/accepted-oracle-license-v1-1 select true | sudo /usr/bin/debconf-set-selections
sudo add-apt-repository ppa:webupd8team/java -y
sudo apt-get install oracle-java7-installer
sudo apt-get install -y oracle-java7-set-default
if ! [ -L /var/www ]; then
  rm -rf /var/www
  ln -fs /vagrant/www /var/www
fi