var exp=require('express');

var app=exp();

app.listen(9000,function(){console.log("Connected...")})

app.get('/welcome',function(req,res){
	res.sendFile(__dirname+'/WelcomeAJAX.html');
});

app.get('/greet',function(req,res){
	var msg="Welcome to AJAX";
	console.log(msg);
	res.send(msg);
});

app.get('/*',function(req,res){
	res.send("Invalid Request....");
})