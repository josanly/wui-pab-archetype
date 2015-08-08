(function(){
	var app = angular.module('MyApp', []);
	
	app.controller('MyController', function(){
		this.data = example;
	});
	
	var example = {
			name: 'Web interface',
			description: 'designed with play, angular and bootstrap frameworks',
			button: true,
			hide: false
	}
})();
