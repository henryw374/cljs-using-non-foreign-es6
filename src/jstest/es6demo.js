 const Foo = function(){ }
 
 var p = Foo.prototype;
 Foo.prototype.bar = function(){
 return new Date()+ "bar"
 }
 
 Foo.prototype.baz = function(){
  return new Date()+ "baz"
  }
 
 export {Foo}
