goog.module('mark.foolan')
//import * as foo from "./es6demo.js"
const es6demo = goog.require('jstest.es6demoexport')
const c = es6demo.Foo.bar()
 
console.log('hello ' + c );