# Consuming es6 code from Clojurescript

It is possible to use the Google Closure compiler to write regular js code that 
consumes es6 code directly. Run `make es6` to see this in action (and view the Makefile for the actual command).

Since it is possible for the Closure compiler to do that, it should also be possible in theory to write 
Clojurescript code that refers to es6 modules as well. 

Run `make cljs` to see an attempt - and please suggest how to make it work if possible ;-)

There is a JS Modules feature in Clojurescript, see https://clojurescript.org/reference/javascript-module-support
but this is using foreign-libs, so would not work with shadow.

