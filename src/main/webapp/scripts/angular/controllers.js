var agoraUSControllers = angular.module('AgoraUSControllers', ['ngRoute']);	

function showHeaderAndFooter($scope){
	$scope.date = new Date();
	$scope.footer = {name: "footer.html", url:"views/main/footer.html"};
	$scope.header = {name: "header.html", url:"views/main/header.html"};
}
//Header y Footer
agoraUSControllers.controller('MainController', ['$scope', '$route', '$routeParams', '$location', function($scope, $route, $routeParams, $location){
	$scope.$route = $route;
    $scope.$location = $location;
    $scope.$routeParams = $routeParams;
	showHeaderAndFooter($scope);
}]);

//Vista por defecto en index.html
agoraUSControllers.controller('MainViewController',['$scope','$routeParams',function($scope,$routeParams){
	showHeaderAndFooter($scope);
	$scope.params = $routeParams;
}]);

//Visualización de resultados
agoraUSControllers.controller('VisualizacionController', ['$scope','$routeParams', function($scope,$routeParams){
	showHeaderAndFooter($scope);
	$scope.encuestas = [];
	$scope.test= "funciona";
	$scope.params = $routeParams;
}]);