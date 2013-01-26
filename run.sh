#! /usr/bin/env sh

if [ ! -d lib/play-2.0.4 ] ; then
    wget -P lib http://download.playframework.org/releases/play-2.0.4.zip
    cd lib;
    unzip -qq play-2.0.4.zip;
    cd ..;
    rm lib/play-2.0.4.zip;
fi
alias play2='../lib/play-2.0.4/play';
rm korData.db kor_web/korData.db;
cp -ru data kor_web/;
cd kor_web;
play2 run;
cd ..;
