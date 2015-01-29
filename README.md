# timon

Timon is a central script repository for [Sarabi][]. At the time of making
this, Sarabi primarily is used to keep packages such as includes and plugins
up-to-date. My goal is to allow users to upload scripts to Timon and have it be
used to search for scripts by name, type, date modified, downloads, etc.

As a possible side project to this (Pumbaa), I would like to be able to easily
allow changes made to libraries such as [SRL-6][] to be used to compile all
scripts managed by Timon, so it will be very clear if any changes break
scripts, how many scripts they break, etc. Of course this will only include
compile-time errors, and no data about any runtime errors will be possible.

Ideally this will allow for easy and efficient integration with the current
[BuildBot for Simba](http://l0.lt).

[sarabi]: https://github.com/JohnPeel/Sarabi
[srl-6]: https://github.com/SRL/SRL-6

## Prerequisites

You will need [Leiningen][] 2.0.0 or above installed.

[leiningen]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein ring server

## License

Copyright © 2015 Ian Harris
