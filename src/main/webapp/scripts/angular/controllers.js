angular.module('AgoraUS', [])

	//FooterController
	.controller('FooterController', ['$scope', function($scope){
		$scope.date = new Date();
		$scope.footer = {name: "footer.html", url:"views/main/footer.html"};
	}]);