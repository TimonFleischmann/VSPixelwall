const canvas = document.querySelector("#canvas");
const ctx = canvas.getContext("2d"); 
var red = document.querySelector("#red");
var colour;

red.addEventListener("click", function(ctx){
  colour = "red";
});

blue.addEventListener("click", function(ctx){
   colour = "blue";
});

black.addEventListener("click", function(ctx){
  colour = "black";
});

green.addEventListener("click", function(ctx){
  colour = "green";
});

yellow.addEventListener("click", function(ctx){
  colour = "yellow";
});

brown.addEventListener("click", function(ctx){
  colour = "brown";
});

grey.addEventListener("click", function(ctx){
  colour = "grey";
});

lila.addEventListener("click", function(ctx){
  colour = "violet";
});

canvas.addEventListener("click", function(e){
  var rect = e.target.getBoundingClientRect();
  var x = (e.clientX - rect.left) / (rect.right - rect.left) * canvas.width; //x position within the canvas.
  var y = (e.clientY - rect.top) / (rect.bottom - rect.top) * canvas.height //y position within the canvas.
  ctx.beginPath();
  ctx.arc(x,y,1,0,Math.PI*2,false);
  ctx.strokeStyle=colour;
  ctx.stroke();
});
