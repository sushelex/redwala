

function from_focus() 
{
	var bg = document.getElementById("from");
	bg.style.background = "#00ffff";
}

function from_blur()
{
	var bg = document.getElementById("from");
	bg.style.background = "#99ffff";
}
function to_focus() 
{
	var bg = document.getElementById("to");
	bg.style.background = "#00ffff";
}

function to_blur()
{
	var bg = document.getElementById("to");
	bg.style.background = "#99ffff";
}
function date_focus() 
{
	var bg = document.getElementById("to");
	bg.style.background = "#00ffff";
}

function date_blur()
{
	var bg = document.getElementById("to");
	bg.style.background = "#99ffff";
}
function return_focus() 
{
	var bg = document.getElementById("to");
	bg.style.background = "#00ffff";
}

function return_blur()
{
	var bg = document.getElementById("to");
	bg.style.background = "#99ffff";
}
function reset()
{
	var from = document.getElementById("from");
	from.value = "ambikapur";
	var to = document.getElementById("to");
	to.value = "raipur";
	var date = document.getElementById("date");
	date.value = "";
	var return1 = document.getElementById("return");
	return1.value = "";
}