angular.module('AgoraUS', [])

	//Header y Footer
	.controller('MainController', ['$scope', function($scope){
		$scope.date = new Date();
		$scope.footer = {name: "footer.html", url:"views/main/footer.html"};
		$scope.header = {name: "header.html", url:"views/main/header.html"};
	}]);