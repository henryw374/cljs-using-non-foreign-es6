# Consuming es6 code from Clojurescript

It is possible to use the Google Closure compiler to compile a `goog.module` that 
consumes es6 code directly. Run `make es6` to see this in action (and view the Makefile for the actual command).

Since it is possible for the Closure compiler to do that, it should also be possible in theory to write 
Clojurescript code that refers to es6 modules as well. It is possible for cljs to require a js file that is written with `goog.provide(..`.

Run `make cljs` to see an attempt to use es6 directly - and please suggest how to make it work if possible ;-)

UPDATE: This now uses a modified version of the cljs compiler and so far seems to be working

There is a JS Modules feature in Clojurescript, see https://clojurescript.org/reference/javascript-module-support
but this is using foreign-libs, so would not work with shadow.

